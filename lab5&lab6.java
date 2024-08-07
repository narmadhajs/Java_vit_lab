
class Student{
    public String name;
    Student(String name){
        this.name=name;
    }
    public String toString(){
        return name;
    }
    }
     class ex2{
    public static void main(String[] args){
        Student[] myStudent=new Student[]{
            new Student("Dharma"),new Student("sanvi"),new Student("Rupa"),new Student("Ajay")};
            for(Student m:myStudent){
                System.out.println(m);
            }
        }
   
}
class Student{

    public static void main(String[] args){
        int[] arr=new int[5];
            arr[0]=10;
            arr[1]=20;
            arr[2]=30;
            arr[3]=40;
          System.out.println("Trying to access elements outside the size of array");
                System.out.println(arr[5]);
       
    }
}
class Student{

    public static void main(String[] args){
        int[][] arr=new int[5][5];
            arr[0][0]=10;
         
                System.out.println(arr[0][0]);
       
    }
}
class Student{

    public static void main(String[] args){
        int[][][] arr=new int[5][5][5];
            arr[0][0][0]=10;
         
                System.out.println(arr[0][0][0]);
       
    }
}
class Student{
    public static int sum(int arr[]){
         int sum=0;
        for(int i=0;i<arr.length;i++){
           
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
               System.out.println(sum(arr));
       
    }
}
class Student{
    public static int[] m1(){
        return new int[]{1,2,3};
    }
    public static void main(String[] args){
         int arr[]=m1();
        for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]+" ");
           
        }
    }
}
class Student{
    
    public static void main(String[] args){
         int intarr[]=new int[6];
         byte bytearr[]=new byte[3];
         short shortsArray[]=new short[3];
         String str[]=new String[5]; 
     
           System.out.println(intarr.getClass());
              System.out.println(bytearr.getClass());
                 System.out.println(shortsArray.getClass());
        }
    }

class Student{
    
    public static void main(String[] args){
         int intarr[]=new int[6];
         int cloneArray[]=intarr.clone();
         System.out.println(intarr==cloneArray);
         for(int i=0;i<cloneArray.length;i++){
             System.out.println(cloneArray[i]+" ");
         }
        }
    }
class Student{
    
    public static void main(String[] args){
         int intarr[][]={{1,2,3},{4,5}};
         int cloneArray[][]=intarr.clone();
         System.out.println(intarr==cloneArray);
        
             System.out.println(intarr[0]==cloneArray[0]);
             System.out.println(intarr[1]==cloneArray[1]);
         
         
        }
    }
//oops
import java.util.*;
    public class Main{
        int x=5;
    
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        Main obj=new Main();
        System.out.println(obj.x);
        
        
    }
}
import java.util.*;
    public class Main{
        int x=5;
    public static void main(String[] args){
        Main obj=new Main();
        Main obj1=new Main();
        Main obj2=new Main();
        System.out.println(obj.x);
        
         System.out.println(obj1.x);
        
    }
    
}
import java.util.*;
public class Main{
        int x=5;
    
}
 class Main2{
     public static void main(String[] args){
        Main obj=new Main();
        Main obj1=new Main();
        Main obj2=new Main();
        System.out.println(obj.x);
        
         System.out.println(obj1.x);
        
    }
}
import java.util.*;
public class Main{
        int x;
}
 class Main2{
     public static void main(String[] args){
        Main obj=new Main();
        obj.x=40;
        System.out.println(obj.x);
        
    }
}
import java.util.*;
public class Main{
        int x=10;
}
 class Main2{
     public static void main(String[] args){
        Main obj=new Main();
        obj.x=40;
        System.out.println(obj.x);
        
    }
}
import java.util.*;
public class Main{
        final int x=10;
}
 class Main2{
     public static void main(String[] args){
        Main obj=new Main();
        obj.x=40;
        System.out.println(obj.x);
        
    }
}
import java.util.*;
public class Main{
         int x=10;
}
 class Main2{
     public static void main(String[] args){
        
        Main obj=new Main();
        Main obj1=new Main();
        obj1.x=40;
        System.out.println(obj1.x);
        System.out.println(obj.x);
 }
}

import java.util.*;
public class Main{
    String fname="John";
    String Iname="Doe";
    
         int age=10;
}
 class Main2{
     public static void main(String[] args){
        
        Main obj=new Main();
        System.out.println("Name:"+obj.fname+" "+obj.Iname);
    System.out.println("Age: "+obj.age);
}
}
import java.util.*;
public class Main{
    static void hello(){
        System.out.println("Hello World!");
    }
}
class Main2{
    public static void main(String[] args){
        
        Main obj=new Main();
        obj.hello();
    }
}
import java.util.*;
public class Main{
    
     public void fullThrottle(){
        System.out.println("The car is going as fast as it can..");
    }
    public void speed(int maxSpeed){
         System.out.println("MaxSpeed:"+maxSpeed);
    }
}
class Main2{
    public static void main(String[] args){
        Main obj=new Main();
        obj.fullThrottle();
        obj.speed(120);
}
    }

import java.util.*;
public class Main{
    
     int x;
     public Main(){
         x=5;
         
     }
}
class Main2{
    public static void main(String[] args){
        Main obj=new Main();
       System.out.println(obj.x);
    }
}
        
