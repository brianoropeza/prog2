/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Triquitraque;

/**
 *
 * @author Equipo
 */
public class Main { 

    public static void main(String[] args) {
        Juego juego = new Juego();
        
      
        String nombreJugador1 = "Jugador1";
        String colorJugador1 = "Rojo";
        char fichaJugador1 = 'X';
        
        String nombreJugador2 = "Jugador2";
        String colorJugador2 = "Azul";
        char fichaJugador2 = 'O';
        
        int tamañoTableroX = 3;
        int tamañoTableroY = 3;
        
        int turnoInicial = 1;
        
        juego.iniciarPartida(nombreJugador1, colorJugador1, fichaJugador1, nombreJugador2, colorJugador2, fichaJugador2, tamañoTableroX, tamañoTableroY, turnoInicial);
        
       
        juego.cambiarTurno();
        
        
        juego.finalizarPartida();
    }
}

