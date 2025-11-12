package controller;
import java.util.*;
import model.*;

public class CntrlPortaria implements Iportaria{
	Scanner scan = new Scanner(System.in);
	T tabela t [] = new T [];
	tabela = Lista<Morador>;
	
	  // Construtor que recebe a tabela do main
    public CntrlPortaria() {
        for(int i = 0; i< tabela.length; i++ ) {
        	
        }
    }
	
	@Override
	public void cadastrar() {
		Morador m = new Morador();
		
		System.out.println("Digite o número do apartamento: ");
		m.setApartamento  (scan.nextInt());
		scan.nextLine();
		
		System.out.println("Digite o número do apartamento: ");
		m.setNomeMorador (scan.nextLine());
		
		System.out.println("Digite o número do apartamento: ");
		m.setModeloCarro (scan.nextLine());
		
		System.out.println("Digite a cor do carro: ");
		m.setCorCarro (scan.nextLine());
		
		System.out.println("Digite o número da placa do carro: ");
		m.setPlacaCarro (scan.nextLine());
		
		int hash = m.hash(tabela.lenght);
	}

	@Override
	public void alterar(Morador morador) {
		Morador m = new Morador();
		
		
		
	}

	@Override
	public void excluir() {
		
		
	}
	
	
}
