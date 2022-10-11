/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author Alumno Mañana
 */
public class Rectangulo extends FiguraGeometrica{
    private String alto;
    private String ancho;

    public Rectangulo(String alto, String ancho, String tipoFigura) {
        super(tipoFigura);
        this.alto = alto;
        this.ancho = ancho;
    }

    public String getAlto() {
        return alto;
    }

    public void setAlto(String alto) {
        this.alto = alto;
    }

    public String getAncho() {
        return ancho;
    }

    public void setAncho(String ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "alto=" + alto + ", ancho=" + ancho + '}';
    }
         
}
