
public class Card {
	private int pinCode = 1234; 
	
	public boolean checkPinCode(int pin) {
		return (this.pinCode==pin)?true:false;
	}
}
