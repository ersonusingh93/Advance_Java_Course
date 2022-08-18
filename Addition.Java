import java.util.Scanner;
class Addition{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number");
        int num1 = sc.nextInt();
        System.out.print("enter second number");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.print("ans is" +sum);
        sc.close();
    }

}