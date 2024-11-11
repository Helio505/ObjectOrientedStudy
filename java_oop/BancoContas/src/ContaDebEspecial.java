public class ContaDebEspecial extends ContaEspecial {
    public void debitar(double valor) {
        saldo -= valor;
    }

    ContaDebEspecial() {
        this.limite = 1000;
    }

    ContaDebEspecial(String numero, double saldo, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }
}
