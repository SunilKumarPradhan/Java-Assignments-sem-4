import java.util.*;

class Student{
    String name;
    int age;
    int mark;
    
    Student(String name, int age, int mark){
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
    
    public String toString(){
        return "Name: " + name + " Age: " + age + " Mark: " + mark;
    }
}

class StudentLinkedList{
    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<>();
        list.add(new Student("A", 20, 90));
        list.add(new Student("B", 21, 80));
        list.add(new Student("C", 22, 70));
       
        System.out.println("List: " + list);
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the student to search: ");
        String name = sc.next();

        System.out.println("Enter the age of the student to search: ");
        int age = sc.nextInt();

        System.out.println("Enter the mark of the student to search: ");
        int mark = sc.nextInt();

        Student s = new Student(name, age, mark);
        if(list.contains(s)){
            System.out.println("Student found");
        }
        else{
            System.out.println("Student not found");
        }

        System.out.println("Enter the name of the student to remove: ");
        name = sc.next();

        System.out.println("Enter the age of the student to remove: ");
        age = sc.nextInt();

        System.out.println("Enter the mark of the student to remove: ");
        mark = sc.nextInt();
        
        s = new Student(name, age, mark);
        list.remove(s);
        System.out.println("List: " + list);
        System.out.println("Number of students in the list: " + list.size());
    }
}
