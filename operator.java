public class operator {
    public static void main( String args[])
    {
        int num1 = 7;
        int num2 = 8;

        int result = num1%num2;
        //System.out.println(result);

        int postIncre = num1++; // fetch the value and then increment
        int preIncre = ++num2; // increment done at first, then assign the value

        System.out.println(postIncre);
        System.out.println(preIncre);
        //System.out.println(num1);
    }
}