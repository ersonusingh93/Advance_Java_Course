class Patt6{
    public static void main(String[] arg)
    {   int c=65;
        int i=5;
        while(i>0)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print((char)(c));
                j=j+1;
            }
            System.out.print("\n");
            i=i-1;

        }
    }
}