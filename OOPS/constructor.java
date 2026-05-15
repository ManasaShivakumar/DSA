public class constructor {
    public static void main(String[] args) {        
        Student s1 = new Student("Manasa",  134);  
        s1.marks[0] = 100;
        s1.marks[1] = 89;
        s1.marks[2] = 99;    
        Student s2 = new Student(s1);
        System.out.println(s2.name);
        System.out.println(s2.roll);
        s1.marks[1] = 98;
        for(int i=0; i<3; i++) {
            System.out.println(s2.marks[i]);
        }       
    } 
}
class Student {
    String name;
    int roll;
    int marks[];
    //Shallow copy
    // Student(Student s1) {  
    //     marks = new int[3];      
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;       
    // }
    //Deep  copy
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];            
        }
    }
    Student(String name, int roll) {  
        marks = new int[3]; 
        this.name = name; 
        this.roll = roll;            
    }
   
}
   
