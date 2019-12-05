## Dev Code ##

import java.util.Scanner;



public class Metodos {
	
	Scanner in = new Scanner (System.in);
    
	   public void mediaAritmetica(){
	       
		//Calculo da Media Aritmética
		//Feito Por Iago Juan Chaves
		        
		        int totalAmostras;
		        double soma1;
		        double soma2 =0;    
		        double media;
		        String sair = "";
		        while(!sair.contentEquals("b")) {
		        System.out.println(" Calcule sua Média Aritmética ");
		        System.out.println("Quantos amostras você precisa? ");
		        totalAmostras = in.nextInt();
		        while ( totalAmostras > 100 || totalAmostras < 1){
		            System.out.println("O máximo de amostras permitidas é de 100! ");
		             System.out.println("Quantos amostras você precisa? ");
		        totalAmostras = in.nextInt();
		        }
		        for (int i = totalAmostras; i > 0;i--){
		        System.out.println("Digite o valor: ");
		        soma1 = in.nextFloat();
		        soma2 = (soma1 + soma2);
		        }
		        media = (soma2/ totalAmostras);
		          System.out.println("A média aritmética é "+ media); 
		          System.out.println("----------");
		          System.out.println("Digite [B] para sair ou [C] para continuar");
		          sair = in.next();
		        }
		        }
		      //Fim do Calculo aritmético
	    
	   public void mediaPonderada(){
	      
	       //Calculo da Media Ponderada 
		  //Feito Por Iago Juan Chaves
		   
	       double ap1,ap2,ap3,soma;
	       String sair = "";
	        while(!sair.contentEquals("b")) {
	       System.out.println("Calcule sua Média Ponderada ");
	       System.out.println("Digite sua nota da AP1");
	       ap1 = in.nextDouble();
	       System.out.println("Digite sua nota da AP2");
	       ap2 = in.nextDouble();
	       System.out.println("Digite sua nota da AP3");
	       ap3 = in.nextDouble();
	       soma = ((ap1 * 0.20)+(ap2 * 0.30)+(ap3* 0.50 ));
	       System.out.println("Sua média é "+soma);
	       System.out.println("____________");
	       System.out.println("Digite [B] para sair ou [C] para continuar");
	       sair = in.next();
	   }
	   }
	   
	   //Fim do calculo da Média Ponderada
	   
	   public void mediana(){
	       
		   //Calculo da Mediana
		 //Feito Por Marcos Eduardo Gontijo
		   
		   String sair = "";
	        while(!sair.contentEquals("b")) {
		   System.out.println("Calcule sua Mediana ");
	       System.out.println("Total de amostras: ");
	       int totalAmostras = in.nextInt();
	       int[] arr = new int[totalAmostras];
	       
	       for(int i = 0; i < totalAmostras; i++) {
	           System.out.println("Digite um número: ");
	        arr[i] = in.nextInt();
	       }
	       
	       if(totalAmostras % 2 == 1){
	           int soma = (totalAmostras)/2;
	           System.out.println(arr[soma]);
	                 
	       }else{ 
	           float soma = arr[(totalAmostras/2)-1] + arr[(totalAmostras/2)];
	           System.out.println("O valor da mediana inserido é de " + soma/2);
	           System.out.println("_____________");
	        }
	       System.out.println("Digite [B] para sair ou [C] para continuar");
	       sair = in.next();
 }
	}
	   	//Fim do Calculo da Mediana 
	   
	       public void amplitude(){
	    	   
	    	   //Calculo da amplitude
	    	 //Feito Por Marcos Eduardo Gontijo
	    	   
	    	   
	    	   String sair = "";
System.out.println(" Calcule a Amplitude ");
	 while(!sair.contentEquals("b")) {
	   System.out.println("Total de amostras: ");
	       int totalAmostras = in.nextInt();
	       int[] arr = new int[totalAmostras];
	       for(int i = 0; i < totalAmostras; i++) {
	           System.out.println("Digite um número: ");
	        arr[i] = in.nextInt();
	         }
	       
 int sub= arr[totalAmostras -1] - arr[0];
System.out.println("O valor da amplitude é: "+ sub);
  System.out.println("_________");
	   System.out.println("Digite [B] para sair ou [C] para continuar");
	     sair = in.next();
		 }
	   }
	       //Fim do calculo da amplitude
	       
	       public void variancia(){
	    	   
	    	   //Calculo da variancia
	    	   //Feito Por Iago Juan Chaves
	    	   
	    	   Scanner in = new Scanner (System.in);
	   System.out.println("Calcule a Variância");
   String sair = "";   
while(!sair.contentEquals("b")) {
  System.out.println("Total de amostras: ");
int totalAmostras = in.nextInt();
	int[] arr = new int[totalAmostras];
	   double s = 0;
	     int n = 0;
	    	int soma = 0;
	    	  double resultado=0;
	    		       
	    		       
	    for(int i = 0; i < totalAmostras; i++) {
	     System.out.println("Digite um número: ");
	    	arr[i] = in.nextInt();
	        }
	    	  for(int i = 0; i < totalAmostras; i++) {
	    	  soma = arr[i] + soma; 
	    	}
	       n = (soma/totalAmostras);
	       for (int i =0;i < totalAmostras; i++) {
	       s = (arr[i]-n);
	       resultado += (s*s);          
	    	  }    
	       
	   System.out.println("O valor da Variança é "+ resultado/(totalAmostras -1));
	    		        
	  System.out.println("________________");
	    		       
	   System.out.println("Digite [B] para sair ou [C] para continuar");
	     sair = in.next(); 
	     }
	       }
	       	//Fim do calculo da variança

	       public void App(){
	    	   // Sobre o aplicativo
	    	  //Feito por Gabriel Girotto Zambaldi
	    	   
	    	   String sair = "";
	    	   while(!sair.contentEquals("b")) {
	    		   
	           System.out.println( "Esse aplicativo foi inteiramente desenvolvido em Java pelos alunos de Analise e Desenvolvimento de sistemas da UniMetrocamp \r\n" + 
		           		"O aplicativo foi desenvolvido como aproveito dado pelas aulas de Programação Orientada a objetos Ministradas pelo professor Odair com enfâse em Java.\r\n" + 
		           		"O intuito do aplicativo foi de auxiliar o professor Marcos com sua dificuldade em corrigir todos os exercicios de seus alunos e a espera dos mesmos para que seja atendidos pelo professor.\r\n");
	          
	           System.out.println("_________");
	           
	           System.out.println("Digite [B] para sair   ");
		       sair = in.next();
	    	   }
	           
	       }
	       public void devs(){
	    	   
	    	   //Sobre os desenvolvedores que contribuiram no trabalho.
	    	  //Feito por Gabriel Girotto Zambaldi
	    	   
	    	   String sair = "";
	    	   while(!sair.contentEquals("b")) {
	    		   
	    	   
	    	   System.out.println("O aplicativo foi desenvolvido pelos alunos: ");
	           System.out.println("Iago Juan Chaves Rodrigues Salviano RA: 1911514267");
	           System.out.println("_____________");	           
	           System.out.println("Gabriel Girotto Zambaldi RA: 1911514366");
	           System.out.println("_____________");
	           System.out.println("Marcos Eduardo Gontijo RA: 1911511906");
	           System.out.println("_____________");
	           System.out.println("Ivan Vitor RA 1921519256");
	           System.out.println("_____________");
	           System.out.println("Victor Valério Scarmen RA 1911515494");
	           System.out.println("Digite [B] para sair   ");
		       sair = in.next();            
	}
	}
	}
