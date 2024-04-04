/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodoSemana8;

/**
 *
 * @author Equipo
 */
public class mainTriangulo {
      public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(3, 4, 5);
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
        System.out.println("Hipotenusa del triángulo: " + triangulo.calcularHipotenusa());
    }
    
}
