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
public class Elipse implements FiguraComEixos {
    protected double eixo1;
    protected double eixo2;
    
    public Elipse(double eixo1, double eixo2) {
        this.eixo1 = eixo1;
        this.eixo2 = eixo2; }
    
    @Override
    public double getArea() {
        return Math.PI*this.eixo1*this.eixo2; }
    
    @Override
    public double getPerimetro() {
        return Math.PI*(3*(this.eixo1+this.eixo2)-Math.sqrt
        ((3*this.eixo1+this.eixo2)*(this.eixo1+3*this.eixo2))); }
    
    @Override
    public String getNome() {
        return this.getClass().getSimpleName(); }
    
    @Override
    public double getEixoMenor() {
        if(eixo1<eixo2) {
            return eixo1; }
        else {
            return eixo2; } }
    
    @Override
    public double getEixoMaior() {
        if(eixo1>eixo2) {
            return eixo1; }
        else {
            return eixo2; } }
}
