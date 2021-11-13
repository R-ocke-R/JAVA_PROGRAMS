package assignment.Live;

import assignment.playable;
import assignment.String.Veena;
import assignment.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        Veena v = new Veena();
        Saxophone s = new Saxophone();
        v.play();
        s.play();
        playable p = v;
        playable p2 = s;
        p.play();
        p2.play();
    }
}
