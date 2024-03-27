import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("输入1或者2");
        Scanner scan=new Scanner(System.in);
        int selection=scan.nextInt();
        switch (selection) {
            case 1->System.out.println("Hello world");
            case 2->System.out.println("Nice world");
            default -> System.out.println("Goodbye world");
        }
    }
}