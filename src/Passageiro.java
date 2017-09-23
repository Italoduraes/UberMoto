
public class Passageiro {
	
	
	private String nome;
	private int idade;
	private String cidade;
	private String UF;
	
	
	// metodo construtor 
	public Passageiro(String nome, int idade, String cidade, String uF) {
		this.nome = nome;
		this.idade = idade;
		this.cidade = cidade;
		UF = uF;
	}	
	
	
	
	// metodo get e set 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
