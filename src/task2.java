import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class task2 {
    public static void printHappyNumbers(){
        int sum=0;
        int sum1=0;
        int sum2=0;
        int sum3=0;
           for (int i=1000;i<=9999;i++){
               sum=i%10;
               sum1=i%100;
               sum2=i%1000;
               sum3=i/1000;
               sum1=sum1/10;
               sum2=sum2/100;
               if (sum+sum1==sum2+sum3){
                   System.out.println("Тhese numbers are happy: "+i);
               }

           }
       }
    public static void main(String[] args) {
        // //Напишете програма, която изкарва на конзолата всички щастливи четирицифрени числа.
        //Щастливи числа са, когато сборът на първите две цифри на дадено четирицифрено число
        // (ABCD) е равен на сбора на последните две (A+B == C+D).
        printHappyNumbers();

    }
}
