public class design {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {          // outer loop → 5 rows
            for (int j = 0; j <= 5; j++) {     // inner loop → 6 stars per row
                System.out.print("*");
            }
            System.out.println();              // move to next line
        }
    }
}