
import java.util.Scanner;
class Armstrong
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
int num =sc.nextInt();
int orginal_num=num;
int result=0;
 while(num!=0){
 int digit=num%10;
 result+=digit*digit*digit;
 num=num/10;
 }
 if(result==orginal_num){
 System.out.println("this is Armstrong");}
 else{
 System.out.println("not a Armstrong");}


}
}