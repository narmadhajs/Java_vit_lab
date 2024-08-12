class Vehicle{
    protected String brand="Ford";
    public void honk(){
        System.out.println("Tuut,Tuut!");
    }
   
}
class Car extends Vehicle{
    private String modeName="Mustang";
    public static void main(String[] args){
        Car myFastCar=new Car();
        myFastCar.honk();
    }
}
import java.util.*;
class Main{
    int x;
    public Main(int y){
        x=y;
       
    }
public static void main(String[] args){
   Main myobj=new Main(5);
   System.out.println(myobj.x);
    }
}
import java.util.*;
class Main{
    int x;
String j;
    public Main(int y,String h){
        x=y;
        j=h;
    }
public static void main(String[] args){
   Main myobj=new Main(5,"hello");
   System.out.println(myobj.x);
    System.out.println(myobj.j);
}
}
class Animal{
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}
class Pig extends Animal{
    public void animalSound(){
        System.out.println(" The Pig says: wee wee");
    }
}
class Dog extends Animal{
    public void animalSound(){
        System.out.println("The dog says: Bow wow");
    }
}
class main{
    public static void main(String[] args){
        Animal myAnimal=new Animal();
        Animal myPig=new Pig();
        Animal myDog=new Dog();
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
