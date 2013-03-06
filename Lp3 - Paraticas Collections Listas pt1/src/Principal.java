import java.util.ArrayList;


public class Principal {
	public static void main(String[] args) {
		//1) Instanciar 5 funcionários (f1, f2, f3, f4, f5). 
		Funcionario f1 = new Funcionario(1, "UM", "Mestre de Obras");
		Funcionario f2 = new Funcionario(2, "DOIS", "Analista");
		Funcionario f3 = new Funcionario(3, "TRÊS", "Programador");
		Funcionario f4 = new Funcionario(4, "QUATRO", "Pintor");
		Funcionario f5 = new Funcionario(5, "CINCO", "Jornaleiro");
				
		ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
		
		//2) Adicionar apenas os funcionários f1, f2, f4 e f5 em uma lista.
		listaFuncionario.add(f1);
		listaFuncionario.add(f2);
		listaFuncionario.add(f4);
		listaFuncionario.add(f5);
		
		//3) Imprimir a lista
		System.out.println(listaFuncionario);
		
		//4) Perguntar para a lista a quantidade de funcionários contidos na lista. 
		System.out.println("Tamanho total da Lista: " + listaFuncionario.size());
		
		
		//5) Perguntar para a lista se o funcionário f2 se encontra na lista. 		
		localizarFuncionario(listaFuncionario, f2);		
		
		//6) Perguntar para a lista se o funcionário f3 se encontra na lista. 
		localizarFuncionario(listaFuncionario, f3);
		
		//7) Perguntar para a lista a posição do funcionário f2 (método indexOf).
		posicaoFuncionario(listaFuncionario, f2);
				
		//8) Perguntar para a lista a posição do funcionário f3. 
		posicaoFuncionario(listaFuncionario, f3);
		
		//9) Remover o funcionário f2 da lista (método remove(E)). Imprima a lista na tela para confirmar. 
		listaFuncionario.remove(f2);
		System.out.println(listaFuncionario);
		
		//10) Remover o segundo funcionário da lista, ou seja, o funcionário que está na posição 1 (método remove(int index)). Imprima a lista para confirmar
		listaFuncionario.remove(1);
		System.out.println(listaFuncionario);
		
		//11) Perguntar se a lista está vazia (método isEmpty). 
		listaVazia(listaFuncionario);
		
		//12) Limpar a lista (método clear). 
		listaFuncionario.clear();
		
		//13) Perguntar se a lista está vazia.
		listaVazia(listaFuncionario);
		
	}
	
	//Localiza funcionário através do Objeto 
	private static void localizarFuncionario(ArrayList<Funcionario> listaFuncionario, Funcionario f) {
		if (listaFuncionario.contains(f))
			System.out.println("Funcionário " + f.getNome() + " está na lista");
		else
			System.out.println("Funcionário " + f.getNome() + " não está na lista");
	}
	
	//Localiza funcionário e retorna a posição na lista;
	private static void posicaoFuncionario(ArrayList<Funcionario> listaFuncionario,Funcionario f) {
		if (listaFuncionario.indexOf(f) > 0) {
			System.out.println("Posição do " + f.getNome() + " : " + listaFuncionario.indexOf(f)); 
		} else
			System.out.println("Funcionário não localizado.");
	}
	
	//Verifica se a Lista está vazia;
	private static void listaVazia(ArrayList<Funcionario> listaFuncionario) {
		if (listaFuncionario.isEmpty())
			System.out.println("Lista está vazia");
		else
			System.out.println("Lista não está vazia");

	}
	
}
