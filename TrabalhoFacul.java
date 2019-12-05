import java.util.Scanner;


public class TrabalhoFacul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner (System.in);
	        Metodos meto = new Metodos();
	      boolean sair = true;
	       while (sair){
	        System.out.println(" O que você deseja calcular? \n");
	        System.out.println("Digite uma opção para continuar: \n");
	        System.out.println("[1]Média Aritmética");
	        System.out.println("[2]Média Ponderada");
	        System.out.println("[3]Mediana");
	        System.out.println("[4]Variancia");
	        System.out.println("[5]Amplitude");
	        System.out.println("[6]Cenário do App");
	        System.out.println("[7]Desenvolvedores");
	        System.out.println("[8]Sair do programa");
	        System.out.println("_______________________________________");
	        int opcao = in.nextInt();
	        switch (opcao){
	     case 1:
	         meto.mediaAritmetica();
	             break;
	                case 2:
	                    meto.mediaPonderada();
	                    	break;
	                case 3:
	                    meto.mediana();
	                    	break;
	       case 4:
	        meto.amplitude();
	         break;
	 case 5:    
	  meto.variancia();
	    break;
	          case 6:
	           meto.App();
	            break;
	                case 7:
	                    meto.devs();
	                    	break;
				                case 8:
				                    sair = false;
				                    	break;
	                default:
	                    System.out.println("Digite um valor válido");
	                    	break;
	      }
	    } 
	}
}
