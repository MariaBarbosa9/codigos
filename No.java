public class No {
    private Pessoa info;
    private No proximo;

    public No (Pessoa info) {
        this.info = info;
        this.proximo = null;
    }
    // public No (String nome, int anoNascimento) {
    //     Pessoa p = new Pessoa(nome, anoNascimento);//quebrando o encapsulamento
    //     this.info = p;
    //     this.proximo = null;
    // }

    //getters
    public Pessoa getInfo() {
        return this.info;
    }
    public No getProximo() {
        return this.proximo;
    }

    //setters
    public void setInfo(Pessoa info) {
        this.info = info;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString () {
        String s = "[" + this.info + "]->";
        if (this.proximo == null)
            s = s + "//";
        return s;
    }
}