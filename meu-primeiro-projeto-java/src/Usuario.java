public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        SmartTv.mudarCanal(12);
        
        System.out.println("Volume Atual: " + SmartTv.volume);

        System.out.println("Tv ligada? " + SmartTv.ligada);
        System.out.println("Canal Atual: " + SmartTv.canal);
        System.out.println("Volume Atual: " + SmartTv.volume);

        smartTv.ligar(); 
        System.out.println("Novo Status -> Tv ligada? " + SmartTv.ligada);
    }
}