public class TesteReferencias {
    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.00);

        Funcionario f = new Funcionario();
        f.setSalario(2000.00);

        EditorVideo ev = new EditorVideo();
        f.setSalario(2500.0);

        Design d = new Design();
        f.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(d);
        controle.registra(g1);
        controle.registra(f);
        controle.registra(ev);


        System.out.println(controle.getSoma());
    }
}
