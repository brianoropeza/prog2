/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Triquitraque;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Equipo
 */
public class Tablero5x5 extends javax.swing.JFrame {

    private Juego partida;
    private Color colorj1;
    private Color colorj2;

    /**
     * Creates new form Login
     */
    public Tablero5x5(Juego partida) {
        initComponents();
        this.partida = partida;
        this.crearColores();

    }

    private void crearColores() {
        if (this.partida.j1.getColor().equals("Rojo")) {
            this.colorj1 = Color.red;
            this.colorj2 = Color.blue;
        } else {
            this.colorj1 = Color.blue;
            this.colorj2 = Color.red;
        }
    }

    private Tablero5x5() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void reiniciarTablero() {

        this.txtConsola.setText("");

        this.btPos00.setSelected(false);
        this.btPos00.setText("");
        this.btPos00.setBackground(Color.LIGHT_GRAY);

        this.btPos01.setSelected(false);
        this.btPos01.setText("");
        this.btPos01.setBackground(Color.LIGHT_GRAY);

        this.btPos02.setSelected(false);
        this.btPos02.setText("");
        this.btPos02.setBackground(Color.LIGHT_GRAY);

        this.btPos03.setSelected(false);
        this.btPos03.setText("");
        this.btPos03.setBackground(Color.LIGHT_GRAY);

        this.btPos04.setSelected(false);
        this.btPos04.setText("");
        this.btPos04.setBackground(Color.LIGHT_GRAY);

        this.btPos10.setSelected(false);
        this.btPos10.setText("");
        this.btPos10.setBackground(Color.LIGHT_GRAY);

        this.btPos11.setSelected(false);
        this.btPos11.setText("");
        this.btPos11.setBackground(Color.LIGHT_GRAY);

        this.btPos12.setSelected(false);
        this.btPos12.setText("");
        this.btPos12.setBackground(Color.LIGHT_GRAY);

        this.btPos13.setSelected(false);
        this.btPos13.setText("");
        this.btPos13.setBackground(Color.LIGHT_GRAY);

        this.btPos14.setSelected(false);
        this.btPos14.setText("");
        this.btPos14.setBackground(Color.LIGHT_GRAY);

        this.btPos20.setSelected(false);
        this.btPos20.setText("");
        this.btPos20.setBackground(Color.LIGHT_GRAY);

        this.btPos21.setSelected(false);
        this.btPos21.setText("");
        this.btPos21.setBackground(Color.LIGHT_GRAY);

        this.btPos22.setSelected(false);
        this.btPos22.setText("");
        this.btPos22.setBackground(Color.LIGHT_GRAY);

        this.btPos23.setSelected(false);
        this.btPos23.setText("");
        this.btPos23.setBackground(Color.LIGHT_GRAY);

        this.btPos24.setSelected(false);
        this.btPos24.setText("");
        this.btPos24.setBackground(Color.LIGHT_GRAY);

        this.btPos30.setSelected(false);
        this.btPos30.setText("");
        this.btPos30.setBackground(Color.LIGHT_GRAY);

        this.btPos31.setSelected(false);
        this.btPos31.setText("");
        this.btPos31.setBackground(Color.LIGHT_GRAY);

        this.btPos32.setSelected(false);
        this.btPos32.setText("");
        this.btPos32.setBackground(Color.LIGHT_GRAY);

        this.btPos33.setSelected(false);
        this.btPos33.setText("");
        this.btPos33.setBackground(Color.LIGHT_GRAY);

        this.btPos34.setSelected(false);
        this.btPos34.setText("");
        this.btPos34.setBackground(Color.LIGHT_GRAY);

        this.btPos40.setSelected(false);
        this.btPos40.setText("");
        this.btPos40.setBackground(Color.LIGHT_GRAY);

        this.btPos41.setSelected(false);
        this.btPos41.setText("");
        this.btPos41.setBackground(Color.LIGHT_GRAY);

        this.btPos42.setSelected(false);
        this.btPos42.setText("");
        this.btPos42.setBackground(Color.LIGHT_GRAY);

        this.btPos43.setSelected(false);
        this.btPos43.setText("");
        this.btPos43.setBackground(Color.LIGHT_GRAY);

        this.btPos44.setSelected(false);
        this.btPos44.setText("");
        this.btPos44.setBackground(Color.LIGHT_GRAY);

    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btPos00 = new javax.swing.JToggleButton();
        btPos01 = new javax.swing.JToggleButton();
        btPos02 = new javax.swing.JToggleButton();
        btPos03 = new javax.swing.JToggleButton();
        btPos04 = new javax.swing.JToggleButton();
        btPos14 = new javax.swing.JToggleButton();
        btPos13 = new javax.swing.JToggleButton();
        btPos12 = new javax.swing.JToggleButton();
        btPos11 = new javax.swing.JToggleButton();
        btPos10 = new javax.swing.JToggleButton();
        btPos20 = new javax.swing.JToggleButton();
        btPos21 = new javax.swing.JToggleButton();
        btPos22 = new javax.swing.JToggleButton();
        btPos23 = new javax.swing.JToggleButton();
        btPos24 = new javax.swing.JToggleButton();
        btPos34 = new javax.swing.JToggleButton();
        btPos33 = new javax.swing.JToggleButton();
        btPos32 = new javax.swing.JToggleButton();
        btPos31 = new javax.swing.JToggleButton();
        btPos30 = new javax.swing.JToggleButton();
        btPos40 = new javax.swing.JToggleButton();
        btPos41 = new javax.swing.JToggleButton();
        btPos42 = new javax.swing.JToggleButton();
        btPos43 = new javax.swing.JToggleButton();
        btPos44 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConsola = new javax.swing.JTextArea();
        BtReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego Triki Traki");

        jPanel1.setBackground(new java.awt.Color(255, 51, 102));

        btPos00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPos00ActionPerformed(evt);
            }
        });

        btPos01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPos01ActionPerformed(evt);
            }
        });

        btPos02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPos02ActionPerformed(evt);
            }
        });

        btPos03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPos03ActionPerformed(evt);
            }
        });

        btPos04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPos04ActionPerformed(evt);
            }
        });

        btPos14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPos14ActionPerformed(evt);
            }
        });

        btPos13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPos13ActionPerformed(evt);
            }
        });

        btPos12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPos12ActionPerformed(evt);
            }
        });

        btPos11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPos11ActionPerformed(evt);
            }
        });

        btPos10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPos10ActionPerformed(evt);
            }
        });

        btPos20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPos20ActionPerformed(evt);
            }
        });

        btPos21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPos21ActionPerformed(evt);
            }
        });

        btPos22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPos22ActionPerformed(evt);
            }
        });

        btPos23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPos23ActionPerformed(evt);
            }
        });

        btPos24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPos24ActionPerformed(evt);
            }
        });

        btPos34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPos34ActionPerformed(evt);
            }
        });

        btPos33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPos33ActionPerformed(evt);
            }
        });

        btPos32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPos32ActionPerformed(evt);
            }
        });

        btPos31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPos31ActionPerformed(evt);
            }
        });

        btPos30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPos30ActionPerformed(evt);
            }
        });

        btPos40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPos40ActionPerformed(evt);
            }
        });

        btPos41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPos41ActionPerformed(evt);
            }
        });

        btPos42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPos42ActionPerformed(evt);
            }
        });

        btPos43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPos43ActionPerformed(evt);
            }
        });

        btPos44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPos44ActionPerformed(evt);
            }
        });

        txtConsola.setColumns(20);
        txtConsola.setRows(5);
        jScrollPane1.setViewportView(txtConsola);

        BtReiniciar.setText("Reiniciar Juego");
        BtReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btPos40, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btPos41, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btPos42, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btPos43, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btPos44, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btPos30, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btPos31, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btPos32, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btPos33, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(btPos20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btPos10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(btPos21, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btPos11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(btPos22, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btPos12, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btPos00, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btPos01, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btPos02, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btPos23, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btPos13, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btPos03, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btPos34, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btPos24, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btPos14, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btPos04, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BtReiniciar)
                        .addGap(290, 290, 290))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btPos02, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btPos01, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btPos00, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btPos12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btPos11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btPos10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btPos22, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btPos21, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btPos20, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btPos03, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btPos13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btPos23, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btPos32, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPos31, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPos30, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPos33, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btPos04, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btPos14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btPos24, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btPos34, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btPos42, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btPos41, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btPos40, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btPos43, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btPos44, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtReiniciar)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPos00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPos00ActionPerformed

        if (this.btPos00.getText().isEmpty() || this.btPos00.getText().isEmpty()) {
            if (this.partida.turno % 2 != 0) {
                this.btPos00.setText(String.valueOf(this.partida.j1.getFicha()));
                this.btPos00.setBackground(colorj1);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j1.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(0, 0, this.partida.j1.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");

                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.partida.finalizarPartida();
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }

            } else {
                this.btPos00.setText(String.valueOf(this.partida.j2.getFicha()));
                this.btPos00.setBackground(colorj2);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j2.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(0, 0, this.partida.j2.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }
            }

            this.partida.cambiarTurno();
        }
    }//GEN-LAST:event_btPos00ActionPerformed

    private void btPos01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPos01ActionPerformed

        if (this.btPos01.getText().isEmpty() || this.btPos01.getText().isEmpty()) {
            if (this.partida.turno % 2 != 0) {
                this.btPos01.setText(String.valueOf(this.partida.j1.getFicha()));
                this.btPos01.setBackground(colorj1);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j1.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(0, 1, this.partida.j1.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");

                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.partida.finalizarPartida();
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }

            } else {
                this.btPos01.setText(String.valueOf(this.partida.j2.getFicha()));
                this.btPos01.setBackground(colorj2);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j2.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(0, 1, this.partida.j2.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }
            }

            this.partida.cambiarTurno();
        }
    }//GEN-LAST:event_btPos01ActionPerformed

    private void btPos02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPos02ActionPerformed

        if (this.btPos02.getText().isEmpty() || this.btPos02.getText().isEmpty()) {
            if (this.partida.turno % 2 != 0) {
                this.btPos02.setText(String.valueOf(this.partida.j1.getFicha()));
                this.btPos02.setBackground(colorj1);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j1.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(0, 2, this.partida.j1.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");

                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.partida.finalizarPartida();
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }

            } else {
                this.btPos02.setText(String.valueOf(this.partida.j2.getFicha()));
                this.btPos02.setBackground(colorj2);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j2.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(0, 2, this.partida.j2.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }
            }

            this.partida.cambiarTurno();
        }
    }//GEN-LAST:event_btPos02ActionPerformed

    private void btPos10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPos10ActionPerformed

        if (this.btPos10.getText().isEmpty() || this.btPos10.getText().isEmpty()) {
            if (this.partida.turno % 2 != 0) {
                this.btPos10.setText(String.valueOf(this.partida.j1.getFicha()));
                this.btPos10.setBackground(colorj1);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j1.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(1, 0, this.partida.j1.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");

                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.partida.finalizarPartida();
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }

            } else {
                this.btPos10.setText(String.valueOf(this.partida.j2.getFicha()));
                this.btPos10.setBackground(colorj2);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j2.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(1, 0, this.partida.j2.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }
            }

            this.partida.cambiarTurno();
        }
    }//GEN-LAST:event_btPos10ActionPerformed

    private void btPos11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPos11ActionPerformed

        if (this.btPos11.getText().isEmpty() || this.btPos11.getText().isEmpty()) {
            if (this.partida.turno % 2 != 0) {
                this.btPos11.setText(String.valueOf(this.partida.j1.getFicha()));
                this.btPos11.setBackground(colorj1);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j1.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(1, 1, this.partida.j1.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");

                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.partida.finalizarPartida();
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }

            } else {
                this.btPos11.setText(String.valueOf(this.partida.j2.getFicha()));
                this.btPos11.setBackground(colorj2);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j2.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(1, 1, this.partida.j2.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }
            }

            this.partida.cambiarTurno();
        }
    }//GEN-LAST:event_btPos11ActionPerformed

    private void btPos12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPos12ActionPerformed

        if (this.btPos12.getText().isEmpty() || this.btPos12.getText().isEmpty()) {
            if (this.partida.turno % 2 != 0) {
                this.btPos12.setText(String.valueOf(this.partida.j1.getFicha()));
                this.btPos12.setBackground(colorj1);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j1.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(1, 2, this.partida.j1.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");

                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.partida.finalizarPartida();
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }

            } else {
                this.btPos12.setText(String.valueOf(this.partida.j2.getFicha()));
                this.btPos12.setBackground(colorj2);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j2.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(1, 2, this.partida.j2.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }
            }

            this.partida.cambiarTurno();
        }
    }//GEN-LAST:event_btPos12ActionPerformed

    private void btPos20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPos20ActionPerformed
        if (this.btPos20.getText().isEmpty() || this.btPos20.getText().isEmpty()) {
            if (this.partida.turno % 2 != 0) {
                this.btPos20.setText(String.valueOf(this.partida.j1.getFicha()));
                this.btPos20.setBackground(colorj1);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j1.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(2, 0, this.partida.j1.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");

                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.partida.finalizarPartida();
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }

            } else {
                this.btPos20.setText(String.valueOf(this.partida.j2.getFicha()));
                this.btPos20.setBackground(colorj2);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j2.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(2, 0, this.partida.j2.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }
            }

            this.partida.cambiarTurno();
        }
    }//GEN-LAST:event_btPos20ActionPerformed

    private void btPos21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPos21ActionPerformed
        if (this.btPos21.getText().isEmpty() || this.btPos21.getText().isEmpty()) {
            if (this.partida.turno % 2 != 0) {
                this.btPos21.setText(String.valueOf(this.partida.j1.getFicha()));
                this.btPos21.setBackground(colorj1);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j1.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(2, 1, this.partida.j1.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");

                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.partida.finalizarPartida();
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }

            } else {
                this.btPos21.setText(String.valueOf(this.partida.j2.getFicha()));
                this.btPos21.setBackground(colorj2);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j2.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(2, 1, this.partida.j2.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }
            }

            this.partida.cambiarTurno();
        }
    }//GEN-LAST:event_btPos21ActionPerformed

    private void btPos22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPos22ActionPerformed
        if (this.btPos22.getText().isEmpty() || this.btPos22.getText().isEmpty()) {
            if (this.partida.turno % 2 != 0) {
                this.btPos22.setText(String.valueOf(this.partida.j1.getFicha()));
                this.btPos22.setBackground(colorj1);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j1.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(2, 2, this.partida.j1.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");

                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.partida.finalizarPartida();
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }

            } else {
                this.btPos22.setText(String.valueOf(this.partida.j2.getFicha()));
                this.btPos22.setBackground(colorj2);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j2.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(2, 2, this.partida.j2.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }
            }

            this.partida.cambiarTurno();
        }
    }//GEN-LAST:event_btPos22ActionPerformed

    private void btPos03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPos03ActionPerformed
        if (this.btPos03.getText().isEmpty() || this.btPos03.getText().isEmpty()) {
            if (this.partida.turno % 2 != 0) {
                this.btPos03.setText(String.valueOf(this.partida.j1.getFicha()));
                this.btPos03.setBackground(colorj1);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j1.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(0, 3, this.partida.j1.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");

                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.partida.finalizarPartida();
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }

            } else {
                this.btPos03.setText(String.valueOf(this.partida.j2.getFicha()));
                this.btPos03.setBackground(colorj2);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j2.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(0, 3, this.partida.j2.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }
            }

            this.partida.cambiarTurno();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btPos03ActionPerformed

    private void btPos13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPos13ActionPerformed
        if (this.btPos13.getText().isEmpty() || this.btPos13.getText().isEmpty()) {
            if (this.partida.turno % 2 != 0) {
                this.btPos13.setText(String.valueOf(this.partida.j1.getFicha()));
                this.btPos13.setBackground(colorj1);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j1.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(1, 3, this.partida.j1.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");

                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.partida.finalizarPartida();
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }

            } else {
                this.btPos13.setText(String.valueOf(this.partida.j2.getFicha()));
                this.btPos13.setBackground(colorj2);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j2.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(1, 3, this.partida.j2.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }
            }

            this.partida.cambiarTurno();
        }
    }//GEN-LAST:event_btPos13ActionPerformed

    private void btPos23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPos23ActionPerformed
        if (this.btPos23.getText().isEmpty() || this.btPos23.getText().isEmpty()) {
            if (this.partida.turno % 2 != 0) {
                this.btPos23.setText(String.valueOf(this.partida.j1.getFicha()));
                this.btPos23.setBackground(colorj1);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j1.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(2, 3, this.partida.j1.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");

                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.partida.finalizarPartida();
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }

            } else {
                this.btPos23.setText(String.valueOf(this.partida.j2.getFicha()));
                this.btPos23.setBackground(colorj2);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j2.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(2, 3, this.partida.j2.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }
            }

            this.partida.cambiarTurno();
        }
    }//GEN-LAST:event_btPos23ActionPerformed

    private void btPos30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPos30ActionPerformed
        if (this.btPos30.getText().isEmpty() || this.btPos30.getText().isEmpty()) {
            if (this.partida.turno % 2 != 0) {
                this.btPos30.setText(String.valueOf(this.partida.j1.getFicha()));
                this.btPos30.setBackground(colorj1);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j1.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(3, 0, this.partida.j1.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");

                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.partida.finalizarPartida();
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }

            } else {
                this.btPos30.setText(String.valueOf(this.partida.j2.getFicha()));
                this.btPos30.setBackground(colorj2);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j2.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(3, 0, this.partida.j2.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }
            }

            this.partida.cambiarTurno();
        }
    }//GEN-LAST:event_btPos30ActionPerformed

    private void btPos31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPos31ActionPerformed
        if (this.btPos31.getText().isEmpty() || this.btPos31.getText().isEmpty()) {
            if (this.partida.turno % 2 != 0) {
                this.btPos31.setText(String.valueOf(this.partida.j1.getFicha()));
                this.btPos31.setBackground(colorj1);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j1.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(3, 1, this.partida.j1.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");

                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.partida.finalizarPartida();
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }

            } else {
                this.btPos31.setText(String.valueOf(this.partida.j2.getFicha()));
                this.btPos31.setBackground(colorj2);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j2.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(3, 1, this.partida.j2.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }
            }

            this.partida.cambiarTurno();
        }
    }//GEN-LAST:event_btPos31ActionPerformed

    private void btPos32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPos32ActionPerformed
        if (this.btPos32.getText().isEmpty() || this.btPos32.getText().isEmpty()) {
            if (this.partida.turno % 2 != 0) {
                this.btPos32.setText(String.valueOf(this.partida.j1.getFicha()));
                this.btPos32.setBackground(colorj1);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j1.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(3, 2, this.partida.j1.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");

                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.partida.finalizarPartida();
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }

            } else {
                this.btPos32.setText(String.valueOf(this.partida.j2.getFicha()));
                this.btPos32.setBackground(colorj2);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j2.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(3, 2, this.partida.j2.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }
            }

            this.partida.cambiarTurno();
        }
    }//GEN-LAST:event_btPos32ActionPerformed

    private void btPos33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPos33ActionPerformed
        if (this.btPos33.getText().isEmpty() || this.btPos33.getText().isEmpty()) {
            if (this.partida.turno % 2 != 0) {
                this.btPos33.setText(String.valueOf(this.partida.j1.getFicha()));
                this.btPos33.setBackground(colorj1);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j1.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(3, 3, this.partida.j1.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");

                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.partida.finalizarPartida();
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }

            } else {
                this.btPos33.setText(String.valueOf(this.partida.j2.getFicha()));
                this.btPos33.setBackground(colorj2);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j2.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(3, 3, this.partida.j2.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }
            }

            this.partida.cambiarTurno();
        }
    }//GEN-LAST:event_btPos33ActionPerformed

    private void btPos04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPos04ActionPerformed
        if (this.btPos04.getText().isEmpty() || this.btPos04.getText().isEmpty()) {
            if (this.partida.turno % 2 != 0) {
                this.btPos04.setText(String.valueOf(this.partida.j1.getFicha()));
                this.btPos04.setBackground(colorj1);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j1.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(0, 4, this.partida.j1.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");

                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.partida.finalizarPartida();
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }

            } else {
                this.btPos04.setText(String.valueOf(this.partida.j2.getFicha()));
                this.btPos04.setBackground(colorj2);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j2.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(0, 4, this.partida.j2.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }
            }

            this.partida.cambiarTurno();
        }
    }//GEN-LAST:event_btPos04ActionPerformed

    private void btPos14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPos14ActionPerformed
        if (this.btPos14.getText().isEmpty() || this.btPos14.getText().isEmpty()) {
            if (this.partida.turno % 2 != 0) {
                this.btPos14.setText(String.valueOf(this.partida.j1.getFicha()));
                this.btPos14.setBackground(colorj1);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j1.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(1, 4, this.partida.j1.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");

                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.partida.finalizarPartida();
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }

            } else {
                this.btPos14.setText(String.valueOf(this.partida.j2.getFicha()));
                this.btPos14.setBackground(colorj2);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j2.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(1, 4, this.partida.j2.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }
            }

            this.partida.cambiarTurno();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btPos14ActionPerformed

    private void btPos24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPos24ActionPerformed
        if (this.btPos24.getText().isEmpty() || this.btPos24.getText().isEmpty()) {
            if (this.partida.turno % 2 != 0) {
                this.btPos24.setText(String.valueOf(this.partida.j1.getFicha()));
                this.btPos24.setBackground(colorj1);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j1.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(2, 4, this.partida.j1.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");

                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.partida.finalizarPartida();
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }

            } else {
                this.btPos24.setText(String.valueOf(this.partida.j2.getFicha()));
                this.btPos24.setBackground(colorj2);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j2.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(2, 4, this.partida.j2.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }
            }

            this.partida.cambiarTurno();
        }
    }//GEN-LAST:event_btPos24ActionPerformed

    private void btPos34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPos34ActionPerformed
        if (this.btPos34.getText().isEmpty() || this.btPos34.getText().isEmpty()) {
            if (this.partida.turno % 2 != 0) {
                this.btPos34.setText(String.valueOf(this.partida.j1.getFicha()));
                this.btPos34.setBackground(colorj1);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j1.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(3, 4, this.partida.j1.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");

                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.partida.finalizarPartida();
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }

            } else {
                this.btPos34.setText(String.valueOf(this.partida.j2.getFicha()));
                this.btPos34.setBackground(colorj2);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j2.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(3, 4, this.partida.j2.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }
            }

            this.partida.cambiarTurno();
        }
    }//GEN-LAST:event_btPos34ActionPerformed

    private void btPos40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPos40ActionPerformed
        if (this.btPos40.getText().isEmpty() || this.btPos40.getText().isEmpty()) {
            if (this.partida.turno % 2 != 0) {
                this.btPos40.setText(String.valueOf(this.partida.j1.getFicha()));
                this.btPos40.setBackground(colorj1);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j1.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(4, 0, this.partida.j1.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");

                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.partida.finalizarPartida();
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }

            } else {
                this.btPos40.setText(String.valueOf(this.partida.j2.getFicha()));
                this.btPos40.setBackground(colorj2);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j2.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(4, 0, this.partida.j2.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }
            }

            this.partida.cambiarTurno();
        }
    }//GEN-LAST:event_btPos40ActionPerformed

    private void btPos41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPos41ActionPerformed
        if (this.btPos41.getText().isEmpty() || this.btPos41.getText().isEmpty()) {
            if (this.partida.turno % 2 != 0) {
                this.btPos41.setText(String.valueOf(this.partida.j1.getFicha()));
                this.btPos41.setBackground(colorj1);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j1.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(4, 1, this.partida.j1.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");

                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.partida.finalizarPartida();
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }

            } else {
                this.btPos41.setText(String.valueOf(this.partida.j2.getFicha()));
                this.btPos41.setBackground(colorj2);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j2.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(4, 1, this.partida.j2.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }
            }

            this.partida.cambiarTurno();
        }
    }//GEN-LAST:event_btPos41ActionPerformed

    private void btPos42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPos42ActionPerformed
        if (this.btPos42.getText().isEmpty() || this.btPos42.getText().isEmpty()) {
            if (this.partida.turno % 2 != 0) {
                this.btPos42.setText(String.valueOf(this.partida.j1.getFicha()));
                this.btPos42.setBackground(colorj1);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j1.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(4, 2, this.partida.j1.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");

                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.partida.finalizarPartida();
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }

            } else {
                this.btPos42.setText(String.valueOf(this.partida.j2.getFicha()));
                this.btPos42.setBackground(colorj2);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j2.obtenerNombre() + "\n");

                if (this.partida.tab.colocarFicha(4, 2, this.partida.j2.getFicha())) {
                    int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Desea Jugar La Revancha?");
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }

                }
            }

            this.partida.cambiarTurno();
        }
    }//GEN-LAST:event_btPos42ActionPerformed

    private void btPos43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPos43ActionPerformed
     if (this.btPos43.getText().isEmpty() || this.btPos43.getText().isEmpty()) {
            if (this.partida.turno % 2 != 0) {
                this.btPos43.setText(String.valueOf(this.partida.j1.getFicha()));
                this.btPos43.setBackground(colorj1);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j1.obtenerNombre() + "\n");
                
                if(this.partida.tab.colocarFicha(4, 3, this.partida.j1.getFicha())){
                    int respuesta = JOptionPane.showInternalConfirmDialog(null,"¿Desea Jugar La Revancha?");

                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.partida.finalizarPartida();
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }
                    
                }
                     
            } else {
                this.btPos43.setText(String.valueOf(this.partida.j2.getFicha()));
                this.btPos43.setBackground(colorj2);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j2.obtenerNombre() + "\n");
                
                if(this.partida.tab.colocarFicha(4, 3, this.partida.j2.getFicha())){
                    int respuesta = JOptionPane.showInternalConfirmDialog(null,"¿Desea Jugar La Revancha?");
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }
                    
                }
            }
            
            this.partida.cambiarTurno();
        }
    }//GEN-LAST:event_btPos43ActionPerformed

    private void btPos44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPos44ActionPerformed
       if (this.btPos44.getText().isEmpty() || this.btPos44.getText().isEmpty()) {
            if (this.partida.turno % 2 != 0) {
                this.btPos44.setText(String.valueOf(this.partida.j1.getFicha()));
                this.btPos44.setBackground(colorj1);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j1.obtenerNombre() + "\n");
                
                if(this.partida.tab.colocarFicha(4, 4, this.partida.j1.getFicha())){
                    int respuesta = JOptionPane.showInternalConfirmDialog(null,"¿Desea Jugar La Revancha?");

                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.partida.finalizarPartida();
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }
                    
                }
                     
            } else {
                this.btPos44.setText(String.valueOf(this.partida.j2.getFicha()));
                this.btPos44.setBackground(colorj2);
                this.txtConsola.setText(this.txtConsola.getText() + "Ha jugado " + this.partida.j2.obtenerNombre() + "\n");
                
                if(this.partida.tab.colocarFicha(4, 4, this.partida.j2.getFicha())){
                    int respuesta = JOptionPane.showInternalConfirmDialog(null,"¿Desea Jugar La Revancha?");
                    switch (respuesta) {
                        case JOptionPane.YES_OPTION:
                            this.partida.finalizarPartida();
                            this.reiniciarTablero();
                            break;
                        case JOptionPane.NO_OPTION:
                            this.dispose();
                            lobby p = new lobby();
                            p.setVisible(true);
                            break;
                        default:
                            this.dispose();
                            break;
                    }
                    
                }
            }
            
            this.partida.cambiarTurno();
        }
    }//GEN-LAST:event_btPos44ActionPerformed

    private void BtReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtReiniciarActionPerformed

        this.reiniciarTablero();
        // TODO add your handling code here:
    }//GEN-LAST:event_BtReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Tablero5x5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero5x5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero5x5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero5x5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero5x5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtReiniciar;
    private javax.swing.JToggleButton btPos00;
    private javax.swing.JToggleButton btPos01;
    private javax.swing.JToggleButton btPos02;
    private javax.swing.JToggleButton btPos03;
    private javax.swing.JToggleButton btPos04;
    private javax.swing.JToggleButton btPos10;
    private javax.swing.JToggleButton btPos11;
    private javax.swing.JToggleButton btPos12;
    private javax.swing.JToggleButton btPos13;
    private javax.swing.JToggleButton btPos14;
    private javax.swing.JToggleButton btPos20;
    private javax.swing.JToggleButton btPos21;
    private javax.swing.JToggleButton btPos22;
    private javax.swing.JToggleButton btPos23;
    private javax.swing.JToggleButton btPos24;
    private javax.swing.JToggleButton btPos30;
    private javax.swing.JToggleButton btPos31;
    private javax.swing.JToggleButton btPos32;
    private javax.swing.JToggleButton btPos33;
    private javax.swing.JToggleButton btPos34;
    private javax.swing.JToggleButton btPos40;
    private javax.swing.JToggleButton btPos41;
    private javax.swing.JToggleButton btPos42;
    private javax.swing.JToggleButton btPos43;
    private javax.swing.JToggleButton btPos44;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtConsola;
    // End of variables declaration//GEN-END:variables
}
