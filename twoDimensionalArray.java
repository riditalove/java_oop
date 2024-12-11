public class twoDimensionalArray {
    public static void main(String args[])
    {
        int ara[][] = new int[4][5];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                ara[i][j] = (int)(Math.random()*100);
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(ara[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int n[] : ara)
        {
            for(int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}