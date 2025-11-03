package controller;
import java.util.*;
import model.*;
import ListaGenerica.model;

public class CntrlPortaria implements Iportaria{
	Scanner scan = new Scanner(System.in);
	private Lista<Morador>[] tabela;
	
	  // Construtor que recebe a tabela do main
    public CntrlPortaria(Lista<Morador>[] tabela) {
        this.tabela = tabela;
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
