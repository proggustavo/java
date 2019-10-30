package lista_Construtores;

public class OficinaExecutavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Ferramenta el�trica ( modelo - fabricante - peso - desgaste - rpm - potencia - volts)
		
        Furadeira f1 = new Furadeira("Bosch", "Bosch", 1, 2, 3000, 351, 220);
        Lixadeira l1 = new Lixadeira("Treme-treme", "Bosch", 1.5, 3, 0, 200, 110);
        Serra s1 = new Serra("Titan", "Bosch", 1, 1, 12200, 1500, 220);
        
        // manual  (modelo - fabricante - peso -desgaste - tipo -tamanho)
        
        Alicate a1 = new Alicate("Droca SDS", "Vonder", 0.454, 0.5, "Corte", 43);
        Alicate a2 = new Alicate("Droca SDS", "Vonder", 0.454, 0.5, "Bico", 31); // polegadas
        
		Martelo m1 = new Martelo("Madeira", "Tramontina", 0.633, 0.5, "B�sico", 1200);
		Martelo m2 = new Martelo("Fibra", "Vonder", 0.454, 0.5, "B�sico", 1500); // milimetros
		
		Serrote serrote = new Serrote("IW2119", "IRWIN", 0.572, 0.9, "Profissional", 20, 140); // polegadas
		
		
		System.out.println("Fabricante Martelo 2: " + m2.getFabricante());
		
		System.out.println("-----------------------------");
		
		System.out.println("O consumo da oficina  ");
		System.out.println("Furadeira 3 horas por dia: " + f1.CalculaConsumo(3));
		System.out.println("Lixadeira 2 horas por dia: " + l1.CalculaConsumo(2));
		System.out.println("Serra 4 horas por dia: " + s1.CalculaConsumo(4));
		System.out.println("Total semanal: " + (f1.CalculaConsumo(3) + l1.CalculaConsumo(2) + s1.CalculaConsumo(4)) * 7);
		System.out.println("O Total mensal �: " + ((f1.CalculaConsumo(3) + l1.CalculaConsumo(2) + s1.CalculaConsumo(4)) * 7) * 30);
		
		System.out.println("------------------------------");
		
		System.out.println("Ferramenta manual com mais vida �til: Alicate e Martelo");
		
		System.out.println("A vida �til da Alicate �: " + a1.CalculaVida() + " horas ");
		System.out.println("A vida �til do Martelo 1 �: " + m1.CalculaVida() + " horas ");
		System.out.println("A vida �til do Serrote �: " + serrote.CalculaVida() + " horas ");
		
		System.out.println("------------------------------");
		
		System.out.println("A vida �til da Alicate �: " + a1.CalculaVida("dia") + " dias ");
		System.out.println("A vida �til do Martelo �: " + m1.CalculaVida("dia") + " dias ");
		
		System.out.println("-------------------------------");
		
		System.out.println("A vida �til da Alicate �: " + a2.CalculaVida("semana") + " semana ");
		System.out.println("A vida �til do Martelo �: " + m1.CalculaVida("semana") + " semana ");
		
		
		Ferramenta[] ferramentas = {a2, m1, m2, serrote};
		Ferramenta ferramentaMaiorVidaUtil = a1;
		for(int i = 0; i < ferramentas.length; i ++) {
			if(ferramentas[i].CalculaVida() > ferramentaMaiorVidaUtil.CalculaVida()) {
				ferramentaMaiorVidaUtil = ferramentas[i];
			}
		}
		System.out.println(ferramentaMaiorVidaUtil.getModelo());
		
		
		
	}

}
