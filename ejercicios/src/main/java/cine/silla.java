/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine;

/**
 *
 * @author Equipo
 */
public class silla {
    private int numeroSilla;
    private String letraSilla;
    private String tipoSilla;
    private String colorSilla;

    public silla() {
    }

    public silla(int numeroSilla, String letraSilla, String tipoSilla, String colorSilla) {
        this.numeroSilla = numeroSilla;
        this.letraSilla = letraSilla;
        this.tipoSilla = tipoSilla;
        this.colorSilla = colorSilla;
    }

    public int getNumeroSilla() {
        return numeroSilla;
    }

    public void setNumeroSilla(int numeroSilla) {
        this.numeroSilla = numeroSilla;
    }

    public String getLetraSilla() {
        return letraSilla;
    }

    public void setLetraSilla(String letraSilla) {
        this.letraSilla = letraSilla;
    }

    public String getTipoSilla() {
        return tipoSilla;
    }

    public void setTipoSilla(String tipoSilla) {
        this.tipoSilla = tipoSilla;
    }

    public String getColorSilla() {
        return colorSilla;
    }

    public void setColorSilla(String colorSilla) {
        this.colorSilla = colorSilla;
    }

    @Override
    public String toString() {
        return "silla{" + "numeroSilla=" + numeroSilla + ", letraSilla=" + letraSilla + ", tipoSilla=" + tipoSilla + ", colorSilla=" + colorSilla + '}';
    }
    
    
}
