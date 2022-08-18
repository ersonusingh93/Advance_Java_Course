class Patt12{
    public static void main(String[] arg)
    {   
        int i=5;
        while(i>=1)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print((char)(70-j));
                j=j+1;
            }
            System.out.print("\n");
            i=i-1;

        }
    }
}