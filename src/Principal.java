import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciar o BDSimulado
		BDSimulado bds = new BDSimulado();
		
	//Instanciar a lista de ONG e Posto
		
		ArrayList<Passageiro> passageiro = bds.getPassageiros();
		ArrayList<Viagem> viagem= bds.getViagens();
		
		
		
		//QUEST�O 2.a
				//System.out.println(bds.getInfoPassageiro("Wesley Rodrigues"));
		
		//QUEST�O 2.b
				
				//System.out.println(bds.getQtdeViagens("Jo�o da Silva"));
		
		// QUEST�O 2.c
				
				//System.out.println(bds.getMaiorViagem());
			
		//	QUEST�O 2.d	
				
				//System.out.println(bds.listaUFsViagem("Maria da Silva"));
				
		// QUEST�O 3.a		
				
				//System.out.println(bds.getCustoKMRodado("Maria da Silva"));
				
		// QUEST�O 3.b
				
		ArrayList<Viagem> MesEAno = bds.getMesEAno(5, 2016);
		
		for (int i = 0; i < MesEAno.size(); i++) {
			//System.out.println(MesEAno.get(i).getMotoqueiro());
		}
				
		// QUEST�O 3.c
		
		//System.out.println(bds.getUfsDefora("Jhonson Lever"));
		
		
		
		// QUEST�O 3.d
		
		//System.out.println(bds.getKMPorMotEPass("Maria da Silva", "Walleerrssonn"));
		
		
				
				
				
				
				

	}

}
