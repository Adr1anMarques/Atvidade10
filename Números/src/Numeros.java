import java.util.Scanner;

public class Numeros {
	   private int[] números = new int[10];
	    private Scanner scanner = new Scanner(System.in);

	    public void adicionarNúmero(int posição, int número) {
	        números[posição] = número;
	    }

	    public int buscarNúmero(int número) {
	        for (int i = 0; i < números.length; i++) {
	            if (números[i] == número) {
	                return i;
	            }
	        }
	        return -1; // Retorna -1 se o número não for encontrado
	    }

	    public void executar() {
	        while (true) {
	            System.out.println("Escolha uma opção:");
	            System.out.println("1 - Adicionar número");
	            System.out.println("2 - Buscar número");
	            System.out.println("3 - Sair");
	            System.out.print("Opção: ");

	            int opção = scanner.nextInt();

	            switch (opção) {
	                case 1:
	                    System.out.print("Digite a posição: ");
	                    int posição = scanner.nextInt();
	                    System.out.print("Digite o número: ");
	                    int número = scanner.nextInt();
	                    adicionarNúmero(posição, número);
	                    break;
	                case 2:
	                    System.out.print("Digite o número a ser buscado: ");
	                    int númeroBuscado = scanner.nextInt();
	                    int posiçãoEncontrada = buscarNúmero(númeroBuscado);
	                    if (posiçãoEncontrada != -1) {
	                        System.out.println("O número " + númeroBuscado + " foi encontrado na posição " + posiçãoEncontrada);
	                    } else {
	                        System.out.println("O número " + númeroBuscado + " não foi encontrado");
	                    }
	                    break;
	                case 3:
	                    System.out.println("Saindo...");
	                    return;
	                default:
	                    System.out.println("Opção inválida");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Numeros números = new Numeros();
	        números.executar();
	    }
}
