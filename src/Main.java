import java.util.Scanner;

public class Main {
    public static void printDivisibleNumbers(int n){
        for (int i=0;i<n;i++){
            if (i%5==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        //Като използвате метод напишете програма, която приема дадено число n от
        // конзолата и отпечатва всички числа от 0 до n, които се делят на 5 без остатък.
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n= scanner.nextInt();
        printDivisibleNumbers(n);
    }
}