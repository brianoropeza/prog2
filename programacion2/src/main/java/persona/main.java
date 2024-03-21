/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author Equipo
 */
public class main {

    public static void main(String[] args) {

        Persona persona = new Persona("brian", 12, "", 'H', 70.0, 1.72);

        System.out.println("Persona - Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad() + ", Cédula: " + persona.generaCedula() + ", Sexo: " + persona.getSexo() + ", Peso: " + persona.getPeso() + ", Altura: " + persona.getAltura());

        int imcPersona = persona.calcularIMC();

        imprimirResultadoIMC(persona, imcPersona);

        boolean mayorDeEdadPersona = persona.esMayorDeEdad();

        System.out.println("Persona  es mayor de edad: " + mayorDeEdadPersona);

    }

    private static void imprimirResultadoIMC(Persona persona, int imc) {
        switch (imc) {
            case -1 ->
                System.out.println(persona.getNombre() + " Tiene un incremento de masa corporal por debajo de su peso ideal.");
            case 0 ->
                System.out.println(persona.getNombre() + " Está en su peso ideal.");
            default ->
                System.out.println(persona.getNombre() + " Tiene sobrepeso.");
        }
    }
}
