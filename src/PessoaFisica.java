public class PessoaFisica {

    private String nome;
    private String cpf;
    private int idade;
    private String estadoCivil;

    public PessoaFisica(String nome, String cpf, int idade, String esatdoCivil) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.estadoCivil = esatdoCivil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "PessoaFisica {" +
                " nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}
