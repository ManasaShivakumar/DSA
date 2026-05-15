public class Inheritance {
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.breed = "Golden Retriever";
        d1.color = "Golden orange";
        d1.sound = "Bow Bow";
        d1.eats("pedigree");
        d1.child = 5;
        d1.legs = 4;
        d1.type("young living one");
        System.out.println(d1.breed);
        System.out.println(d1.color);
        System.out.println(d1.sound);
        System.out.println(d1.child);
        System.out.println(d1.legs);
        Fish shark = new Fish();
        shark.color = "Grey";
        shark.sound = "Beep";
        shark.eats("small fishes");
        shark.fins = 2;
        shark.function();
        System.out.println(shark.color);       
        System.out.println(shark.sound);  
        System.out.println(shark.fins);  
    }    
}
//parent/superclass/base class
class Animal {
    String color;
    String sound;
    void eats(String food) {
        System.out.println(food);
    }
}
class Mammals extends Animal{
    int child;
    int legs;
    void type(String birth){
        System.out.println(birth);
    }
}
class Dog extends Mammals {
    String breed;
}
class Fish extends Animal {
    int fins;
    void function() {
        System.out.println("Swimm");
    }
}