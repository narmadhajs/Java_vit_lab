//Basic
//15.07
public class Main
{
public static void main(String[]args)
{
System.out.printIn("Hello World");
}
}

17.07
public class Main
{
public static void main(String[] args)
{
int myNum=15;  //also final = final int myNUm=15;
myNum=20;
System.out.println(myNum);
}
}

public class Main
{
public static void main(String[] args)
{
int myInt=9;
double myDouble=myInt; //Automatic casting:int to double
System.out.println(myInt);
System.out.println(myDouble);
}
}

public class Main
{
public static void main(String[] args)
{
double myDouble=9.78d;
int myInt=(int)myDouble; //Explicit casting:double to int
System.out.println(myDouble);
System.out.println(myInt);
}
}


public class Main
{
public static void main(String[] args)
{
int sum1=100+50;
int sum2=sum1+250;
int sum3=sum2+sum2;
System.out.println(sum1);
System.out.println(sum2);
System.out.println(sum3);
}
}

public class Main
{
public static void main(String[] args)
{
int x,y;
x=20;
y=(x==1)?61:90;
System.out.println("Value of y is:"+y);
y=(x==20)?61:90;
System.out.println("Value of y is:"+y);
}
}

public class Main
{
public static void main(String[] args)
{
String txt="Introduction of the class";
System.out.println("The length of the txt string is "+txt.length());
}
}

public class Main
{
public static void main(String[] args)
{
String txt="Introduction Of The Class";
System.out.println("Upper class: "+txt.toUpperCase());
System.out.println("Lower class: "+txt.toLowerCase());
}
}

public class Main
{
public static void main(String[] args)
{
String txt="Pealse locate where 'locate' occurs";//Finding index
System.out.println(txt.indexOf("locate"));
}
}

//22.07.2024
//BOOLEAN
public class Main
{
public static void main(String[] args)
{
boolean isJavaFun=true;
boolean isFishTasty=false;
System.out.println(isJavaFun);
System.out.println(isFishTasty);
}
} 

public class Main
{
public static void main(String[] args)
{
int x=10;
int y=9;
System.out.println(x>y);//returns true bc 10 is higher than 9

}
} 


public class Main
{
public static void main(String[] args)
{
int x=10;
int y=9;
System.out.println(10>9);//returns true bc 10 is higher than 9

}
} 


public class Main
{
public static void main(String[] args)
{
int x=10;
int y=15;
System.out.println(10==15);//returns flase bc 10 is not equal to 15

}
}

public class Main
{
public static void main(String[] args)
{
if(20>18){
System.out.println("20 is greater than 18");
}
}
} 

public class Main
{
public static void main(String[] args)
{
int time=20;
if(time<18){
System.out.println("Good day.");
}
else{
System.out.println("Good evening");
}
}
}  

public class Main
{
public static void main(String[] args)
{
int day=4;
switch(day){
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wednesday");
break;
case 4:
System.out.println("Thursday");
break;
case 5:
System.out.println("Friday");
break;
case 6:
System.out.println("Saturday");
break;
case 7:
System.out.println("Sunday");
break;
}
}
}  

public class Main
{
public static void main(String[] args)
{
int i=0;
while(i<5){
System.out.println(i);
i++;
}
}
}  

public class Main
{
public static void main(String[] args)
{
int i=0;
do{
System.out.println(i);
i++;
}
while(i<5);javac 
}
}  

public class Main
{
public static void main(String[] args)
{
for(int i=0;i<5;i++)
{
System.out.println(i);
}
}
}  

public class Main
{
public static void main(String[] args)
{
String[]cars={"Volvo","BMW","Ford","Mazda"};
for(String i:cars)
{
System.out.println(i);
}
}
}  


public class Main
{
public static void main(String[] args)
{
for(int i=0;i<10;i++)                                        //with continue
{
if(i==4)
{
continue;
}
System.out.println(i);
}
}
}  

public class Main
{
public static void main(String[] args)
{
for(int i=0;i<10;i++)                                            //with break
{
if(i==4)
{
break;
}
System.out.println(i);
}
}
}  

import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
Scanner myObj=new Scanner(System.in);
String userName;
System.out.println("Enter username");
userName=myObj.nextLine();
System.out.println("Username is "+userName);
}
}

//24.07.2024
//String Classes

public class Main
{
public static void main(String[] args)
{
char[]helloArrjavac ay={'h','e','l','l','o','.'};
String helloString=new String(helloArray);
System.out.println(helloString);
}
}


import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
double n1,n2,result;                                 
Scanner input=new Scanner(System.in);
System.out.println("Choose the operator");
operator=input.next().charAt(0);
System.out.println("Enter the First number");
n1=input.nextDouble();
System.out.println("Enter the Second number");
n2=input.nextDouble();
switch(operator){
case '+':
result=n1+n2;
System.out.println(result);
break;
case '-':
result=n1-n2;
System.out.println(result);
break;
case '*':
result=n1*n2;
System.out.println(result);
break;
case '/':
result=n1/n2;
System.out.println(result);
break;
}
input.close();
}
}
