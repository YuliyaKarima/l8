import java.util.List;

public class ImmutableListTest {
    public static void main(String[] args) {
        CustomImmutableList<Integer> immutableList
                = new CustomImmutableList<>(1, 2, 3, 4, 5, 6, 7);
        for(int i = 0; i<20; i++){
            System.out.print(immutableList.next() + " ");
        }
        System.out.println();
        System.out.println(immutableList);
        immutableList.add(9);
    }
}
