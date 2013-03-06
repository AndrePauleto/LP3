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
		if(listaFuncionario.contains(f2))
			System.out.println("Funcion�rio F2 est� na lista");
		else
			System.out.println("Funcion�rio F2 n�o est� na lista");
		
		//6) Perguntar para a lista se o funcion�rio f3 se encontra na lista. 
		if(listaFuncionario.contains(f3))
			System.out.println("Funcion�rio F3 est� na lista");
		else
			System.out.println("Funcion�rio F3 n�o est� na lista");
		
		//7) Perguntar para a lista a posi��o do funcion�rio f2 (m�todo indexOf).
		System.out.println("Posi��o do F2: " + listaFuncionario.indexOf(f2));
		
		
		//8) Perguntar para a lista a posi��o do funcion�rio f3. 
		System.out.println("Posi��o do F3: " + listaFuncionario.indexOf(f3));
		
		//9) Remover o funcion�rio f2 da lista (m�todo remove(E)). Imprima a lista na tela para confirmar. 
		listaFuncionario.remove(f2);
		System.out.println(listaFuncionario);
		
		//10) Remover o segundo funcion�rio da lista, ou seja, o funcion�rio que est� na posi��o 1 (m�todo remove(int index)). Imprima a lista para confirmar
		listaFuncionario.remove(1);
		System.out.println(listaFuncionario);
		
		//11) Perguntar se a lista est� vazia (m�todo isEmpty). 
		if(listaFuncionario.isEmpty())
			System.out.println("Lista est� vazia");
		else
			System.out.println("Lista n�o est� vazia");
		
		//12) Limpar a lista (m�todo clear). 
		listaFuncionario.clear();
		
		//13) Perguntar se a lista est� vazia.
		if(listaFuncionario.isEmpty())
			System.out.println("Lista est� vazia");
		else
			System.out.println("Lista n�o est� vazia");
		
		/*f1.adicionarFuncionario(f1);
		f2.adicionarFuncionario(f2);
		f4.adicionarFuncionario(f4);
		f5.adicionarFuncionario(f5);*/
		
		
		
	}
}
