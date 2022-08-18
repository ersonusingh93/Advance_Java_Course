class Sum{
    public static void main(String[] args)
    {
        
         int i = 1;
        int sum = 0;
        while(i<=1000)
        {
            sum = sum+i*2;
            i = i+1;
        }
        System.out.println("Sum is " +sum);

    }
}