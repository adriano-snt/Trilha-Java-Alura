public class TesteReferencias {
    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.00);


        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        Design d = new Design();
        d.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(d);
        controle.registra(g1);
        controle.registra(ev);


        System.out.println(controle.getSoma());
    }
}
