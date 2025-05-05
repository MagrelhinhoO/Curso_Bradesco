package Sistema_SmartTV;

public class Usuario {
    public static void main(String[] args){

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();

        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

        smartTv.desligar();

        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);
    }
}
