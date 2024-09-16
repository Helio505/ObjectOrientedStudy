public class Televisor {
    protected Integer canal;
    protected String tamanho;
    protected String modelo;

    // constructors

    public Televisor() {
        canal = 4;
        tamanho = "15 polegadas";
        modelo = "SEMP TOSHIBA";
    }

    public Televisor(int c, String t, String m) {
        canal = c;
        tamanho = t;
        modelo = m;
    }

    // getters and setters

    public Integer getCanal() {
        return canal;
    }

    public void setCanal(Integer canal) {
        this.canal = canal;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // methods

    public void imprimir() {
        System.out.println("\n--------------------------------------------------");
        System.out.println("Informações do televisor: " + this);
        System.out.println("Canal: " + canal);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Modelo: " + modelo);
    }

    // main

    public static void main(String[] args) {
        // Declaração de objetos
        Televisor tv1, tv2;

        // Instanciação de objetos
        tv1 = new Televisor();
        tv2 = new Televisor(7, "21 polegadas", "Philips");

        // Algumas modificações
        tv1.setCanal(5);
        tv1.setTamanho("29 polegadas");
        tv1.setModelo("Sony");

        // Impressão dos objetos
        tv1.imprimir();
        tv2.imprimir();
    }
}
