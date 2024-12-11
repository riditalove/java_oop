public class Str {
    public static void main(String args[])
    {
        String name = new String("rdita");

        String name1 = "rdita";

        System.out.println(name==name1);

        name = name + " KHan";

        System.out.println(name);

        StringBuffer sb = new StringBuffer("Bithi Khan");
        System.out.println(sb);
        sb.append(" Rahman");
        System.out.println(sb);

    }
}