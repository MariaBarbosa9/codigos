public class Fila <T> {
    private No primeiro;
    private No ultimo;
    //utilizamos apenas o construtor padrão, vamos escrever apenas por clareza
    public Fila() {
        this.primeiro = null;
        this.ultimo = null;
    }
    //métodos de acesso = getters
    public No getPrimeiro() {
        return this.primeiro;
    }
    public No getUltimo() {
        return this.ultimo;
    }
    //métodos modificadores = setters
    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }
    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }
    public boolean filaVazia () {
        return this.primeiro == null;
    }
    @Override
    public String toString() {
        String s = "Fila: ";
        if (filaVazia()) 
            s = s + "vazia";
        else {
            No aux = getPrimeiro();
            while (aux != null) {
                s = s + aux;
                aux = aux.getProximo();
            }
        }
        return s + "\n";
    }
    public void enfileira (Pessoa p) {//inserção de fim 
        No novo = new No(p);
        if (filaVazia()) {
            setPrimeiro(novo);
        }
        else {
            ultimo.setProximo(novo);
        }
        setUltimo(novo);
    }
    public Pessoa desenfileira () {
        Pessoa quemSai = getPrimeiro().getInfo();
        setPrimeiro(getPrimeiro().getProximo());
        if (getPrimeiro()==null)
            setUltimo(null);
        return quemSai;
    }
}
