
package Interfaces;

import static Interfaces.Menu.tiempos;
import Logica.Cronometro;
import Logica.Guardado;
import Logica.Movimiento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Simulacion extends javax.swing.JFrame {
    ArrayList <Guardado> tiempos = new ArrayList <Guardado>();
 
    public Simulacion(ArrayList <Guardado> tiempos) {
        this.tiempos=tiempos;
        initComponents();  
        
    }

     public JLabel getPrimerC(){
    return PrimerC;
    }
    
    public JLabel getInventario(){
    return Inventario;
    }
    
    public JLabel getProduccion(){
    return Produccion;
    }
    
    public JLabel getEmpaquetado(){
    return Empaquetado;
    }
    
    public JLabel getSalida(){
    return Salida;
    }
    
    public JLabel getFinal(){
    return Final;
    }
    
    public JLabel getetiqueta_tiempo(){
    return etiqueta_tiempo;
    }
    
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnReporte = new javax.swing.JButton();
        PrimerC = new javax.swing.JLabel();
        Inicio = new javax.swing.JButton();
        tiempo_transcurrido = new javax.swing.JLabel();
        Salida = new javax.swing.JLabel();
        Inventario = new javax.swing.JLabel();
        Produccion = new javax.swing.JLabel();
        Empaquetado = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Final = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        bentRegresar1 = new javax.swing.JButton();
        etiqueta_tiempo = new javax.swing.JLabel();

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Produccion");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReporte.setBackground(new java.awt.Color(204, 204, 0));
        btnReporte.setForeground(new java.awt.Color(0, 0, 0));
        btnReporte.setText("Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        jPanel1.add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 140, 40));

        PrimerC.setBackground(new java.awt.Color(51, 51, 255));
        PrimerC.setOpaque(true);
        jPanel1.add(PrimerC, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 60, 60));

        Inicio.setBackground(new java.awt.Color(204, 204, 0));
        Inicio.setForeground(new java.awt.Color(0, 0, 0));
        Inicio.setText("Iniciar");
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });
        jPanel1.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 140, 40));

        tiempo_transcurrido.setForeground(new java.awt.Color(0, 0, 0));
        tiempo_transcurrido.setText("Tiempo transcurrido:");
        jPanel1.add(tiempo_transcurrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 130, 30));

        Salida.setBackground(new java.awt.Color(153, 0, 51));
        Salida.setOpaque(true);
        jPanel1.add(Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 320, 170));

        Inventario.setBackground(new java.awt.Color(0, 153, 153));
        Inventario.setOpaque(true);
        jPanel1.add(Inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 300, 170));

        Produccion.setBackground(new java.awt.Color(0, 153, 102));
        Produccion.setOpaque(true);
        jPanel1.add(Produccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 310, 200));

        Empaquetado.setBackground(new java.awt.Color(153, 0, 153));
        Empaquetado.setOpaque(true);
        jPanel1.add(Empaquetado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 320, 210));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Produccion");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, -1, -1));

        Final.setBackground(new java.awt.Color(204, 0, 51));
        Final.setForeground(new java.awt.Color(0, 0, 0));
        Final.setText("Final");
        Final.setOpaque(true);
        jPanel1.add(Final, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, 30, 50));

        jLabel7.setBackground(new java.awt.Color(204, 204, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Inicio");
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 540, -1, 50));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Salida");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Inventario");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, -1, -1));

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Empaquetado");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        bentRegresar1.setBackground(new java.awt.Color(204, 204, 0));
        bentRegresar1.setForeground(new java.awt.Color(0, 0, 0));
        bentRegresar1.setText("Regresar");
        bentRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bentRegresar1ActionPerformed(evt);
            }
        });
        jPanel1.add(bentRegresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 40));

        etiqueta_tiempo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etiqueta_tiempo.setForeground(new java.awt.Color(0, 0, 0));
        etiqueta_tiempo.setText("00:00:00");
        jPanel1.add(etiqueta_tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bentRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bentRegresar1ActionPerformed

        Menu pantalla = new Menu(tiempos);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_bentRegresar1ActionPerformed

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed

        PrimerC.setLocation( PrimerC.getLocation().x, PrimerC.getLocation().y);
        Movimiento circ = new  Movimiento(PrimerC,this,tiempos,1);
         circ.start();
         
       
        

        // TODO add your handling code here:
    }//GEN-LAST:event_InicioActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed

        Cronometro time1 = new Cronometro(etiqueta_tiempo);
        time1.start();

            // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Empaquetado;
    private javax.swing.JLabel Final;
    private javax.swing.JButton Inicio;
    private javax.swing.JLabel Inventario;
    private javax.swing.JLabel PrimerC;
    private javax.swing.JLabel Produccion;
    private javax.swing.JLabel Salida;
    private javax.swing.JButton bentRegresar1;
    private javax.swing.JButton btnReporte;
    private javax.swing.JLabel etiqueta_tiempo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tiempo_transcurrido;
    // End of variables declaration//GEN-END:variables
}
