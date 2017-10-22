import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;

public class ColaTest{




    /*public static void main(String[] args)
    {
            System.out.println("Hola");
    }*/



    @Test
    public void testCuaBuida() {
        ColaImpl<int> p = new ColaImpl<int>(10);
        //System.out.println("Hola");
        // assert statements

        assertEquals("Hola", 0, p.size(), 0);
    }


}