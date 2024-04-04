/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodoSemana8;

/**
 *
 * @author Equipo
 */
public class mainCuadrado {
    public static void main(String[] args) {
       
        Cuadrado cuadrado = new Cuadrado(2);

   
        double area = cuadrado.calcularArea();
        System.out.println("Área del cuadrado: " + area);

        double perimetro = cuadrado.calcularPerimetro();
        System.out.println("Perímetro del cuadrado: " + perimetro);
    }
    
}
