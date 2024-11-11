public abstract class Conta {
    /**
     * Número identificador da conta.
     */
    protected String numero;
    protected double saldo;

    /**
     * Credita (adiciona) um valor ao saldo da conta.
     */
    abstract void creditar(double valor);

    /**
     * Debita (subtrai) um valor do saldo da conta.
     */
    abstract void debitar(double valor);

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
