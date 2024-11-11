public abstract class ContaEspecial extends Conta {
    public double limite;

    public void creditar(double valor) {
        saldo += valor;
    }

    public void debitar(double valor) {
        saldo -= valor;
    }

    protected double getLimite() {
        return limite;
    }

    protected void setLimite(double limite) {
        this.limite = limite;
    }
}
