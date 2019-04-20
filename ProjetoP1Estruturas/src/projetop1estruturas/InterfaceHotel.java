/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetop1estruturas;

import java.util.ArrayList;

/**
 *
 * @author Eduardo Baptista
 */
public class InterfaceHotel extends javax.swing.JFrame {
    CadastraHospede c = new CadastraHospede();
    /**
     * Creates new form InterfaceHotel
     */
    public InterfaceHotel() {
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

        jLabelNome = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonHospedes = new javax.swing.JButton();
        jButtonBuscaHospede = new javax.swing.JButton();
        jButtonEstacionamento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNome.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelNome.setText("Hotel Empório Acapulco Jequitimar");
        jLabelNome.setToolTipText("");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add-hotel-symbol.png"))); // NOI18N
        jButton1.setText(" Novo hóspede");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonHospedes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonHospedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/guest.png"))); // NOI18N
        jButtonHospedes.setText("   Hóspedes ");
        jButtonHospedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHospedesActionPerformed(evt);
            }
        });

        jButtonBuscaHospede.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonBuscaHospede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/magnifier-tool.png"))); // NOI18N
        jButtonBuscaHospede.setText("  Busca hóspede");
        jButtonBuscaHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaHospedeActionPerformed(evt);
            }
        });

        jButtonEstacionamento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEstacionamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/parked-car.png"))); // NOI18N
        jButtonEstacionamento.setText("  Estacionamento");
        jButtonEstacionamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstacionamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonHospedes, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(232, 232, 232)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBuscaHospede, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEstacionamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelNome))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonBuscaHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButtonEstacionamento, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButtonHospedes, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(364, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /* Botão para cadastrar novos hóspedes */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //CadastraHospede c = new CadastraHospede();
        c.setVisible(true);
        
        //setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonHospedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHospedesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonHospedesActionPerformed

    private void jButtonBuscaHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaHospedeActionPerformed
        // TODO add your handling code here:
        BuscaHospedes busca_hospedes = new BuscaHospedes();
        busca_hospedes.setVisible(true);
        //hospedes.add(HotelLES.getHospedes());
        //hospedes.add(new Hospede("a", "b", "c", "d", "e", "f", "g"));
        busca_hospedes.exibirTodos(c.todosHospedes);
    }//GEN-LAST:event_jButtonBuscaHospedeActionPerformed

    private void jButtonEstacionamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstacionamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEstacionamentoActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Cria e mostra o formulário */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceHotel().setVisible(true);
            }
        });
    }
    
    private ArrayList<HotelLES> hospedes = new ArrayList<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBuscaHospede;
    private javax.swing.JButton jButtonEstacionamento;
    private javax.swing.JButton jButtonHospedes;
    private javax.swing.JLabel jLabelNome;
    // End of variables declaration//GEN-END:variables
}
