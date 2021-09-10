package Services;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControleCaminhao {

    public static String leString() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    public static int leInteiro() {
        Scanner scan = new Scanner(System.in);
        try {
            return scan.nextInt();
        }
        catch (InputMismatchException erro1) {
            System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
            scan.nextLine();
        }
        return 0;
    }
}

