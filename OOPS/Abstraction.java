public class Abstraction {
    public static void main(String[] args){
       mustang h1 = new mustang();
    }
    
}
abstract class Animal{
    String color;
    Animal() {
        System.out.println("Animal constructor is called");
    }
    void eats() {
        System.out.println("Eats food");
    }
    abstract void walk();
}
class horse extends Animal{
    horse() {
        System.out.println("horse constructor is called");
    }

    void change() {
        color = "Grey";
    }
    void walk() {
        System.out.println("walk with 4 legs");
    }
}
class mustang extends horse {
    mustang() {
        System.out.println("Mustang constructor is called");
    }
}
class chicken extends Animal{
    void walk() {
        System.out.println("walks with 2 legs");
    }
}
