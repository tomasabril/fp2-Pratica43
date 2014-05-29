/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.dainf.if62c.pratica;

/**
 *
 * @author tomas
 */
public class Retangulo implements FiguraComLados {
	protected double ladoMenor;
	protected double ladoMaior;

	public Retangulo(double lado1, double lado2) {
		ladoMenor = lado1;
		ladoMaior = lado2; }
	
	@Override
	public double getLadoMenor() {
		return ladoMenor; }

	@Override
	public double getLadoMaior() {
		return ladoMaior; }

	@Override
	public String getNome() {
		return this.getClass().getSimpleName();	}

	@Override
	public double getPerimetro() {
		return ladoMenor*2+ladoMaior*2;	}

	@Override
	public double getArea() {
		return ladoMenor*ladoMaior; }	
}
