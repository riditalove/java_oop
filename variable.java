//integer has : 1. int => 4 bytes, long => 8 bytes, short => 2 bytes, byte => 1 byte
// float has : 1 float => 4 bytes , double => 8 bytes ( default )
// java follows unicode , not ASCII.. so it can support all of the character of the world
// that's why java char is 2 bytes,whereas the other programming language has just 1 byte for char
class variable
{
    public static void main(String args[])
    {
        int sum = 3;
        float floating_value = 48.9f; //if you do not put an f, you will get an error. because by default java keeps double as datatype
        System.out.println(sum+5);
        char justAChar = 'a';
        boolean booleanValue = true;
        byte aByteVar = 24;
        short shortValue = 556;
        double doubleValue = 45.5666;
        System.out.println(floating_value);
        System.out.println(justAChar);
        System.out.println(booleanValue);
        System.out.println(aByteVar);
        System.out.println(shortValue);
        System.out.println(doubleValue);
    }
}