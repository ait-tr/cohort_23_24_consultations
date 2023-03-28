import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxWithTestsTest {

    private MaxWithTests m = new MaxWithTests();

    @Test
    public void zero_elt_test(){
        int[] ints = {};

    assertEquals(-1,m.max(ints));
    }


    @Test
    public void one_elt_test(){
        int[] ints ={2};

        assertEquals(2,m.max(ints));
    }


    @Test
    public void two_elt_test(){
        int[] ints ={2,3};

        assertEquals(3,m.max(ints));
    }


    @Test
    public void many_elt_test_middle(){
        int[] ints ={2,3,4,0,9,8,3,8};

        assertEquals(9,m.max(ints));
    }


    @Test
    public void many_elt_test_first(){
        int[] ints ={10,2,3,4,0,9,8,3,8};

        assertEquals(10,m.max(ints));
    }


    @Test
    public void many_elt_test_last(){
        int[] ints ={2,3,4,0,9,8,3,8,10};

        assertEquals(10,m.max(ints));
    }




}