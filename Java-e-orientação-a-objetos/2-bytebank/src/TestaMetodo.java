public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoAdriano = new Conta();
        contaDoAdriano.saldo = 100;
        contaDoAdriano.deposita(50);
        System.out.println(contaDoAdriano.saldo);

        boolean conseguiuRetirar = contaDoAdriano.saca(20);
        System.out.println(contaDoAdriano.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        if(contaDaMarcela.transfere(3000, contaDoAdriano)){
            System.out.println("Transferencia com sucesso");
        }else {
            System.out.println("Faltou dinheiro");
        };

        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoAdriano.saldo);



    }
}
