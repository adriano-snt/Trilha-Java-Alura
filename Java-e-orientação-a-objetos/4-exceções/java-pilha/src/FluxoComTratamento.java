public class FluxoComTratamento {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
            System.out.println("fim do main");
        } catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
            ex.printStackTrace();
        }
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        throw new MinhaExcecao("Deu muito erro");

//      System.out.println("Fim do metodo2");
        }
}