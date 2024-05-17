/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package escalerasyserpientes;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Equipo
 */
public class Tablero10x10 extends javax.swing.JFrame {
    
    private DefaultTableModel model;
    private serpientesyEscaleras j;
    private int turno = 1;

    /**
     * Creates new form Tablero10x10
     */
    public Tablero10x10(serpientesyEscaleras juego) {
        
        j = juego;
        initComponents();
        this.tabla.setModel(j.crearTabla(10));
        tabla.setRowHeight(30);
    }
    
    private void colores(){
        
    }

    private Tablero10x10() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        titulo = new javax.swing.JLabel();
        InstalarSerpienteEscalera = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        JugarTurno = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHistorial = new javax.swing.JTextArea();
        titulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));

        panel1.setBackground(new java.awt.Color(102, 255, 102));

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setText("SERPIENTES Y ESCALERAS 10 x 10");

        InstalarSerpienteEscalera.setText("Instalar Serpiente y Escalera");
        InstalarSerpienteEscalera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstalarSerpienteEscaleraActionPerformed(evt);
            }
        });

        tabla.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla.setEnabled(false);
        jScrollPane2.setViewportView(tabla);

        JugarTurno.setText("Jugar");
        JugarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarTurnoActionPerformed(evt);
            }
        });

        txtHistorial.setEditable(false);
        txtHistorial.setColumns(20);
        txtHistorial.setRows(5);
        jScrollPane1.setViewportView(txtHistorial);

        titulo1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo1.setText("HISTORIAL PARTIDA");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addComponent(InstalarSerpienteEscalera)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JugarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                        .addComponent(titulo1)
                        .addGap(110, 110, 110))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo)
                    .addComponent(titulo1))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InstalarSerpienteEscalera)
                            .addComponent(JugarTurno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InstalarSerpienteEscaleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstalarSerpienteEscaleraActionPerformed

        int cantidad = Integer.valueOf(JOptionPane.showInputDialog("¿Cuántas fichas especiales quiere agregar?"));

        while (cantidad != 0) {

            String nombre = JOptionPane.showInputDialog(null, "Digite el nombre de la ficha especial (Serpiente o Escalera)");
            String posini = JOptionPane.showInputDialog(null, "Digite la posición inicial de la ficha");
            String posfin = JOptionPane.showInputDialog(null, "Digite la posición final de la ficha");

            this.j.agregarFichaEspecial(nombre, Integer.parseInt(posini), Integer.parseInt(posfin));
            cantidad--;
        }

        this.model = this.j.getTab().getModel();
        this.tabla.setModel(model);

    }//GEN-LAST:event_InstalarSerpienteEscaleraActionPerformed

    private void JugarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarTurnoActionPerformed

        if (turno == 1) {
            this.txtHistorial.setText(this.txtHistorial.getText()+"Turno: "+turno+"\n");
            int posactual = this.j.getJugadores().get(0).getPosicion();
            if(posactual!=0){
                if(posactual%10!=0){
                    this.model.setValueAt(String.valueOf(posactual), this.j.getJugadores().get(0).getPosicion()/10, (this.j.getJugadores().get(0).getPosicion()%10)-1);
                }else{
                    this.model.setValueAt(String.valueOf(posactual), (this.j.getJugadores().get(0).getPosicion()-1)/10, (this.j.getJugadores().get(0).getPosicion()-1)%10);
                }
                
            }
            this.txtHistorial.setText(this.txtHistorial.getText()+this.j.moverFicha(j.getJugadores().get(0).getFicha(),100)+"\n");
            turno = this.j.cambiarTurno(turno);        
            if(this.j.getJugadores().get(0).getPosicion()%10!=0){
                this.model.setValueAt(this.j.getJugadores().get(0).getFicha(), this.j.getJugadores().get(0).getPosicion()/10, (this.j.getJugadores().get(0).getPosicion()%10)-1);
            }else{
                this.model.setValueAt(this.j.getJugadores().get(0).getFicha(), (this.j.getJugadores().get(0).getPosicion()-1)/10, (this.j.getJugadores().get(0).getPosicion()-1)%10);
            }
            
            this.tabla.setModel(model);
            
        } else if (turno == 2) {
            this.txtHistorial.setText(this.txtHistorial.getText()+"Turno: "+turno+"\n");
            int posactual = this.j.getJugadores().get(1).getPosicion();
            if (posactual != 0) {
                if (posactual % 10 != 0) {
                    this.model.setValueAt(String.valueOf(posactual), this.j.getJugadores().get(1).getPosicion() / 10, (this.j.getJugadores().get(1).getPosicion() % 10) - 1);
                } else {
                    this.model.setValueAt(String.valueOf(posactual), (this.j.getJugadores().get(1).getPosicion() - 1) / 10, (this.j.getJugadores().get(1).getPosicion() - 1) % 10);
                }
            }
            this.txtHistorial.setText(this.txtHistorial.getText()+this.j.moverFicha(j.getJugadores().get(1).getFicha(),100)+"\n");
            turno = this.j.cambiarTurno(turno);
            if(this.j.getJugadores().get(1).getPosicion()%10!=0){
                this.model.setValueAt(this.j.getJugadores().get(1).getFicha(), this.j.getJugadores().get(1).getPosicion()/10, (this.j.getJugadores().get(1).getPosicion()%10)-1);
            }else{
                this.model.setValueAt(this.j.getJugadores().get(1).getFicha(), (this.j.getJugadores().get(1).getPosicion()-1)/10, (this.j.getJugadores().get(1).getPosicion()-1)%10);
            }
            this.tabla.setModel(model);

        } else if (turno == 3) {
            this.txtHistorial.setText(this.txtHistorial.getText() + "Turno: " + turno + "\n");
            int posactual = this.j.getJugadores().get(2).getPosicion();
            if (posactual != 0) {
                if (posactual % 10 != 0) {
                    this.model.setValueAt(String.valueOf(posactual), this.j.getJugadores().get(2).getPosicion() / 10, (this.j.getJugadores().get(2).getPosicion() % 10) - 1);
                } else {
                    this.model.setValueAt(String.valueOf(posactual), (this.j.getJugadores().get(2).getPosicion() - 1) / 10, (this.j.getJugadores().get(2).getPosicion() - 1) % 10);
                }
            }
            this.txtHistorial.setText(this.txtHistorial.getText() + this.j.moverFicha(j.getJugadores().get(2).getFicha(),100) + "\n");
            turno = this.j.cambiarTurno(turno);
            if(this.j.getJugadores().get(2).getPosicion()%10!=0){
                this.model.setValueAt(this.j.getJugadores().get(2).getFicha(), this.j.getJugadores().get(2).getPosicion()/10, (this.j.getJugadores().get(2).getPosicion()%10)-1);
            }else{
                this.model.setValueAt(this.j.getJugadores().get(2).getFicha(), (this.j.getJugadores().get(2).getPosicion()-1)/10, (this.j.getJugadores().get(2).getPosicion()-1)%10);
            }
            this.tabla.setModel(model);

        } else {
            this.txtHistorial.setText(this.txtHistorial.getText()+"Turno: "+turno+"\n");
            int posactual = this.j.getJugadores().get(3).getPosicion();
            if (posactual != 0) {
                if (posactual % 10 != 0) {
                    this.model.setValueAt(String.valueOf(posactual), this.j.getJugadores().get(3).getPosicion() / 10, (this.j.getJugadores().get(3).getPosicion() % 10) - 1);
                } else {
                    this.model.setValueAt(String.valueOf(posactual), (this.j.getJugadores().get(3).getPosicion() - 1) / 10, (this.j.getJugadores().get(3).getPosicion() - 1) % 10);
                }
            }
            this.txtHistorial.setText(this.txtHistorial.getText() + this.j.moverFicha(j.getJugadores().get(3).getFicha(),100) + "\n");
            turno = this.j.cambiarTurno(turno);
            if (this.j.getJugadores().get(3).getPosicion() % 10 != 0) {
                this.model.setValueAt(this.j.getJugadores().get(3).getFicha(), this.j.getJugadores().get(3).getPosicion() / 10, (this.j.getJugadores().get(3).getPosicion() % 10) - 1);
            } else {
                this.model.setValueAt(this.j.getJugadores().get(32).getFicha(), (this.j.getJugadores().get(3).getPosicion() - 1) / 10, (this.j.getJugadores().get(3).getPosicion() - 1) % 10);
            }
            this.tabla.setModel(model);
        }
    }//GEN-LAST:event_JugarTurnoActionPerformed

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
            java.util.logging.Logger.getLogger(Tablero10x10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero10x10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero10x10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero10x10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero10x10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InstalarSerpienteEscalera;
    private javax.swing.JButton JugarTurno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Panel panel1;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JTextArea txtHistorial;
    // End of variables declaration//GEN-END:variables
}
