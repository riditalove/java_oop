public class findTheLargest {

    public static void main(String args[])
    {
        int a = 9;
        int b = 17;
        int c = 6;

        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(c);
            }
        }
        if(b>c)
        {
            if(b>a)
            {
                System.out.println(b);
            }
            else
            {

                System.out.println(a);
            }
        }
        if(c>a)
        {
            if(c>b)
            {
                System.out.println(c);
            }
            else
            {
                System.out.println(b);
            }
        }
    }
}