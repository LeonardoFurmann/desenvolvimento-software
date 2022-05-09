package pacote;


import java.util.Scanner;

public class Programa {
	static int x = 2;
	static Scanner leitor = new Scanner(System.in);
	public static void main(String[] args) {	
		
		
		Colorida[][] cores = new Colorida[x][x];
		float[][] cinza = new float[x][x];
		boolean  ver = false;
		
		Colorida novaCor = new Colorida();
		int op;
		
	do {
		 op = Menu();
		switch(op){
		
		case 1:
			novaCor.Preencher(cores);
			ver = true;
		break;
		
		case 2:
		if(ver) {
			novaCor.Transformar(cores, cinza);
		}else { System.out.println("\n� necess�rio preencher a op��o 1 primeiro");}
		break;
		
		case 3:
		if(ver) {
			novaCor.Imprimir(cores,cinza);
		}else { System.out.println("\n� necess�rio preencher a op��o 1 primeiro");}
		break;
		}
		
	}while(op!=4);	
		
	System.out.println( op == 4 ? "Saiu!" : "");
		
	}

//	private static void Imprimir(Colorida[][] cor, float[][] cinza) {
//			
//		System.out.println("\n\n*** Imagem Colorida (R,G,B) ***");
//		for (int i = 0; i < x; i++) {
//			System.out.println();
//			for (int j = 0; j < x; j++) {
//				
//			System.out.printf("%d,%d,%d", cor[i][j].r, cor[i][j].g, cor[i][j].b );
//			System.out.printf(" | ");
//			
//			
//			}
//		}
//		
//		System.out.println("\n\n***** Imagem em Tons de Cinza ******");
//		for (int i = 0; i < x; i++) {
//			System.out.println();
//			for (int j = 0; j < x; j++) {	
//			System.out.print(cinza[i][j]);
//			System.out.printf(" | ");
//			
//			
//			}
//		}	
//	}

//	private static void Transformar(Colorida[][] cor, float[][] cinza) {
//		
//		
//		int[][] temp = new int[x][x];
//		
//		for (int i = 0; i < x; i++) {
//			for (int j = 0; j < x; j++) {
//				
//				 temp[i][j] = (cor[i][j].r + cor[i][j].g + cor[i][j].b)/x;
//				 cinza[i][j] = temp[i][j];
//				
//			}
//		}
//		
//		System.out.println("\nTransformou!");
//		
//	}

//	private static void Preencher(Colorida[][] cor) {
//		
//		System.out.println("\n\n*** Preencher ***\n");
//		
//		for (int i = 0; i < x; i++) {
//			for (int j = 0; j < x; j++) {
//			
//				Colorida novaCor = new Colorida();
//			
//			do {
//				System.out.printf("Digite o valor[%d][%d] da cor R: " ,  i+1, j+1);
//				novaCor.r = leitor.nextInt();
//				
//			System.out.println(novaCor.r > 255 ? "O valor n�o pode ser maior que 255, digite novamente\n" : "");
//			
//			}while(novaCor.r < 0 || novaCor.r > 255 );
//			
//			do {
//				System.out.printf("Digite o valor[%d][%d] da cor G:" ,  i+1, j+1);
//				novaCor.g = leitor.nextInt();
//				
//			System.out.println(novaCor.g < 0 || novaCor.g > 255 ? "O valor n�o pode ser maior que 255, digite novamente\n" : "");
//				
//			}while(novaCor.g > 255);
//
//			do {
//				System.out.printf("Digite o valor[%d][%d] da cor B:" ,   i+1, j+1);
//				novaCor.b = leitor.nextInt();
//				
//			System.out.println(novaCor.b < 0 || novaCor.b > 255 ? "O valor n�o pode ser maior que 255, digite novamente\n" : "");
//				
//			}while(novaCor.b > 255);	
//			
//			System.out.println();
//			
//				cor[i][j] = novaCor;
//			
//			}			
//		}
//		
//		
//	}

	private static int Menu() {
		int op;
		
		do {
		System.out.println("\n\n*** Menu ***\n");
			System.out.println("1.	Preencher a imagem colorida");
			System.out.println("2.	Transformar em Tons de Cinza");
			System.out.println("3.	Imprimir as 2 imagens");
			System.out.println("4. 	Sair");
			System.out.print("\nDigite sua op��o: ");
			 op = leitor.nextInt();
		}while(op < 1 || op > 4);
		return op;
		
	}

	
	}

