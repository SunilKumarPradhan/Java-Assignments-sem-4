import java.util.LinkedHashSet;

class HashSetLinked {
    public static void main(String[] args) {
       
        LinkedHashSet<Double> doubleSet = new LinkedHashSet<>();

        doubleSet.add(3.14);
        doubleSet.add(1.618);
        doubleSet.add(2.718);
        doubleSet.add(0.577);

        System.out.println("LinkedHashSet Contents:");
        for (Double element : doubleSet) {
            System.out.println(element);
        }
    }
}
