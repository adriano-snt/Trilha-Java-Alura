public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente nico = new Gerente();
        nico.setNome("Nico");
        nico.setCpf("22222222-5");
        nico.setSalario(2600.00);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());
    }
}
