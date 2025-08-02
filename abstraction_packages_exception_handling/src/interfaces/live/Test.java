package interfaces.live;

import interfaces.music.Playable;
import interfaces.music.string.Veena;
import interfaces.music.wind.Saxophone;



public class Test {
    public static void main(String[] args) {
        Veena v = new Veena();
        Playable veena = v;

        Saxophone s = new Saxophone(); 
        Playable saxo = s;

        veena.play(); 
        saxo.play(); 
    }
}
