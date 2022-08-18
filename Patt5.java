class Patt5{
    public static void main(String[] arg)
    {   int c=64;
        int i=1;
        while(i<5)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print((char)(c+j));
                j=j+1;
            }
            System.out.print("\n");
            i=i+1;

        }
    }
}