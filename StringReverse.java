import java.util.Scanner; 
public class StringReverse{

     public static void main(String []args){
        System.out.println("Enter a String");
        Scanner sc=new Scanner(System.in);
        StringBuffer sb=new StringBuffer(sc.next());
        System.out.println(sb.reverse());
     }
}
