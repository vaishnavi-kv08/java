


package vaishnavi;
import java.util.Scanner;
public class Youtubegrowthcalculator 
{
public static void main(String[] args)
{
	//a=number of subscribers
	//r=rate og growth
	//x=time intervals in days
	//y=data
	System.out.println("*********counting subscribers********");
	System.out.println("enter number of subscribers you have(a): ");//a=number of subscribers
	Scanner scan=new Scanner(System.in);//To get input from user
	int a= scan.nextInt();
	System.out.println("Enter your growth rate(r):");//r=growth rate
	double r= scan.nextDouble();
	System.out.println("Enter time intervals in days(x):");
	int x=scan.nextInt();
	System.out.println(calculate(a,r,x));//calling calculate funtion	
}
public static int calculate(int a,double r,int x)
{
	return(int)(a*Math.pow((1+r),x));//calculating
}
}
