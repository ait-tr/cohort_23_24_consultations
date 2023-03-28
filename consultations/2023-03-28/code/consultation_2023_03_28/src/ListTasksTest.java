import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListTasksTest {

    ListTasks listTasks = new ListTasks();

    @Test
    public void joinTwoLists_test_empty(){
        assertEquals(Arrays.asList(),listTasks.joinTwoLists(Arrays.asList(),Arrays.asList()));
    }


    @Test
    public void joinTwoLists_test_one_element(){
        assertEquals(Arrays.asList("aaa","bbb"),listTasks.joinTwoLists(Arrays.asList("aaa"),Arrays.asList("bbb")));
    }

    @Test
    public void joinTwoLists_test_normal(){
        List<String>actual1 = Arrays.asList("John","Maria","Amalia");
        List<String>actual2 = Arrays.asList("Add1","Add2");

        List<String>expected = Arrays.asList("John","Maria","Amalia","Add1","Add2");
                         //   listTasks.
        assertEquals(expected,listTasks.joinTwoLists(actual1,actual2));
    }

}