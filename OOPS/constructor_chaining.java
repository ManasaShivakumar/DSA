public class constructor_chaining {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
    
}
class Student{
    String name;
    int roll;
    //constructor 1
    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
        System.out.println(name+","+roll);
    }
    //constructor 2
    Student() {
        this("manasa", 134);//calls constructor 1
        System.out.println("Default");
    }
}
