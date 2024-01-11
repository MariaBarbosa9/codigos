public class Pessoa {
    private String nome;
    private int anoNascimento;
    //construtores sobrecarregados
    public Pessoa() {}
    public Pessoa (String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }
    //métodos de acesso
    public String getNome() {
        return this.nome;
    }
    public int getAnoNascimento() {
        return this.anoNascimento;
    }
    //métodos modificadores
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAnoNascimento (int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    @Override
    public String toString() {
        return "Pessoa = [nome: " + this. nome + ", nasceu em: "+ this.anoNascimento + "]";
    }
}
