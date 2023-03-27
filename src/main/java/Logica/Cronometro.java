
package Logica;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Cronometro extends Thread { 
   
    private int centesimas_segundos = 0;
    private int segundos = 0;
    private int minutos = 0;
    private int horas = 0;
    private JLabel etiqueta_tiempo;
   
     public Cronometro() {
    }
    public Cronometro(JLabel etiqueta_tiempo) {
        this.etiqueta_tiempo = etiqueta_tiempo;
    }
     public void run(){
         while (true) {
          try {
                 sleep(10);
         
             centesimas_segundos ++;
             if(centesimas_segundos == 60){
                 segundos++;
                 centesimas_segundos = 0;
             }
             if(segundos == 60){
                 minutos ++;
                 segundos = 0;
             }
             if(minutos == 60){
                 horas ++;
                 minutos = 0;
             }
             if(horas == 24){
                 horas = 0;
             }
             actualizarEtiquetaTiempo();
         }
          catch (InterruptedException ex) {
                 Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
             }}
        }
     private void actualizarEtiquetaTiempo(){
         
              String texto = (horas<=9?"0":"")+horas+":"+(minutos<=9?"0":"")+minutos+":"+(segundos <= 9?"0":"")+segundos+":"+(centesimas_segundos <=9?"0":"")+centesimas_segundos;
        etiqueta_tiempo.setText(texto);
}
    }
     
   
    

