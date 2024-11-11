public class MainBanco {
    // private Conta c1;
    // private ContaDebEspecial c2;
    // private ContaDebEspecial c3;

    public static void main(String[] args) {
        // Titulo
        System.out.println("----> Banco <---");

        // Conta 1 - normal
        Conta c1 = new ContaNormal();
        c1.setNumero("123");
        c1.setSaldo(1000);
        c1.creditar(100);
        c1.debitar(50);

        // Conta 2 - especial - construtor padrão
        ContaDebEspecial c2 = new ContaDebEspecial();
        c2.setNumero("456");
        c2.setSaldo(2000);
        c2.creditar(200);
        c2.debitar(100);

        // Conta 3 - especial - construtor com parâmetros
        ContaDebEspecial c3 = new ContaDebEspecial("789", 3000, 1000);
        c3.creditar(300);
        c3.debitar(150);

        // Conta 4 - estudantil
        ContaEstudantil c4 = new ContaEstudantil();
        c4.setNumero("101");
        c4.setSaldo(4000);
        c4.emprestimo = 2000;
        c4.creditar(400);
        c4.debitar(200);

        // Imprime
        System.out.println("Conta 1: " + c1.getNumero() + " - " + c1.getSaldo());
        System.out.println("Conta 2: " + c2.getNumero() + " - " + c2.getSaldo());
        System.out.println("Conta 3: " + c3.getNumero() + " - " + c3.getSaldo());
        System.out.println("Conta 4: " + c4.getNumero() + " - " + c4.getSaldo());
    }
}
