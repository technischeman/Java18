import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter sometihng");
        String a = input.next();


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(a + " ");
            }System.out.println();
        }
    }
}

