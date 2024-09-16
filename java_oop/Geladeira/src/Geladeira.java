public class Geladeira {
    private String marca;
    private String modelo;
    private Double capacidadeLitros;
    private Double consumoWatts;
    private Double preco;

    Geladeira() {
        marca = "Eletrolux";
        modelo = "310L";
        capacidadeLitros = 50.0;
        consumoWatts = 45.0;
        preco = 2500.0;
    }

    Geladeira(String ma, String mo, Double cL, Double cW, Double p) {
        marca = ma;
        modelo = mo;
        capacidadeLitros = cL;
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

    public Double getCapacidadeLitros() {
        return capacidadeLitros;
    }

    public void setCapacidadeLitros(Double capacidadeLitros) {
        this.capacidadeLitros = capacidadeLitros;
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

    public void imprimir() {
        System.out.println("\n--------------------------------------------------");
        System.out.println("Informações da geladeira: " + this);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidade em litros: " + capacidadeLitros);
        System.out.println("Consumo em watts: " + consumoWatts);
        System.out.println("Preço: " + preco);
        System.out.println("--------------------------------------------------\n");
    }

    public static void main(String args[]) {
        // Declaração de objetos
        Geladeira geladeira1, geladeira2, geladeira3;

        // Instanciação de objetos
        geladeira1 = new Geladeira();
        geladeira2 = new Geladeira("Brastemp", "400L", 100.0, 80.0, 3500.0);
        geladeira3 = new Geladeira("Consul", "500L", 150.0, 100.0, 4000.0);

        // Algumas alterações
        geladeira1.setMarca("Samsung");
        geladeira1.setModelo("600L");
        geladeira3.setPreco(4500.0);

        // Impressão de informações das instâncias
        geladeira1.imprimir();
        geladeira2.imprimir();
        geladeira3.imprimir();
    }
}
