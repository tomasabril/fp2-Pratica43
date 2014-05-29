/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.dainf.if62c.pratica;

/**
 *
 * @author a1013343
 */
public class Circulo extends Elipse {
    public Circulo (double raio) {
        super(raio, raio); }
    
    @Override
    public double getPerimetro() {
        return 2*Math.PI*eixo1; }
    
}