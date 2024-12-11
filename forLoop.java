public class forLoop {
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=10;j++)
            {
                if((j+8)>12)
                {
                    System.out.println(i+" "+((j+8)-12));

                }
                else
                {
                    System.out.println(i+" "+(j+8));
                }
            }
        }

    }
}