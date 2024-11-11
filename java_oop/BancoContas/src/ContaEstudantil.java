public class ContaEstudantil extends ContaNormal {
    public double emprestimo;

    public void creditar(double v) {
        saldo += v;
    }

    public void debitar(double v) {
        saldo -= v;
    }
}
