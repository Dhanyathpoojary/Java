import java.util.Scanner;

public class my{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<11;i++)
        {
         int product=1;
         product=n*i;
         System.out.println("2*" +i+ "=" + product);
        }
    }
}