import java.util.*;

public class Pessoa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner t=new Scanner (System.in);
		
		String nome;
		double peso;
		double altura;
		String idade;
		
		
		System.out.println ("Digite o seu nome:");
		nome=t.next();
		System.out.println ("Digite o seu peso:");
		peso=t.nextDouble();
		System.out.println ("Digite a sua altura:");
		altura=t.nextDouble();
		System.out.println ("Digite a sua idade:");
		idade=t.next();
	}

}
