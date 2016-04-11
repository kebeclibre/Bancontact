
public class Billet {
	private int valeur;
	private int nombre;
	
	public Billet(int valeur, int nombre) {
		this.setValeur(valeur);
		this.setNombre(nombre);
	}
	
	public int getValeur() {
		return valeur;
	}
	public int getNombre() {
		return nombre;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	
	public void decrement() {
		nombre -= 1 ;
	}
	
	public String toString() {
		return "Coupure: "+valeur+"; Nombre: "+nombre+"\n"; 
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nombre;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Billet other = (Billet) obj;
		if (nombre != other.nombre)
			return false;
		return true;
	}
	
	
	
}
