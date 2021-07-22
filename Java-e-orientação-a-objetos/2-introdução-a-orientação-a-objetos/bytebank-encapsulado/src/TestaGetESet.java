public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.setNumero(1222);
        System.out.println("O número da conta é: "+ conta.getNumero());

        conta.setAgencia(128);
        System.out.println("O número do agência é: "+ conta.getAgencia());

        Cliente adriano = new Cliente();
        adriano.setNome("adriano");
        adriano.setCpf("000.000.00");

        conta.setTitular(adriano);
        //apartir daqui que o meu titular aponta para o objeto conta Adriano
        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getCpf());

        conta.getTitular().setProfissao("programadaor");
        System.out.println(conta.getTitular().getProfissao());
    }
}
