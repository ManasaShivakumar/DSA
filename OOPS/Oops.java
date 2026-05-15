public class Oops {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setcolor("Blue");
        //p1.color = "Blue";
        System.out.println(p1.getcolor());
        p1.settip(5);
        //p1.tip = 5;
        System.out.println(p1.gettip());
        
        // student s1 = new student();
        // s1.name = "Manasa";
        // s1.age = 22;
        // s1.calcPercent(84,85,91);
        // System.out.println(s1.name);
        // System.out.println(s1.age);
        // System.out.println(s1.percentage);
        BankAccount myacc = new BankAccount();
        myacc.username = "Manasa";
        myacc.setPassword("1345vghfdfg");
        System.out.println(myacc.username); 
        System.out.println(myacc.getpassword());      
    }
}
class pen {
    private String color;
    private int tip;

    String getcolor(){
        return color;
    }
    
    int gettip() {
        return tip;
    }

    void setcolor(String color) {
        this.color = color;
    }

    void settip( int tip) {
        this.tip = tip;
    }
}
class student {
    String name;
    int age;
    float percentage;

    void calcPercent(int p, int c, int m){
        percentage = (p+c+m) / 3;
    }
}
class BankAccount{
    public String username;
    private String password;

    void setPassword(String pwd) {
        password = pwd;
    }

    String getpassword() {
        return password;
    }

}