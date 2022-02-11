import java.util.Scanner;
public class Launcher {
    public static void main(String[] args) {
        System.out.println("Welcome !");
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner("quit");
        int x = 1;
        while (x == 1)
        {
            if (a == b)
            {
                break;
            }
            else if (a != b)
            {
                System.out.println("Unknown Command");
                continue;
            }
        }
    }
}