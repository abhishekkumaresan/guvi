import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        System.out.println("Enter a Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
	System.out.println("The Factorial is "+n);
        int  fact=1;
	System.out.println("The Factorial is "+fact);
        for(int i=1;i<=n;i++)
        {
System.out.println(i);
            fact=fact*i;
        }
        System.out.println("The Factorial is "+fact);
    }
}
