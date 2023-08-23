public class Main {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();



        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();

        smartTv.mudarCanal(13);
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();

        System.out.println("Novo status - TV ligada? " + smartTv.ligada);
        System.out.println("Novo status - Canal atual: " + smartTv.canal);

        smartTv.desligar();
        System.out.println("Novo status - TV ligada? " + smartTv.ligada);
    }
}