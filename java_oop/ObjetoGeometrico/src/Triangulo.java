public class Triangulo extends ObjetoGeometrico {
    public double base;
    public double altura;

    Triangulo(double b, double a) {
        base = b;
        altura = a;
    }

    public double getArea() {
        area = base * altura / 2;
        return area;
    }
}
