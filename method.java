
class Computer
{
    public void playMusic()
    {
        System.out.println("Play the music!");
    }
    public String getTheName(int cost)
    {
        if(cost<10)
        {
            return "Very cheap!";
        }
        return "Parker";
    }
}

public class method {

    public static void main(String args[])
    {
        Computer com = new Computer();
        com.playMusic();
        String name = com.getTheName(19);
        System.out.println(name);

    }
}