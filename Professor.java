public class Professor extends Pessoa{
    private int matricula;
    private String curso;

    public Professor(String nome, int idade) {
        super(nome, idade);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
