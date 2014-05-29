package utfpr.dainf.if62c.pratica;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * por Tomás Abril
 */


public class Pratica43
{
    public static void main(String[] args) {
	Quadrado quad = new Quadrado(4);
	
	System.out.println("perimetro quadrado: " + quad.getPerimetro());
	System.out.println("quadrado area: " + quad.getArea());
	
	Retangulo ret = new Retangulo(4, 1);
	
	System.out.println("Retangulo perimetro : " + ret.getPerimetro());
	System.out.println("Retangulo area: " + ret.getArea());
	
	TrianguloEquilatero tri = new TrianguloEquilatero(4);
	
	System.out.println("TrianguloEquilatero perimetro : " + tri.getPerimetro());
	System.out.println("TrianguloEquilatero area: " + tri.getArea());
    }
}
