import java.util.Set;

public class NonUniqueSetTest {
    public static void main(String[] args) {
        Set<String> nonUniqueSet = new NonuniqueHashSet<String>();
        nonUniqueSet.add("first");
        nonUniqueSet.add("first");
        nonUniqueSet.add("second");
        nonUniqueSet.add("first");
        System.out.println(nonUniqueSet);
        int count = ((NonuniqueHashSet) nonUniqueSet).count("first");
        System.out.println(count);
        nonUniqueSet.remove("first");
        System.out.println(nonUniqueSet);
        count = ((NonuniqueHashSet) nonUniqueSet).count("first");
        System.out.println(count);
    }
}
