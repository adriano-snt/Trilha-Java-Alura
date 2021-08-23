package GerenciadorDeCursos.br.com.alura;

public class Aluno {
    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatrica){
        if(nome == null){
            throw new NullPointerException("Nome não pode ser null");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatrica;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString(){
        return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
    }
}
