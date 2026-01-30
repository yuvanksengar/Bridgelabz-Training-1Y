import java.util.Scanner;
class threenumber{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
int number1=sc.nextInt();
System.out.println("enter a number");
int number2=sc.nextInt();
System.out.println("enter a number");
int number3=sc.nextInt();

if(number1<=number2||number1<=number3){
	System.out.println("first number is smallest");
}
else{
	System.out.println("not smallest number");
}
}
}