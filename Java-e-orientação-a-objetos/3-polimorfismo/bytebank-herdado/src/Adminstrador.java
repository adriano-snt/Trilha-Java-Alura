public class Adminstrador extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public Adminstrador() {
        this.autenticador = new AutenticacaoUtil();

        @Override
        public double getBonificacao () {
            return 50;
        }

        @Override
        public void setSenha ( int senha){
            this.senha = senha;
        }

        @Override
        public boolean autentica ( int senha){
            if (this.senha == senha) {
                return true;
            } else {
                return false;
            }
        }

    }
