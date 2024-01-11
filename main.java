import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int temperatura;
        
        while (true) {
            System.out.println("Digite a temperatura:");
            temperatura = input.nextInt();
            if (temperatura < 30) {
                System.out.println("Desliga o ar");
            } else {
                System.out.println("Liga o ar");
            }
        }
    }
}