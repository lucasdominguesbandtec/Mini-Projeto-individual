/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.monitoramentoso;

import java.util.Random;

/**
 *
 * @author Aluno
 */
public class teste extends javax.swing.JPanel {

    /**
     * Creates new form Monitoramento
     */
    public teste() {
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

        lblCPU = new javax.swing.JLabel();
        lblMemoria = new javax.swing.JLabel();
        lblDisco = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();

        lblCPU.setForeground(java.awt.Color.blue);
        lblCPU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCPU.setText("CPU");
        lblCPU.setAutoscrolls(true);
        lblCPU.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lblMemoria.setForeground(java.awt.Color.blue);
        lblMemoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemoria.setLabelFor(lblMemoria);
        lblMemoria.setText("MEMÓRIA");

        lblDisco.setForeground(java.awt.Color.blue);
        lblDisco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDisco.setText("DISCO");

        btnAtualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(lblMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(lblDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(btnAtualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(lblMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        lblCPU = new javax.swing.JLabel();
        lblMemoria = new javax.swing.JLabel();
        lblDisco = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        
        Random gerador = new Random();
        
        Integer CPU, Memoria, Disco;
        
        CPU = gerador.nextInt(101);
        Memoria = gerador.nextInt(101);
        Disco = gerador.nextInt(101);
        
        
        
    }//GEN-LAST:event_btnAtualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JLabel lblCPU;
    private javax.swing.JLabel lblDisco;
    private javax.swing.JLabel lblMemoria;
    // End of variables declaration//GEN-END:variables
}
