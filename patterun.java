public class patterun {
    public static void main(String[] args)
    {
        int number=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                number++;
                System.out.print(number + " ");
            }
            System.out.println(" ");
        }

    }
}
