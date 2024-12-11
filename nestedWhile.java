// in case of while loop, it is mostly used in fetching data from database, read the file , or in network

public class nestedWhile {

    public static void main(String args[])
    {
        int i=1;
        while (i<=7)
        {
            int j = 1;
            while (j<=24)
            {
                System.out.println(i+" "+j);
                if(j==19)
                {
                    break;
                }
                j++;
            }
            i++;
        }
    }
}