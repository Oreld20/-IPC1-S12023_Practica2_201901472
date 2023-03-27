package Logica;
import Interfaces.Menu;
import static Interfaces.Menu.tiempos;

public class Monkey {
    public static void main(String[] args) {
        Menu pantalla = new Menu(tiempos);
            pantalla.setVisible(true);
            pantalla.setLocationRelativeTo(null);    
    }
}
