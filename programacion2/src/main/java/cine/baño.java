/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine;

/**
 *
 * @author Equipo
 */
public class baño {
    private String genero;
    private String lavamanos;
    private String espejos;
    private String inodoros;
    private String urinal;

    public baño() {
    }

    public baño(String genero, String lavamanos, String espejos, String inodoros, String urinal) {
        this.genero = genero;
        this.lavamanos = lavamanos;
        this.espejos = espejos;
        this.inodoros = inodoros;
        this.urinal = urinal;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getLavamanos() {
        return lavamanos;
    }

    public void setLavamanos(String lavamanos) {
        this.lavamanos = lavamanos;
    }

    public String getEspejos() {
        return espejos;
    }

    public void setEspejos(String espejos) {
        this.espejos = espejos;
    }

    public String getInodoros() {
        return inodoros;
    }

    public void setInodoros(String inodoros) {
        this.inodoros = inodoros;
    }

    public String getUrinal() {
        return urinal;
    }

    public void setUrinal(String urinal) {
        this.urinal = urinal;
    }

    @Override
    public String toString() {
        return "ba\u00f1o{" + "genero=" + genero + ", lavamanos=" + lavamanos + ", espejos=" + espejos + ", inodoros=" + inodoros + ", urinal=" + urinal + '}';
    }
    
    
}
