import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int times = input.nextInt();
        int width = input.nextInt();
        int height = input.nextInt();

        int size = (int) Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        for (int i = 0; i < times; i++) {
            int test = input.nextInt();

            if (test <= size) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
        input.close();
    }
}
