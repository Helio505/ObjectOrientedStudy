public class TelevisorComDVD extends Televisor {
    TelevisorComDVD() {
        canal = 31;
        tamanho = "20 polegadas";
        modelo = "PHILCO";
    }

    public String eject() {
        return "- Eject";
    }

    public String play() {
        return "- Play";
    }

    public String stop() {
        return "- Stop";
    }

    public String pause() {
        return "- Pause";
    }

    // imprimir

    public void imprimir() {
        System.out.println("\n--------------------------------------------------");
        System.out.println("Informações do televisor com DVD: " + this);
        System.out.println("Canal: " + canal);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Modelo: " + modelo);
    }

    public static void main(String[] args) {
        // Declaração de objetos
        Televisor tv1;
        TelevisorComDVD tvdvd1, tvdvd2;

        // Instanciação de objetos
        tv1 = new Televisor();
        tvdvd1 = new TelevisorComDVD();
        tvdvd2 = new TelevisorComDVD();

        // Utilizando métodos herdados de Televisor
        tvdvd1.setCanal(5);
        tvdvd1.setTamanho("29 polegadas");
        tvdvd1.setModelo("Sony");
        tvdvd2.setCanal(7);

        // Utilizando métodos de TelevisorComDVD
        System.out.println("\n Utilizando Métodos de TelevisorComDVD:");
        System.out.println(tvdvd1.eject());
        System.out.println(tvdvd1.play());
        System.out.println(tvdvd1.stop());
        System.out.println(tvdvd1.pause());

        // Impressão
        tv1.imprimir();
        tvdvd1.imprimir();
        tvdvd2.imprimir();
    }
}
