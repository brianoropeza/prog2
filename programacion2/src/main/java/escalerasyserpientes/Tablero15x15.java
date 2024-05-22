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
public class Tablero15x15 extends javax.swing.JFrame {
    
    private DefaultTableModel model;
    private serpientesyEscaleras j;
    private int turno = 1;

    /**
     * Creates new form Tablero15x15
     */
    public Tablero15x15(serpientesyEscaleras juego) {
        j = juego;
        initComponents();
        this.tabla.setModel(j.crearTabla(15));
        tabla.setRowHeight(30);
    }

    private Tablero15x15() {
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
        titulo3 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        InstalarSerpienteEscalera = new javax.swing.JButton();
        JugarTurno = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHistorial = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(102, 255, 102));

        titulo3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo3.setText("HISTORIAL PARTIDA");

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setText("SERPIENTES Y ESCALERAS 15 x 15");

        InstalarSerpienteEscalera.setText("Instalar Serpiente y Escalera");
        InstalarSerpienteEscalera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstalarSerpienteEscaleraActionPerformed(evt);
            }
        });

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

        tabla.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla.setEnabled(false);
        jScrollPane2.setViewportView(tabla);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo3)
                .addGap(149, 149, 149))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(InstalarSerpienteEscalera)
                .addGap(259, 259, 259)
                .addComponent(JugarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(titulo3))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titulo)
                        .addGap(88, 88, 88)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InstalarSerpienteEscalera)
                            .addComponent(JugarTurno))))
                .addGap(144, 144, 144)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                if(posactual%15!=0){
                    this.model.setValueAt(String.valueOf(posactual), this.j.getJugadores().get(0).getPosicion()/15, (this.j.getJugadores().get(0).getPosicion()%15)-1);
                }else{
                    this.model.setValueAt(String.valueOf(posactual), (this.j.getJugadores().get(0).getPosicion()-1)/15, (this.j.getJugadores().get(0).getPosicion()-1)%15);
                }

            }
            this.txtHistorial.setText(this.txtHistorial.getText()+this.j.moverFicha(j.getJugadores().get(0).getFicha(),225)+"\n");
            turno = this.j.cambiarTurno(turno);
            if(this.j.getJugadores().get(0).getPosicion()%15!=0){
                this.model.setValueAt(this.j.getJugadores().get(0).getFicha(), this.j.getJugadores().get(0).getPosicion()/15, (this.j.getJugadores().get(0).getPosicion()%15)-1);
            }else{
                this.model.setValueAt(this.j.getJugadores().get(0).getFicha(), (this.j.getJugadores().get(0).getPosicion()-1)/15, (this.j.getJugadores().get(0).getPosicion()-1)%15);
            }

            this.tabla.setModel(model);

        } else if (turno == 2) {
            this.txtHistorial.setText(this.txtHistorial.getText()+"Turno: "+turno+"\n");
            int posactual = this.j.getJugadores().get(1).getPosicion();
            if (posactual != 0) {
                if (posactual % 15 != 0) {
                    this.model.setValueAt(String.valueOf(posactual), this.j.getJugadores().get(1).getPosicion() / 15, (this.j.getJugadores().get(1).getPosicion() % 15) - 1);
                } else {
                    this.model.setValueAt(String.valueOf(posactual), (this.j.getJugadores().get(1).getPosicion() - 1) / 15, (this.j.getJugadores().get(1).getPosicion() - 1) % 15);
                }
            }
            this.txtHistorial.setText(this.txtHistorial.getText()+this.j.moverFicha(j.getJugadores().get(1).getFicha(),225)+"\n");
            turno = this.j.cambiarTurno(turno);
            if(this.j.getJugadores().get(1).getPosicion()%15!=0){
                this.model.setValueAt(this.j.getJugadores().get(1).getFicha(), this.j.getJugadores().get(1).getPosicion()/15, (this.j.getJugadores().get(1).getPosicion()%15)-1);
            }else{
                this.model.setValueAt(this.j.getJugadores().get(1).getFicha(), (this.j.getJugadores().get(1).getPosicion()-1)/15, (this.j.getJugadores().get(1).getPosicion()-1)%15);
            }
            this.tabla.setModel(model);

        } else if (turno == 3) {
            this.txtHistorial.setText(this.txtHistorial.getText() + "Turno: " + turno + "\n");
            int posactual = this.j.getJugadores().get(2).getPosicion();
            if (posactual != 0) {
                if (posactual % 15 != 0) {
                    this.model.setValueAt(String.valueOf(posactual), this.j.getJugadores().get(2).getPosicion() / 15, (this.j.getJugadores().get(2).getPosicion() % 15) - 1);
                } else {
                    this.model.setValueAt(String.valueOf(posactual), (this.j.getJugadores().get(2).getPosicion() - 1) / 15, (this.j.getJugadores().get(2).getPosicion() - 1) % 15);
                }
            }
            this.txtHistorial.setText(this.txtHistorial.getText() + this.j.moverFicha(j.getJugadores().get(2).getFicha(),225) + "\n");
            turno = this.j.cambiarTurno(turno);
            if(this.j.getJugadores().get(2).getPosicion()%15!=0){
                this.model.setValueAt(this.j.getJugadores().get(2).getFicha(), this.j.getJugadores().get(2).getPosicion()/15, (this.j.getJugadores().get(2).getPosicion()%15)-1);
            }else{
                this.model.setValueAt(this.j.getJugadores().get(2).getFicha(), (this.j.getJugadores().get(2).getPosicion()-1)/15, (this.j.getJugadores().get(2).getPosicion()-1)%15);
            }
            this.tabla.setModel(model);

        } else {
            this.txtHistorial.setText(this.txtHistorial.getText()+"Turno: "+turno+"\n");
            int posactual = this.j.getJugadores().get(3).getPosicion();
            if (posactual != 0) {
                if (posactual % 15 != 0) {
                    this.model.setValueAt(String.valueOf(posactual), this.j.getJugadores().get(3).getPosicion() / 15, (this.j.getJugadores().get(3).getPosicion() % 15) - 1);
                } else {
                    this.model.setValueAt(String.valueOf(posactual), (this.j.getJugadores().get(3).getPosicion() - 1) / 15, (this.j.getJugadores().get(3).getPosicion() - 1) % 15);
                }
            }
            this.txtHistorial.setText(this.txtHistorial.getText() + this.j.moverFicha(j.getJugadores().get(3).getFicha(),225) + "\n");
            turno = this.j.cambiarTurno(turno);
            if (this.j.getJugadores().get(3).getPosicion() % 15 != 0) {
                this.model.setValueAt(this.j.getJugadores().get(3).getFicha(), this.j.getJugadores().get(3).getPosicion() / 15, (this.j.getJugadores().get(3).getPosicion() % 15) - 1);
            } else {
                this.model.setValueAt(this.j.getJugadores().get(3).getFicha(), (this.j.getJugadores().get(3).getPosicion() - 1) / 15, (this.j.getJugadores().get(3).getPosicion() - 1) % 15);
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
            java.util.logging.Logger.getLogger(Tablero15x15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero15x15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero15x15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero15x15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero15x15().setVisible(true);
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
    private javax.swing.JLabel titulo3;
    private javax.swing.JTextArea txtHistorial;
    // End of variables declaration//GEN-END:variables
}