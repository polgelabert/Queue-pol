import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.log4j.Logger;

public class ColaTest{
    final static Logger log =  Logger.getLogger(ColaTest.class.getName());
    ColaImpl<Integer> p;

    @Before
    public void crearCola(){
        org.apache.log4j.BasicConfigurator.configure();
        this.p = new ColaImpl<Integer>(10);
        //log.info("Es crea la cola");
    }
    @Test (expected = ColaVaciaException.class)
    public void testCuaBuida() throws ColaVaciaException{
        //ColaImpl<Integer> p = new ColaImpl<Integer>(10);
        // assert statement
        //log.info("comprobo que estigui buida");
        assertEquals("Està buida?", 0, p.size(), 0);
        p.pop();
    }
    @Test
    public void testIntroduirObjecte() throws ColaLlenaException{
        // assert statement
        p.push(1);
        assertEquals("Introduïr objecte", 1, p.size(), 0);
    }
    @Test (expected = ColaLlenaException.class)
    public void testCuaPlena() throws ColaLlenaException{
        // assert statement
        p.push(1); p.push(1); p.push(1); p.push(1); p.push(1);
        p.push(1); p.push(1); p.push(1); p.push(1); p.push(1);
        assertEquals("Està plena?", 10, p.size(), 0);
        p.push(1);
    }

}