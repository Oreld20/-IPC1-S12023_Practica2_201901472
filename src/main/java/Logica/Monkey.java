

package Logica;

import Interfaces.Menu;
import static Interfaces.Menu.tiempos;
import java.util.ArrayList;


public class Monkey {

    public static void main(String[] args) {
        Menu pantalla = new Menu(tiempos);
            pantalla.setVisible(true);
            pantalla.setLocationRelativeTo(null);
            
    }
}
