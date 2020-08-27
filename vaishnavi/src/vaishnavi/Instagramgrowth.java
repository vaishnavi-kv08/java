package vaishnavi;
import java.util.Scanner;

public class Instagramgrowth{
	public static void main(String[] args){
		//a=number of followers currently
		//b=number of unfollowers
		//c=number of posts per month
		//r=rate of growth
		//t=time
		//r=((a^1/t-b)*c)*100
		System.out.println("Enter Time interval in days(t)");
		Scanner scan1=new Scanner(System.in);//To get input from user
		float t=scan1.nextFloat();
		System.out.println("Enter current number of follwers");
		Scanner scan2 =new Scanner(System.in);//To get input from user
		float a=scan2.nextFloat();
		System.out.println("Enter number of unfollwers");
		Scanner scan3=new Scanner(System.in);//To get input from user
		float b=scan3.nextFloat();
		System.out.println("Enter number of posts per month");
		Scanner scan4=new Scanner(System.in);//To get input from user
		int c=scan4.nextInt();
		System.out.println("Growth rate(r) in percentage ");//Displays growth rate in percentage
		System.out.println(calculate(t,a,b,c));//calling calculate funtion
	}
	public static double calculate(float t,float a,float b,int c){
		double T=1/t;//assiging 1/t to T
		double A=b/a;//unfollowers/followers=A
		double res=Math.pow(A, T);//calculating
		double r=Math.abs((res-1)*100);//formulae
		return r;//returing the result
	}

}
