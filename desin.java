import java.util.*;
public class desin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the number of rows n:");
        int n=sc.nextInt();
        System.out.println(" enter the number of columns m:");
        int m=sc.nextInt();
        for (int i = 0; i < n; i++) {          // outer loop → 5 rows
            for (int j = 1; j <= m; j++) {     // inner loop → 5 stars per row
                System.out.print("* ");
            }
            System.out.println();              // move to next line
        }
    }
}
