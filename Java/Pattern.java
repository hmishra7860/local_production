import java.util.*;

public class Pattern{

    public static void main(String[] args) {
    @SuppressWarnings("unused")
    Scanner input = new Scanner(System.in);
    System.out.println("Pattern 1: ");
    Pattern1();
    System.out.println("Pattern 2: ");
    pattern2();
    System.out.println("Pattern 3: ");
    pattern3();
    System.out.println("Pattern 4: ");
    OOPS();
    System.out.println("Floyd Pattern: ");
    floyd();
    System.out.println("Using While Loop: ");
    Loops();
}

public static void Pattern1(){

int rows = 6;

for (int i = 1; i <= rows; i++) {

            // Inner loop for spaces before the stars
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Inner loop for printing stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line after printing each row
            System.out.println();
}

}

public static void pattern2(){

    int rows = 6;

for (int i = 1; i <= rows; i++) {

            // Inner loop for spaces before the stars
            for (int j = i; j < rows; j++) {
                System.out.print(" " +j);
            }

            // Inner loop for printing stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*" +k);
            }

            // Move to the next line after printing each row
            System.out.println(" " +i);
}

}

public static void pattern3(){
    int row = 8;
    for (int i = row; i >= 1; i--) {
      
    for(int j = row; j > i ; j--){
        System.out.print(" ");
    }
    for(int k = 1; k <=(2*i-1); k++ ){
        System.out.print("*");
    }
      
      System.out.println();  
    }
}

public static void OOPS(){
    for(int i = 1; i <= 8; i++){
        
        for(int j =1; j < 8; j++){
            
          System.out.print("0");
        }
        for(int k =1; k < 8; k++){
            
          System.out.print("0");
        }
        System.out.println();

    }
    
}

public static void floyd(){
    int number = 1;
    int row = 6;
    for(int i = 1; i <= row; i++){
        for(int j = 1; j<= i; j++){
            System.out.print(number+ " ");
            number++;
        }
        System.out.println();
    }

}

public static void Loops() {
        int i = 1; // Initialize counter
        while (i <= 10) {  // Loop condition
            System.out.println(i);  // Print current value of i
            i++;  // Increment i
        }
    }


}

