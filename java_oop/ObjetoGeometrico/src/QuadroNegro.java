public class QuadroNegro {
    private Quadrado quadrado;
    private Retangulo retangulo;
    private Circunferencia circunferencia;
    private Triangulo triangulo;

    public void limpaQuadro() {
    }

    public void criaQuadrado(double l) {
        quadrado = new Quadrado(l);
    }

    public void criaRetangulo(double c, double a) {
        retangulo = new Retangulo(c, a);
    }

    public void criaCircunferencia(double r) {
        circunferencia = new Circunferencia(r);
    }

    public void criaTriangulo(double b, double a) {
        triangulo = new Triangulo(b, a);
    }

    public void mostraAreaObjetos() {
        System.out.println("Quadrado.  Área: " + quadrado.getArea());
        System.out.println("Retângulo. Área: " + retangulo.getArea());
        System.out.println("Triângulo. Área: " + (triangulo.base * triangulo.altura) / 2);
        System.out.println("Circunferência. Área: " + circunferencia.getArea());
    }

    public void mostraPerimetroObjetos() {
        System.out.println("O perímetro dos objetos são: ");
        System.out.println("Quadrado: " + quadrado.getPerimetro());
        System.out.println("Retangulo: " + retangulo.getPerimetro());
        System.out.println("Triângulo: " + triangulo.getPerimetro());
        System.out.println("Circunferência: " + circunferencia.getPerimetro());
    }

    public void mostraCorObjetos() {
        System.out.println("A cor dos objetos é: ");
        System.out.println("Quadrado: " + quadrado.getCor());
        System.out.println("Retangulo: " + retangulo.getCor());
        System.out.println("Triângulo: " + triangulo.getCor());
        System.out.println("Circunferência: " + circunferencia.getCor());
    }

    public static void main(String args[]) {
        QuadroNegro quadroNegro = new QuadroNegro();
        quadroNegro.criaQuadrado(10.6, "Branco");
        quadroNegro.criaRetangulo(50.5, 20.4, "Azul");
        quadroNegro.criaTriangulo(6.7, 5.5, "Amarelo");
        quadroNegro.criaCircunferencia(10, "Verde");
        quadroNegro.mostraPerimetro();
        quadroNegro.mostraCor();
    }
}
