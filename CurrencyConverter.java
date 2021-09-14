/*class CurrencyConverter{
int rupee = 63;
int dirham = 3;
int real = 3;
int chilean_peso = 595;
int mexican_peso = 18;
int _yen = 107;
int $australian = 2;
int dollar;
int Rupee = 63;

void printCurrencies(){
	System.out.println("rupee: " + rupee);
	System.out.println("$australian: "+ $australian);
}
public static void main(String[] args){
CurrencyConverter cc = new CurrencyConverter();
cc.printCurrencies();
}
}*/


public class CurrencyConverter {

    double[] exchangeRates = new double[]{63.0, 3.0, 3.0, 595.5, 18.0, 107.0, 2.0};
    
	// set method
	void setExchangeRates(double[] rates){
		exchangeRates = rates;
	}
	
	// update method
	void updateExchangeRate(int countryIndex, double newVal){
		exchangeRates[countryIndex] = newVal;
	}
	
	// fetch method
	double getExchangeRate(int countryIndex){
		return exchangeRates[countryIndex];
	}
	
	// transfer amount
	
	double computeTransferAmount(int countryIndex, double amount){
		return amount * getExchangeRate(countryIndex);
	}
	
	
    void printCurrencies() {
	     System.out.println("\nrupee: " + exchangeRates[0]);
	     System.out.println("dirham: " + exchangeRates[1]);
	     System.out.println("real: " + exchangeRates[2]);
	     System.out.println("chilean_peso: " + exchangeRates[3]);
	     System.out.println("mexican_peso: " + exchangeRates[4]);
	     System.out.println("_yen: " + exchangeRates[5]);
	     System.out.println("$australian: " + exchangeRates[exchangeRates.length-1]);
    }
	   
    public static void main(String[] args) {
	     CurrencyConverter cc = new CurrencyConverter();

		// cc.setExchangeRates(rates);
	     cc.printCurrencies();
		 
	
		 
		 //update
		 
		 cc.updateExchangeRate(3,45.99);
	     cc.printCurrencies();
		 
		 //transfer
		 
		 double amount = cc.computeTransferAmount(0, 1000 );
		 System.out.println("\nTransferred amount: " + amount);
		 
		 
    }
}