public class SmartTv {
    static boolean ligada = false;
    static int canal = 1;
    static int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void passarCanal(){
        canal++;
    }
    public void voltarCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Você aumentou o volume para: " + volume );
    }
    public void diminuirVolume(){ 
        volume--;
        System.out.println("Você diminui o volume para: " + volume );
    }

    public void ligar() {
        ligada = true; 
    }

    public void desligar() {
        ligada = false; 
    }


}