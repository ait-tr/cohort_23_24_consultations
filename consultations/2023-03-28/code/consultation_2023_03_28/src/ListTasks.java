import java.util.ArrayList;
import java.util.List;

public class ListTasks {

    // Есть два листа стрингов. Написать метод, обьединяющий их в один.

    public List<String> joinTwoLists(List<String>list1, List<String>list2){
        List<String> joined =new ArrayList<>(list1.size() +list2.size());
        joined.addAll(list1);
        joined.addAll(list2);

        return joined;
    }
}
