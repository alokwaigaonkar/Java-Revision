public class Dog extends Animal {
    void eat(){
        System.out.println("Dog Eating");
    }

}
class Puppy extends Dog{

    void eat(){
        System.out.println("Puppy Eating");
    }
    public static void main(String [] args){
        Animal animal = new Puppy();
        Dog dog = (Dog) animal;
        dog.eat();
    }
}
