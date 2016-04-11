
public class Banque {
	
	private Billet[] stock = {new Billet(5,200), new Billet(10,1) , new Billet(20,1), new Billet(50,200), new Billet(100,200), new Billet(200,200)};
	private Card card;
	private Billet[] toDistribute = new Billet[6]; 
	private int montant;
	
	public void insertCard(Card card) {
		this.card = card;
	}
	
	public boolean insertPin(int pin) {
		return card.checkPinCode(pin);
	}
	
	public String distribute() { // faire un toString pour l'array de billets)
		String result="";
		int j=0;
		for (int i = stock.length-1; i>=0; i--) {
			int rest=montant%stock[i].getValeur();
			int nombre=montant/stock[i].getValeur();				
			
			toDistribute[j] = new Billet(stock[i].getValeur(),nombre);
			
			if (nombre > 0) {result += toDistribute[j].toString(); }
			
			montant=rest;
			
			j++;
		}
		return result;
	}
	
	public void rondMontant() {
		this.montant += 5-(this.montant%5);
	}
	
	public void setMontant(int montant) {
		this.montant=montant;
		rondMontant();
	}

	public String Hello(Card card, int pin, int montant) {
		insertCard(card);
		if (insertPin(pin)) { 
			setMontant(montant);
			return distribute();
		}else{ return "Buy yourself a memory; or stop Hacking"; }
		
		
	}

	public boolean checkStock(Billet billet, int amount) {
		for (int i = 0; i < stock.length ; i++) {
			if (stock[i].equals(billet)) {
				if (amount <= stock[i].getNombre()) {
					return true; }
			}
		}
		return false;
	}
}
