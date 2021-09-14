public class MoneyTransferService{
CurrencyConverter cc = new CurrencyConverter();

// Transfer amount
double computeTransferAmount(int countryIndex, double amount){
		return cc.computeTransferAmount(countryIndex, amount);
	}

// Transfer Fee

double computeTransferFee(int countryIndex, double amount){
		double transferAmount = computeTransferAmount(countryIndex, amount);
		double transferFee = transferAmount * 0.02;
		return transferFee;
	}
	
	
// main function

public static void main(String[] args) {

MoneyTransferService mts = new MoneyTransferService();

double transferAmount = mts.computeTransferAmount(0, 1000);
double transferFee = mts.computeTransferFee(0, 1000);

System.out.println("Transfer Amount: " + transferAmount);
System.out.println("Transfer Fee: " + transferFee);

}
}

