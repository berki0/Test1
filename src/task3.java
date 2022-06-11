import java.util.Scanner;
public class task3 {
    public static void printTriangle(int n) {
        int a = 0;
        for (int i = 1; i <= n; ++i, a = 0) {
            for (int space = 1; space <= n -i; ++space) {
                System.out.print(" ");
            }
            while (a != 2 * i - 1) {
                System.out.print("о");
                ++a;
            }
            System.out.println();
        }
    }
    //гитхуб нешо сссии
    public static void main(String[] args) {
        //Напишете програма която отпечатва триъгълник със страна
        //n. Пример: n =3
        //  о
        // ооо
        //ооооо
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number to made triangle: ");
        int n= scanner.nextInt();
        printTriangle(n);
        System.out.println("safafgs");
        System.out.println("safafgasdisua");
        System.out.println("safgayugxaysfcyasgc");
        System.out.println("TEST COMMIT ");
    }
}
