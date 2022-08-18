class Patt11{
    public static void main(String[] arg)
    {
        int i=5;
        while(i>0)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print((char)(j+64));
                j=j+1;
            }
            System.out.print("\n");
            i=i-1;

        }
    }
}