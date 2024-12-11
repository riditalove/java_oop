public class typeCasting {
    public static void main(String args[])
    {
        byte b;
        int a = 25; // but if you put 127+ (128/129/... so on), then it will be out of range of byte and give a (value)%256 as output
        b = (byte) a; // explicitly casting done
        System.out.println(b);

        double c ;
        int d = 10;
        c = d;
        System.out.println(c); //implicitly casting done

        byte e;
        int f = 258;
        e = (byte) f;
        System.out.println(e); // here f is divided by 256 and the reminder is saved in e

        float g = 10.4f;
        int h = (int) g; // casting
        System.out.println(h);

        byte x = 10;
        byte y = 50;

        int result = x*y; // type promotion
//      Explanation : here x and y both are in byte , but the multiplication yields an int, so it will be promoted to int

        System.out.println(result);
    }
}