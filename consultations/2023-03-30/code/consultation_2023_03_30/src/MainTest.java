import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main m ;

    @BeforeEach
    public void init(){
        m = new Main();
    }

    @Test
    public void isWithoutMoreThanReguired_test_empty(){
        List<Integer>expected = Arrays.asList();
        List<Integer>actual = Arrays.asList();

        assertEquals(expected,m.isWithoutMoreThanRequired(actual,4));
    }


    @Test
    public void isWithoutMoreThanReguired_test_one(){
        List<Integer>expected = Arrays.asList(1);
        List<Integer>actual = Arrays.asList(1);

        assertEquals(expected,m.isWithoutMoreThanRequired(actual,4));
    }


    @Test
    public void isWithoutMoreThanReguired_test_noSuchElements(){
        List<Integer>expected = Arrays.asList();
        List<Integer>actual = Arrays.asList(3,1,8,2);

        assertEquals(expected,m.isWithoutMoreThanRequired(actual,0));
    }


    @Test
    public void isWithoutMoreThanReguired_test(){
        List<Integer>expected = Arrays.asList(1,5,3,2);
        List<Integer>actual = Arrays.asList(1,5, 3,9,2);

        assertEquals(expected,m.isWithoutMoreThanRequired(actual,8));
    }

}