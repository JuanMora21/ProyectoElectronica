/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G.U.I;

import ClasesArchivos.Lector;
import ClasesArchivos.LectorEscritorTextoPlano;
import ClasesPrincipal.ProyectoElectronica;
import java.util.ArrayList;

/**
 *
 * @author JUAN MORA
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    ProyectoElectronica proyectoElectronica;
    Lector lector;
    ArrayList<String> resultado;
    
    public VentanaPrincipal(ProyectoElectronica proyectoElectronica, Lector lector) {
        this.proyectoElectronica = proyectoElectronica;
        this.lector = lector;
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

        bCargarArchivo = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taMemoria = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        taComandos = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        tfNombreArchivo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bCargarArchivo.setText("Cargar Archivo");
        bCargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCargarArchivoActionPerformed(evt);
            }
        });

        taMemoria.setColumns(20);
        taMemoria.setRows(5);
        jScrollPane1.setViewportView(taMemoria);

        taComandos.setColumns(20);
        taComandos.setRows(5);
        jScrollPane2.setViewportView(taComandos);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("PROYECTO ELECTRONICA");

        tfNombreArchivo.setEditable(false);
        tfNombreArchivo.setText("Nombre del Archivo");
        tfNombreArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreArchivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(112, 112, 112))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfNombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCargarArchivo)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCargarArchivo)
                    .addComponent(tfNombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCargarArchivoActionPerformed
        ArrayList<String> textoArchivo = proyectoElectronica.cargarArchivo(lector);
        seleccionarTextoComandos(textoArchivo);
        seleccionarNombreArchivo();
    }//GEN-LAST:event_bCargarArchivoActionPerformed
    private void seleccionarNombreArchivo() {
        tfNombreArchivo.setText(proyectoElectronica.getNombreArchivo());
    }
    public void seleccionarTextoComandos(ArrayList<String> textoArchivo){
        String textoPanel = "";
        for(int i = 0; i < textoArchivo.size(); i++){
            textoPanel += textoArchivo.get(i) + "\n";
        }
        taComandos.setText(textoPanel);
    }
        
    private void tfNombreArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreArchivoActionPerformed

    }//GEN-LAST:event_tfNombreArchivoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bCargarArchivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea taComandos;
    private javax.swing.JTextArea taMemoria;
    private javax.swing.JTextField tfNombreArchivo;
    // End of variables declaration//GEN-END:variables

}
