 // the name of the method and the number of the parameters matter
 //return type doesn't matter
 // every method has its own stack

class Calculator1
 {
     public int add(int n1,int n2){
         return n1+n2;
     }
     public double add(int n1,double n2)
     {
         return n1+n2;
     }
     public double add(int n1,double n2,double n3)
     {
         return n1+n2+n3;

     }
 }

public class methodOverloading {
    public static void main(String args[])
    {
        Calculator1 calc = new Calculator1();
        double ans = calc.add(3,4,1000000);
        System.out.println(ans);

    }
}

