class Calculator
{
    public int add(int n1,int n2)
    {
        return n1+n2;

    }
}


public class classes
{
    public static void main(String args[])
    {
        Calculator calc = new Calculator();
        int result;
        result=calc.add(4,50);
        System.out.println(result);
    }
}