import java.util.Scanner;


public class Basic{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Hello World");

        System.out.println("Enter the number a");
        
        int a = scanner.nextInt();

        int b = scanner.nextInt();

        int c = a + b;

        System.out.println("Sum " + c);

        comparison(a, b);

        System.out.println("Checking b as Prime or not: ");

        PrimeNumber(b);
        Factorial();
        add();
    }


    public static void comparison(int a, int b){
        if (a > b)
        System.out.println("a is greater than b");
        else{
            System.out.println("b is Greater");
        }
    }

    public static void PrimeNumber(int primenumber){

        for(int i = 2; i <= primenumber/2; i++){
        if (primenumber%i == 0){

            System.out.println("The Number is not Prime ");
        }
        
        else {

        System.out.println("Number is Prime ");
        }}
        
    }

    public static void Factorial() {
        
        Scanner scanner = new Scanner(System.in);
        int factorial = 1;
        int number;
        System.out.println("Enter the Number For palindrome: ");
        number = scanner.nextInt();
        for (int i = 1; i <= number; i++){
            factorial = factorial * i;
        }

        System.out.println("The Factorials of Number is " +factorial );
        
    }

   public static void add(){
    int a = 3;
    int b = 1;

    int c = a + b;

    System.out.println("Addition " +c);
   }

}