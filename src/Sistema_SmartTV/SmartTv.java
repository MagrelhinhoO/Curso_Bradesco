package Sistema_SmartTV;

public class SmartTv {
        boolean ligada = false;
        int canal = 1;
        int volume = 25;

        public void ligar(){
            ligada = true;
        }

        public void desligar(){
            ligada = false;
        }

        public void aumentarVolume(){
            volume++;
        }

        public void diminuirVolume(){
            volume--;
        }

        public void canalSeguinte(){
            canal++;
        }

        public void canalAnterior(){
            canal--;
        }

        public void mudarCanal(int novoCanal){
            canal = novoCanal;
        }
}
