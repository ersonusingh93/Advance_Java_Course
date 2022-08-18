class Patt8{
    public static void main(String[] arg)
    {
        int i=5;
        while(i>0)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print((char)(70-i));
                j=j+1;
            }
            System.out.print("\n");
            i=i-1;

        }
    }
}