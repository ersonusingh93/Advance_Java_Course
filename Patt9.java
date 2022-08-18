class Patt9{
    public static void main(String[] arg)
    {   
        int i=1;
        while(i<5)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print((char)(69-i));
                j=j+1;
            }
            System.out.print("\n");
            i=i+1;

        }
    }
}