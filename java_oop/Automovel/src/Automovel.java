public class Automovel {
    // Atributos
    private String marca;
    private String modelo;
    private Double preco;
    private Integer ano;
    private String cor;
    private String placa;
    private Integer marcacaoOdometroKm;

    // Construtor padrão
    Automovel() {
        marca = "Fiat";
        modelo = "Marea Turbo";
        preco = 20000.0;
        ano = 2000;
        cor = "Prata";
        placa = "ABC-1234";
        marcacaoOdometroKm = 999999;
    }

    // Construtor com parâmetros
    Automovel(
            String ma,
            String mo,
            Double p,
            Integer a,
            String c,
            String pl,
            Integer o) {
        marca = ma;
        modelo = mo;
        preco = p;
        ano = a;
        cor = c;
        placa = pl;
        marcacaoOdometroKm = o;
    }

    // Metodos getters e setters

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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getMarcacaoOdometroKm() {
        return marcacaoOdometroKm;
    }

    public void setMarcacaoOdometroKm(Integer marcacaoOdometroKm) {
        this.marcacaoOdometroKm = marcacaoOdometroKm;
    }

    // Método que imprime as informações da classe
    public void imprimir() {
        System.out.println("\n--------------------------------------------------");
        System.out.println("Informações do automóvel: " + this);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: " + preco);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Placa: " + placa);
        System.out.println("Odômetro: " + marcacaoOdometroKm + " km");
    }

    // Main
    public static void main(String[] args) {
        // Declaração de objetos
        Automovel automovel1, automovel2;

        // Instanciação de objetos
        automovel1 = new Automovel();
        automovel2 = new Automovel(
                "Chevrolet",
                "Celta",
                15000.0,
                2005,
                "Preto",
                "DEF-5678",
                100000);

        // Utilizando métodos setters
        automovel1.setMarca("Volkswagen");
        automovel1.setModelo("Gol");

        // Imprime as informações dos objetos
        automovel1.imprimir();
        automovel2.imprimir();
    }
}
