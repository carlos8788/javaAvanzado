package Observer;

import java.util.ArrayList;
import java.util.Arrays;

public class Emisor {
    private ArrayList<Receptor> receptor = new ArrayList();

    public void addReceptor(Receptor receptor) {
        this.receptor.add(receptor);
    }

    public void emite(){
        for(Receptor receptor : receptor){
            receptor.recibe();
        }

    }
}
