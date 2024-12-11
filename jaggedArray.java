public class jaggedArray {

    public static void main(String args[])
    {
        int[][] arra = new int[4][];//here the first array is of 4 size, and the array within the array has no definite size
        arra[0] = new int[4];
        arra[1] = new int[3];
        arra[2] = new int[5];
        arra[3] = new int[2];

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<arra[i].length;j++)
            {
                arra[i][j] = (int)(Math.random()*100);
            }
        }
        for (int n[]:arra)
        {
            for(int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }



    }
}