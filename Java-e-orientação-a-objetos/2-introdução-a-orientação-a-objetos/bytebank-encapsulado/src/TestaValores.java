public class TestaValores {
    public static void main(String[] args) {

        Conta conta = new Conta(1337, 2222);

        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(1565, 2223);

        System.out.println(Conta.getTotal());

    }
}
