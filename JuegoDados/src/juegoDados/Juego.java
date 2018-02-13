package juegoDados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		
		//elegir dado: cuantos y cuantas caras  
		Scanner sc=new Scanner(System.in);  
	    System.out.println("Cantidad de caras");  
		int entraCaras=sc.nextInt();  
		
		Scanner sc1=new Scanner(System.in);  
	    System.out.println("Cantidad de dados");  
		int entraDados=sc1.nextInt();  
		
		ArrayList<Dado> dados= new ArrayList<Dado>();
		for (int i=1; i<=entraDados; i++){
			dados.add(new Dado(entraCaras)); }
		
//        ArrayList<Dado> dados= new ArrayList<Dado>(Arrays.asList
//        		(new Dado(entraCaras)));
		
		//llenar vaso
		Vaso vaso = new Vaso(dados);

		//tirar dados
		ArrayList<Integer> resultados = vaso.tiraDados();
		
		System.out.println("Los resultados son...");
		
		resultados.forEach(resultado -> System.out.println(resultado));
	}

}
// para mañanaÑ q el user diga ctos dados va a meter