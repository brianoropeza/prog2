/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodoSemana8;

/**
 *
 * @author Equipo
 */
public class mainCirculo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);

        double area = circulo.calcularArea();
        System.out.println("Área del círculo: " + area);

        double perimetro = circulo.calcularPerimetro();
        System.out.println("Perímetro del círculo: " + perimetro);
    }
}
