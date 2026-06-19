public class keywords {
    public static void main(String[] args) {
        // outer.inner a = new outer.inner();
        // a.display();   
        // Student.schoolname = "krcrs";
        // System.out.println(Student.schoolname);   
        horse h1 = new horse();
        System.out.println(h1.color);
    }    
}
class Student {
    String name;
    int roll;
    static String schoolname;    
    static int percentge(int math, int phy, int chem){
        return (math+phy+chem)/3;
    }
}
class sumne {
    static{
        System.out.println("Static block executed");
    }

}
class outer{
    static int num = 100;
    static class inner{
        void display() {
            System.out.println("number ="+num);
        }
    }
}
class Animal{
    String color;
    Animal() {
        System.out.println("Animal is called");
    }
}
class horse extends Animal{    
    horse() {
        super.color = "brown";        
        System.out.println("horse is cslled");
    }
}