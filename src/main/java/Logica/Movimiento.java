
package Logica;

import Interfaces.Simulacion;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Movimiento extends Thread {
    
    private JLabel etiqueta;
    private Simulacion CirculoC;
    private ArrayList <Guardado> tiempos;

    public Movimiento(JLabel etiqueta, Simulacion Circulo,ArrayList <Guardado> tiempos) {
        this.etiqueta = etiqueta;
        this.CirculoC = Circulo;
        this.tiempos=tiempos;
    }
    
    @Override
    public void run(){
        int circulox=0;
        int circuloy;
        boolean caso=true;
            try {
                while (true) {
                circulox= CirculoC.getPrimerC().getLocation().x;
                circuloy=CirculoC.getPrimerC().getLocation().y;
                if (circulox==570) {
                    while (CirculoC.getPrimerC().getLocation().x<CirculoC.getInventario().getLocation().x+120) {
                    sleep((int)100);
                    etiqueta.setLocation(etiqueta.getLocation().x+10,etiqueta.getLocation().y);
                    CirculoC.repaint();  
                    }
                }
                 if (circulox==830) {
                     sleep((int)1000*tiempos.get(0).Tinventario);
                    while (CirculoC.getPrimerC().getLocation().y>CirculoC.getProduccion().getLocation().y) {
                           sleep((int)100);
                           etiqueta.setLocation(etiqueta.getLocation().x,etiqueta.getLocation().y-10);
                           CirculoC.repaint();
                    }      
                } 
                 if (circuloy<=160) {
                     sleep((int)1000*tiempos.get(0).Tproduccion);
                     while (CirculoC.getPrimerC().getLocation().x>CirculoC.getEmpaquetado().getLocation().x+100) {
                            sleep((int)100);
                           etiqueta.setLocation(etiqueta.getLocation().x-10,etiqueta.getLocation().y);
                           CirculoC.repaint();
                         
                     }
                } 
                    if (circulox>=10&&circuloy==160) {
                        sleep((int)1000*tiempos.get(0).Tempaquetado);
                        while (CirculoC.getPrimerC().getLocation().y<CirculoC.getSalida().getLocation().y+80) {
                         sleep((int)100);
                          etiqueta.setLocation(etiqueta.getLocation().x,etiqueta.getLocation().y+10);
                          CirculoC.repaint();
                            
                        }
                        if (circuloy<=420) {
                            sleep((int)1000*tiempos.get(0).Tsalida);
                            while (CirculoC.getPrimerC().getLocation().x<CirculoC.getFinal().getLocation().x) {
                           sleep((int)100);
                          etiqueta.setLocation(etiqueta.getLocation().x+10,etiqueta.getLocation().y);
                          CirculoC.repaint();
                                
                            }
                        }
                    }
            }
            } catch (Exception e) {
                System.out.println(e);
            }
        
        
    } 
}
