//1
import java.util.Scanner;
class samplee {
public static void main(String[] args){
int a,b;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
String[][] arr=new String[a][a];
    for(int i=0;i<a;i++){
      for(int j=0;j<a;j++){
        if(i==0 || j==0||i==(a-1)||j==(a-1)){
          arr[i][j]="*";
        }
        else{
          arr[i][j]=" ";
        }
     
      }
    }
    for(int k=0;k<a;k++){
      for(int i=0;i<a;i++){
        System.out.print(arr[k][i]);
      }
      System.out.println("");
    }
}
}
//2
class samplee{
  
  static void findArmstrong(int low, int high)
  {
    for (int i = low + 1; i < high; ++i) {
  
      int x = i;
      int n = 0;
      while (x != 0) {
        x /= 10;
        ++n;
      }
  
    
      int pow_sum = 0; 
      x = i;
      while (x != 0) {
        int digit = x % 10;
        pow_sum += Math.pow(digit, n);
        x /= 10;
      }
  
    
      if (pow_sum == i) 
        System.out.print(i + " ");   
    }
  }
  
  public static void main(String args[])
  {
    int num1 = 80;
    int num2 = 400;
    findArmstrong(num1, num2);
    System.out.println();
  }
}
//3
 import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int m=1;
        for (int i = 1; i < Math.max(a, b); i++) {
            if(a%i==0&&b%i==0){
                m=m*i;
            }
        }
        System.out.print(m+" ");
    }
}

