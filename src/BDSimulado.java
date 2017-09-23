import java.lang.reflect.Array;
import java.util.ArrayList;

public class BDSimulado {
	
	//Atributos 
	
	private ArrayList<Passageiro> passageiro;
	private ArrayList<Viagem> viagem;
     
    public BDSimulado(){
        //Instanciando as listas
        this.passageiro = new ArrayList<Passageiro>();
        this.viagem = new ArrayList<Viagem>();
         
        //Criando passageiros
        Passageiro p1 = new Passageiro("Maria da Silva", 46, "Brasília", "DF");
        Passageiro p2 = new Passageiro("Ricardo Andrade", 32, "Brasília", "DF");
        Passageiro p3 = new Passageiro("Carolina Pinheiro", 27, "Brasília", "DF");
        Passageiro p4 = new Passageiro("Jhonson Lever", 26, "Brasília", "DF");
        Passageiro p5 = new Passageiro("Cássia Luiza", 15, "São Paulo", "SP");
        Passageiro p6 = new Passageiro("Wesley Rodrigues", 38, "São Paulo", "SP");
        Passageiro p7 = new Passageiro("Josefina Souza", 25, "São Paulo", "SP");
        Passageiro p8 = new Passageiro("Josué Fernandes", 55, "Rio de Janeiro", "RJ");
        Passageiro p9 = new Passageiro("Ana Ribeiro", 20, "Rio de Janeiro", "RJ");
        Passageiro p10 = new Passageiro("João da Silva", 22, "Rio de Janeiro", "RJ");
 
        //Adicionando passageiros
        this.passageiro.add(p1);
        this.passageiro.add(p2);
        this.passageiro.add(p3);
        this.passageiro.add(p4);
        this.passageiro.add(p5);
        this.passageiro.add(p6);
        this.passageiro.add(p7);
        this.passageiro.add(p8);
        this.passageiro.add(p9);
        this.passageiro.add(p10);
         
        //Criando viagens
        Viagem v1 = new Viagem(1, 2016, 1, p1, "Walleerrssonn", 10, 2.50, "Brasília", "DF");
        Viagem v2 = new Viagem(2, 2016, 1, p10, "Walleerrssonn", 100, 22.45, "Brasília", "DF");
        Viagem v3 = new Viagem(3, 2016, 1, p1, "Walleerrssonn", 12, 3.00, "Brasília", "DF");
        Viagem v4 = new Viagem(4, 2016, 4, p4, "Joãozinho", 120.12, 33.50, "São Paulo", "SP");
        Viagem v5 = new Viagem(5, 2016, 2, p1, "Joãozinho", 237, 67.20, "São Paulo", "SP");
        Viagem v6 = new Viagem(6, 2016, 2, p7, "Joãozinho", 121, 24.80, "São Paulo", "SP");
        Viagem v7 = new Viagem(7, 2016, 3, p9, "Mariazinha", 463.89, 129.00, "Rio de Janeiro", "RJ");
        Viagem v8 = new Viagem(8, 2016, 3, p10, "Mariazinha", 5, 1.50, "Rio de Janeiro", "RJ");
        Viagem v9 = new Viagem(9, 2016, 3, p1, "Pedrinho", 35.76, 19.10, "São Paulo", "SP");
        Viagem v10 = new Viagem(10, 2016, 5, p3, "Pedrinho", 14.23, 7.90, "São Paulo", "SP");
         
        //Adicionando viagens
        this.viagem.add(v1);
        this.viagem.add(v2);
        this.viagem.add(v3);
        this.viagem.add(v4);
        this.viagem.add(v5);
        this.viagem.add(v6);
        this.viagem.add(v7);
        this.viagem.add(v8);
        this.viagem.add(v9);
        this.viagem.add(v10);
    }
 
    public ArrayList<Passageiro> getPassageiros() {
        return passageiro;
    }
 
    public ArrayList<Viagem> getViagens() {
        return viagem;
    }

    
    // QUESTÃO 2.a) Metodo que retorne todas as informaçoes de um passageiro fornecido o seu nome.
    
    
   public String getInfoPassageiro (String nome){
	   
	   String resultado = ""; 
			
			for (int i = 0; i < this.passageiro.size(); i++) {
				if(this.passageiro.get(i).getNome().equals(nome)) {
					resultado = "\n Nome: " + this.passageiro.get(i).getNome() + "\n" +
				        "Idade: " + this.passageiro.get(i).getIdade() + "\n" +
			         		"Cidade: " + this.passageiro.get(i).getCidade() + "\n" + 
				        "UF: " + this.passageiro.get(i).getUF() + "\n";
				}
			}
			
	   return resultado;
   }
    
    
    // QUESTÃO 2.b) metodo que retorne a quantidade de viagens de um determinado passageiro 
   
   public int getQtdeViagens(String passageiro){
	   
	   int resultado = 0;
	   
	   for (int i = 0; i <this.viagem.size(); i++) {
		if (this.viagem.get(i).getPassageiro().getNome().equals(passageiro)){
			resultado++;
		}
	}
	   return resultado;
   }
    
    
    // QUESTÃO 2.c) metodo que retorne o codigo da viagem com a maior distancia percorrida
   
   public int getMaiorViagem(){
	   
	   int resultado= 0;
	   double distancia=0;
	   for (int i = 0; i <this.viagem.size(); i++) {
		if (this.viagem.get(i).getDistancia() > distancia){
			distancia = (int) this.viagem.get(i).getDistancia();
			resultado = this.viagem.get(i).getCodigo();
		}
	}
	   
	   return resultado;
   }
    
    // QUESTÃO 2.d ) metodo que retorne a lista de todos UFs onde um determinado passageiro ja realizou viagens
    
    public ArrayList<String> listaUFsViagem(String passageiro){
    	
    	ArrayList<String> resultado =  new ArrayList<String>();
    	
    	for (int i = 0; i < this.viagem.size(); i++) {
			if(this.viagem.get(i).getPassageiro().getNome().equals(passageiro)){
				resultado.add(this.viagem.get(i).getUF());
			}
		}	
    	return resultado;
    }
    
    //QUESTÃO 3.a
    
    public double getCustoKMRodado( String passageiro){
    	
    	double resultado = 0;
    	
    	for (int i = 0; i <this.viagem.size(); i++) {
			if(this.viagem.get(i).getPassageiro().getNome().equals(passageiro)){
				resultado = this.viagem.get(i).getDistancia() * this.viagem.get(i).getValor();
			}
		}	
    	return resultado;
    }
    
    //QUESTÃO 3.b
    
    public ArrayList<Viagem> getMesEAno(int mes , int ano){
    	
    	ArrayList<Viagem> resultado = new ArrayList<Viagem>();
    	
    	
    	for (int i = 0; i <this.viagem.size() ; i++) {
			if( this.viagem.get(i).getAno() == ano && this.viagem.get(i).getMes() == mes){
				resultado.add(this.viagem.get(i));
			}
		}
    	return resultado;
    }
    
      // QUESTÃO 3.c
    
    public String getUfsDefora(String passageiro){
    	
    	String resultado = "";
    	
    	for (int i = 0; i <this.viagem.size(); i++) {
			if(this.viagem.get(i).getPassageiro().getNome().equals(passageiro)){
				resultado = this.viagem.get(i).getUF();
			}
		}
    	return resultado;
    }
    
    
    // QUESTÃO 3.d
    
    public double getKMPorMotEPass(String passageiro, String Motoqueiro){
    	
    	double resultado= 0;
    	
    	for (int i = 0; i < this.viagem.size(); i++) {
			if((this.viagem.get(i).getPassageiro().getNome().equals(passageiro))
                      && (this.viagem.get(i).getMotoqueiro().equals(Motoqueiro))){
				resultado = resultado + this.viagem.get(i).getDistancia();
			}
		}
    	return resultado;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
