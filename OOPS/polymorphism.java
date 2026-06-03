public class polymorphism {
    public static void main(String[] args){
        // calculator calc = new calculator();
        // System.out.println(calc.sum(12, 14));
        // System.out.println(calc.sum((float)1.5, (float)5.9));
        // System.out.println(calc.sum(23,67,90));
        Deer d = new Deer();
        d.eats();
    }    
}
class Animal{
    void eats() {
        System.out.println("Eats anything");
    }
}
class Deer extends Animal {
    void eats() {
        System.out.println("Eats only grass");
    }
}
class calculator{
    int sum(int a, int b){
        return a + b;
    }
    float sum(float a, float b){
        return a + b;        
    }
    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
