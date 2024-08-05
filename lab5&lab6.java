
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
