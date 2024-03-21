/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerMetodos;

/**
 *
 * @author autor
 */
public class ejercicio1 {
    
     public static double calcularPrecioConDescuento(double precio, double porcentajeDescuento) {
        double descuento = precio * (porcentajeDescuento / 100);
        double precioConDescuento = precio - descuento;
        return precioConDescuento;
    }

    public static void main(String[] args) {
        double precio = 500;
        double porcentajeDescuento = 60;
        
        double precioConDescuento = calcularPrecioConDescuento(precio, porcentajeDescuento);
        
        System.out.println("El precio final con descuento es: " + precioConDescuento);
    }
  }


