
public class Funcionario {

	private int codigo;
	private String nome;
	private String funcao;	

	public Funcionario() {
		setCodigo(-1);
		setNome("");
		setFuncao("");
	}

	public Funcionario(int codigo, String nome, String funcao) {
		super();
		setCodigo(codigo);
		setNome(nome);
		setFuncao(funcao);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
/*
	// Adiciona Objeto Funcionario a Lista de Funcionários
	public void adicionarFuncionario(Funcionario f) {
		listaFuncionario.add(f);
	}

	// Remove da Lista de Funcionários através do Objeto Funcionario e não pela
	// sua index;
	public void removerFuncionario(Funcionario f) {
		listaFuncionario.remove(f);
	}
	
	//Remove Funcionário atráves do numero da Index;
	public void removeFuncionarioIndex(int index) {
		listaFuncionario.remove(index);
	}

	//Retorna tamanho da lista de funcionários
	public int getTamanhoLista() {
		if (listaFuncionario.size() > 0)
			return listaFuncionario.size();
		else
			return 0;
	}

	//Localiza funcionário através do Objeto 
	public boolean localizarFuncionario(Funcionario f) {
		if (listaFuncionario.contains(f))
			return true;
		else
			return false;
	}

	//Localiza funcionário e retorna a posição na lista;
	public int posicaoFuncionario(Funcionario f) {
		if (listaFuncionario.indexOf(f) > 0) {
			return listaFuncionario.indexOf(f);
		} else
			return -1;
	}

	//Verifica se a Lista está vazia;
	public boolean listaVazia() {
		if (listaFuncionario.isEmpty())
			return true;
		else
			return false;

	}
	
	//Remove todos os objetos da Lista
	public void limparLista() {
		listaFuncionario.clear();
	}
*/
	@Override
	public String toString() {
		return "Funcionario [codigo=" + codigo + ", nome=" + nome + ", funcao="
				+ funcao + "]";
	}


	
}
