import java.util.*;
public class spaxe{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of spaces you want");
        int n=sc.nextInt();
        switch(n){
            case 1:
            System.out.println("hello ");
            break;
            case 2:
            System.out.println("nameste ");
             break;
             case 3:
             System.out.println("bonjour ");
              break;
              case 4:
              System.out.println("hola ");
               break;
               case 5:
               System.out.println("salaam ");
                 break;
                 default:
                 System.out.println("invalid input");
            break;
        }
    }
}