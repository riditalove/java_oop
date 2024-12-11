class Calcul
{
    public static int num=5;

    public static int add(int n1,int n2)
    {
        return n1+n2;
    }
}

public class staticMethod {
    public static void main(String args[])
    {
        Calcul calc = new Calcul();
        int ans = calc.add(4,5);
        System.out.println(calc.num);
        System.out.println(ans);

        calc.num = 7;

        Calcul calc1 = new Calcul();
        int ans1 = calc.add(6,7);
        System.out.println(ans1);
        System.out.println(calc1.num);


    }
}