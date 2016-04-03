import java.util.Scanner;
public class ReverseDigits{
    public static void main(String[] args){
        int rem,rev=0;
        System.out.println("Enter a Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int copy=n;
	while(n!=0)
        {
          rem=n%10;
	  rev=rev*10+rem;
	  n=n/10;
 	  
            
        }
        System.out.println("The reverse is "+rev);
    }
}
