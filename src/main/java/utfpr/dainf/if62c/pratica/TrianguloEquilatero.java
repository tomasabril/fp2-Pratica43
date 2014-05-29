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
public class TrianguloEquilatero extends Retangulo {
	
	public TrianguloEquilatero(double lado) {
		super(lado, lado); }
	
	@Override
	public double getPerimetro() {
		return ladoMenor*3;	}

	@Override
	public double getArea() {
		return ladoMenor*ladoMaior/2; }
}
