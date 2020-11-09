/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Heroe;
import modelo.Malvado;

/**
 *
 * @author Hp
 */
public class Pantalla extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        miPanel = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto_resultado = new javax.swing.JTextArea();
        batalla_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        miPanel.setBackground(new java.awt.Color(102, 153, 255));
        miPanel.setToolTipText("");

        titulo.setFont(new java.awt.Font("Stylus BT", 1, 48)); // NOI18N
        titulo.setText("Batalla SuperX");

        texto_resultado.setColumns(20);
        texto_resultado.setRows(5);
        jScrollPane1.setViewportView(texto_resultado);

        batalla_bt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        batalla_bt.setText("Iniciar Batalla");
        batalla_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalla_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout miPanelLayout = new javax.swing.GroupLayout(miPanel);
        miPanel.setLayout(miPanelLayout);
        miPanelLayout.setHorizontalGroup(
            miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miPanelLayout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, miPanelLayout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, miPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, miPanelLayout.createSequentialGroup()
                        .addComponent(batalla_bt)
                        .addGap(282, 282, 282))))
        );
        miPanelLayout.setVerticalGroup(
            miPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(batalla_bt)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(miPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(miPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void batalla_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalla_btActionPerformed
        Heroe Cazador = new Heroe();
        Malvado Neurus = new Malvado();
        
        Cazador.setEnergia(100);
        Cazador.setHabilidad_ppal("Fuerza sobrehumana");
        Cazador.setNombre("Cazador");
        Cazador.setPais_origen("Argentina");
        
        Neurus.setEnergia(100);
        Neurus.setHabilidad_ppal("Control mental");
        Neurus.setNombre("Neurus");
        Neurus.setPais_origen("Argentina");
        
        
        System.out.println(Cazador.getNombre()+" se ha presentado a la batalla con energía al: "+Cazador.getEnergia()+ "%.");
        System.out.println(Neurus.getNombre()+"se ha presentado a la batalla con energía al: "+Neurus.getEnergia()+ "%.");
         System.out.println("");
        texto_resultado.setText(Cazador.getNombre()+" se ha presentado a la batalla con energía al: "+Cazador.getEnergia()+ "%.\n"+Neurus.getNombre()+" se ha presentado a la batalla con energía al: "+Neurus.getEnergia()+ "%.\n\n");
        //El atributo murio viene de Super_x
        
        
        
        
        //Ataque
             
       while(!Cazador.isMurio() && !Neurus.isMurio()) {
        //el ataque
         Cazador.atacar(Cazador);
         Neurus.atacar(Neurus);
         System.out.println("");
         if (Cazador.isMurio())
                 System.out.println("Neurus es el vencedor. Cazador ha muerto.");
                 
            }
        if (Neurus.isMurio())
               
                System.out.println("Cazador es el vencedor. Neurus ha muerto.");
                
                   // TODO add your handling code here:
    }//GEN-LAST:event_batalla_btActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batalla_bt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel miPanel;
    private javax.swing.JTextArea texto_resultado;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
