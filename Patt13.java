class Patt13{
    public static void main(String[] arg)
    {
        int i=1;
        int k=1;
        while(i<5)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print(k++);
                j++;
            }
            System.out.print("\n");
            i++;

        }
    }
}