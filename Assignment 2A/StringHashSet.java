import java.util.HashSet;

class StringHashSetE {
    public static void main(String[] args) {
     
        HashSet<String> stringSet = new HashSet<>();

   
        stringSet.add("Sunil");
        stringSet.add("Subrat");
        stringSet.add("Jiteen");
        stringSet.add("Shantanu");


        System.out.println("HashSet Contents:");
        for (String element : stringSet) {
            System.out.println(element);
        }
    }
}
