import java.util.ArrayList;


public class Principal {
	public static void main(String[] args) {
		//1) Instanciar 5 funcion�rios (f1, f2, f3, f4, f5). 
		Funcionario f1 = new Funcionario(1, "UM", "Mestre de Obras");
		Funcionario f2 = new Funcionario(2, "DOIS", "Analista");
		Funcionario f3 = new Funcionario(3, "TR�S", "Programador");
		Funcionario f4 = new Funcionario(4, "QUATRO", "Pintor");
		Funcionario f5 = new Funcionario(5, "CINCO", "Jornaleiro");
				
		ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
		
		//2) Adicionar apenas os funcion�rios f1, f2, f4 e f5 em uma lista.
		listaFuncionario.add(f1);
		listaFuncionario.add(f2);
		listaFuncionario.add(f4);
		listaFuncionario.add(f5);
		
		//3) Imprimir a lista
		System.out.println(listaFuncionario);
		
		//4) Perguntar para a lista a quantidade de funcion�rios contidos na lista. 
		System.out.println("Tamanho total da Lista: " + listaFuncionario.size());
		
		
		//5) Perguntar para a lista se o funcion�rio f2 se encontra na lista. 		
		localizarFuncionario(listaFuncionario, f2);		
		
		//6) Perguntar para a lista se o funcion�rio f3 se encontra na lista. 
		localizarFuncionario(listaFuncionario, f3);
		
		//7) Perguntar para a lista a posi��o do funcion�rio f2 (m�todo indexOf).
		posicaoFuncionario(listaFuncionario, f2);
				
		//8) Perguntar para a lista a posi��o do funcion�rio f3. 
		posicaoFuncionario(listaFuncionario, f3);
		
		//9) Remover o funcion�rio f2 da lista (m�todo remove(E)). Imprima a lista na tela para confirmar. 
		listaFuncionario.remove(f2);
		System.out.println(listaFuncionario);
		
		//10) Remover o segundo funcion�rio da lista, ou seja, o funcion�rio que est� na posi��o 1 (m�todo remove(int index)). Imprima a lista para confirmar
		listaFuncionario.remove(1);
		System.out.println(listaFuncionario);
		
		//11) Perguntar se a lista est� vazia (m�todo isEmpty). 
		listaVazia(listaFuncionario);
		
		//12) Limpar a lista (m�todo clear). 
		listaFuncionario.clear();
		
		//13) Perguntar se a lista est� vazia.
		listaVazia(listaFuncionario);
		
	}
	
	//Localiza funcion�rio atrav�s do Objeto 
	private static void localizarFuncionario(ArrayList<Funcionario> listaFuncionario, Funcionario f) {
		if (listaFuncionario.contains(f))
			System.out.println("Funcion�rio " + f.getNome() + " est� na lista");
		else
			System.out.println("Funcion�rio " + f.getNome() + " n�o est� na lista");
	}
	
	//Localiza funcion�rio e retorna a posi��o na lista;
	private static void posicaoFuncionario(ArrayList<Funcionario> listaFuncionario,Funcionario f) {
		if (listaFuncionario.indexOf(f) > 0) {
			System.out.println("Posi��o do " + f.getNome() + " : " + listaFuncionario.indexOf(f)); 
		} else
			System.out.println("Funcion�rio n�o localizado.");
	}
	
	//Verifica se a Lista est� vazia;
	private static void listaVazia(ArrayList<Funcionario> listaFuncionario) {
		if (listaFuncionario.isEmpty())
			System.out.println("Lista est� vazia");
		else
			System.out.println("Lista n�o est� vazia");

	}
	
}
