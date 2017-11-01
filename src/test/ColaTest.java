import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;


public class ColaTest{
    final static Logger log =  Logger.getLogger(ColaTest.class.getName());
    ColaImpl<Integer> p;
    ColaImpl<String> s;


    @Before
    public void crearCola(){

        this.p = new ColaImpl<Integer>(10);
        this.s = new ColaImpl<String>(5);
    }

    @Test
    public void testCuaBuida() throws ColaVaciaException {

        Assertions.assertThrows(ColaVaciaException.class, () -> { p.pop() ;});
    }

    @Test
    public void testCuaPlena() throws ColaLlenaException{

        for(int i=0; i<10; i++){
            p.push(i);
        }
        Assertions.assertThrows(ColaLlenaException.class, () -> { p.push(10); });

    }

    @Test
    public void testIntroduirTreureObjecte() throws ColaLlenaException, ColaVaciaException {

        Assertions.assertThrows(ColaVaciaException.class, () -> { p.pop() ;});
        p.push(1);
        p.push(2);
        p.push(3);

        assertEquals(3, p.size());
        p.pop();

        assertTrue(p.contains(2));
        assertTrue(p.contains(3));
        assertFalse(p.contains(1));
        assertEquals(2, p.size());
    }

    @Test
    public void testCuaString() throws ColaLlenaException, ColaVaciaException {
        s.push("1r name");
        s.push("2n name");
        s.push("3r name");

        assertTrue(s.contains("1r name"));
        s.pop();
        assertTrue(s.contains("2n name"));
        assertTrue(s.contains("3r name"));
        assertFalse(s.contains("1r name"));

        s.pop();
        s.pop();
        Assertions.assertThrows(ColaVaciaException.class, () -> { p.pop() ;});
    }
}