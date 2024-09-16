public class Fogao {
    private String marca;
    private String modelo;
    private Integer bocas;
    private Double consumoWatts;
    private Double preco;

    Fogao() {
        marca = "Electrolux";
        modelo = "4 bocas";
        bocas = 4;
        consumoWatts = 45.0;
        preco = 2500.0;
    }

    Fogao(String ma, String mo, Integer b, Double cW, Double p) {
        marca = ma;
        modelo = mo;
        bocas = b;
        consumoWatts = cW;
        preco = p;
    }

    // Getters e Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getBocas() {
        return bocas;
    }

    public void setBocas(Integer bocas) {
        this.bocas = bocas;
    }

    public Double getConsumoWatts() {
        return consumoWatts;
    }

    public void setConsumoWatts(Double consumoWatts) {
        this.consumoWatts = consumoWatts;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    // methods

    public void imprimir() {
        System.out.println("\n--------------------------------------------------");
        System.out.println("Informações do fogão: " + this);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bocas: " + bocas);
        System.out.println("Consumo em watts: " + consumoWatts);
        System.out.println("Preço: " + preco);
        System.out.println("--------------------------------------------------\n");
    }

    // main

    public static void main(String args[]) {
        // Declaração de objetos
        Fogao f1, f2;

        // Instanciação de objetos
        f1 = new Fogao();
        f2 = new Fogao("Brastemp", "6 bocas", 6, 60.0, 3500.0);

        // Impressão de objetos
        f1.imprimir();
        f2.imprimir();
    }
}
