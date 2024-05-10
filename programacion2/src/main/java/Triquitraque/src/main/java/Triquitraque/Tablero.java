/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Triquitraque;

import javax.swing.JOptionPane;

/**
 *
 * @author Equipo
 */
public final class Tablero {

    private final char[][] tablero;

    public Tablero(int x, int y) {
        tablero = new char[x][y];
        this.mostrarTablero();
    }

    public char[][] getTablero() {
        return tablero;
    }

    public void mostrarTablero() {
        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero.length; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    public boolean verificarEmpate() {
        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero.length; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean hayGanador(char ficha) {
        return hayGanadorEnFilas(ficha) || hayGanadorEnColumnas(ficha) || hayGanadorEnDiagonales(ficha);
    }

    private boolean hayGanadorEnFilas(char ficha) {
        for (int i = 0; i < tablero.length; i++) {
            boolean ganador = true;
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] != ficha) {
                    ganador = false;
                }
            }
            if (ganador) {
                return true;
            }
        }
        return false;
    }

    private boolean hayGanadorEnColumnas(char ficha) {
        for (int i = 0; i < tablero.length; i++) {
            boolean ganador = true;
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[j][i] != ficha) {
                    ganador = false;
                }
            }
            if (ganador) {
                return true;
            }
        }
        return false;
    }

    private boolean hayGanadorEnDiagonales(char ficha) {
        boolean ganadorDiagonalPrincipal = true;
        boolean ganadorDiagonalSecundaria = true;
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i][i] != ficha) {
                ganadorDiagonalPrincipal = false;
            }
            if (tablero[i][tablero.length - 1 - i] != ficha) {
                ganadorDiagonalSecundaria = false;
            }
        }
        return ganadorDiagonalPrincipal || ganadorDiagonalSecundaria;
    }

    public boolean colocarFicha(int fila, int columna, char ficha) {
        tablero[fila][columna] = ficha;

        if (hayGanador(ficha)) {
            JOptionPane.showMessageDialog(null, "el ganador ha sido el jugador de la ficha: " + ficha);
            return true;
        } else if (verificarEmpate()) {
            JOptionPane.showMessageDialog(null, "La partida queda en empate");
            return true;
        }

        return false;

    }

    @Override
    public String toString() {
        return "Tablero{" + "tablero=" + tablero + '}';
    }

}
