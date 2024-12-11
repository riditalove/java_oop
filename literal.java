class  literal
{
    public static void main(String args[])
    {
        boolean b = true;
        int interesting = 0b1010;
        System.out.println(b);
        System.out.println(interesting);
        int num1 = 0x7E;
        System.out.println(num1);
        int num2 = 1_00_000;
        System.out.println(num2);
        double convert = 56;
        System.out.println(convert);
        double veryLong = 12e13;
        System.out.println(veryLong);
        char c = 'a';
        c++; //incrementing the character
        System.out.println(c);
    }
}