public class TesteFila {
    public static void main(String[] args) {
        Fila fila = new Fila();
        System.out.println(fila);
        Pessoa p1 = new Pessoa("ana", 2000);
        fila.enfileira(p1);
        
        p1 = new Pessoa("bia", 1999);
        fila.enfileira(p1);

        p1 = new Pessoa("caio", 2001);
        fila.enfileira(p1);

        System.out.println(fila);

        Pessoa atendida = fila.desenfileira();
        System.out.println(atendida.getNome() + " foi atendida");
        System.out.println("pessoas esperando:");
        System.out.println(fila);

        
    }
}
