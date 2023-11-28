package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Sinais;

public class Test {
	// String 
			static String texto(String j){
				return JOptionPane.showInputDialog(j);
			}
			
			// Inteiro
			static int inteiro (String j) {
	           return Integer.parseInt(JOptionPane.showInputDialog(j));
		}
			//Double
			static double real (String j) {
				return Double.parseDouble(JOptionPane.showInputDialog(j));
			}
			
			//Media da Pa
			static double valorPa(Sinais[] p, int i) {
				double Pa = 0;
				for (int c =00 ;c < i  ; c++) {
					Pa += (p[c].getPad()* 2+p[c].getPas())/3;
				}
				return Pa;
			}
			
			


	public static void main(String[] args) {
		//instanciar objetos 
       //Preparando posições
		  Sinais [] vetorSinais = new Sinais[4]; 
		//controlar as posições de vetor(Indice)
		  int indice = 0;
		  
		  do {
			  vetorSinais[indice] = new Sinais ();
			  vetorSinais[indice].setHumor(texto("Como você está se sentindo hoje?:"));
			  vetorSinais[indice].setPas(inteiro("Qual foi o resultado da sua Presão Sistolica?:(Seria a maior)"));
			  vetorSinais[indice].setPad(inteiro("Qual foi o resultado da sua Pressão Diastolica?:(Seria a menor)"));
			  vetorSinais[indice].setGlicemia(inteiro("Qual foi o resultado do seu Dextro?:"));
			  vetorSinais[indice].setTemp(real("Qual o valor da sua temperatura?:"));
			  vetorSinais[indice].setFc(inteiro("Qual foi o numero de batimentos cardicos ?:"));
			  vetorSinais[indice].setSat(inteiro("Qual foi o nivel de o2 apresentado?:"));
			  
			  indice++;
			  
		  }while( JOptionPane.showConfirmDialog(null, "Ouve Alguma alteração?",
					"Sinais Vitais", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) ==0);
		  for(int contador = 0; contador < indice; contador++ ){
			  System.out.println(
					  "\n\nComo você esta se sentindo hoje:"+vetorSinais[contador].getHumor()+
					  "\nSua pressão Sistolica (Pressão Maior):"+vetorSinais[contador].getPas()+
					  "\nSua pressão Diastolica:(Pressão Menor :"+vetorSinais[contador].getPad()+
					  "\n Media da PA:"+valorPa(vetorSinais, indice)+
					  "\nSua Glicemia Capilar deu:"+vetorSinais[contador].getGlicemia()+
					  "\nSua Temperatura: " + vetorSinais[contador].getTemp()+
					  "\nFrequencia Cardica:"+ vetorSinais[contador].getFc()+
					  "\nSua Saturação :" + vetorSinais[contador].getSat()
					  );
		  }
	}

}
