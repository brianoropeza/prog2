/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

import java.util.Random;

/**
 *
 * @author Equipo
 */
import java.util.Random;

public class Persona {

    private String nombre;
    private int edad;
    private String cedula;
    private char sexo;
    private double peso;
    private double altura;

    private static final char SEXO_POR_DEFECTO = 'H';
    private static final int PESO_IDEAL_BAJO = -1;
    private static final int PESO_IDEAL_NORMAL = 0;
    private static final int PESO_IDEAL_ALTO = 1;

    public Persona() {
        generaCedula();
    }

    public Persona(String nombre, int edad, char sexo) {
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
    }

    public Persona(String nombre, int edad, String cedula, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", edad=" + edad + ", cedula=" + cedula + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

    public int calcularIMC() {
        double imc = peso / Math.pow(altura, 2);

        if (imc < 20) {
            return PESO_IDEAL_BAJO;
        } else if (imc >= 20 && imc <= 25) {
            return PESO_IDEAL_NORMAL;
        } else {
            return PESO_IDEAL_ALTO;
        }

    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public char comprobarSexo(char sexo) {
        return (sexo == 'H' || sexo == 'M') ? sexo : SEXO_POR_DEFECTO;
    }

    public String generaCedula() {
        Random rand = new Random();
        StringBuilder cedulaGenerada = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            cedulaGenerada.append(rand.nextInt(10));
        }
        cedula = cedulaGenerada.toString();
        return cedula;
    }

}
