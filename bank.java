import java.util.*;
public class bank {
	static double amount = 0.0;
public static void main (String[] args) {
	Scanner input = new Scanner (System.in);
	int option = 0;
	while (option !=4) {
	System.out.println("Welcome to the bank of Aleece");
	System.out.println("1, Check Balance");
	System.out.println("2. Deposit");
	System.out.println("3. Withdraw");
	System.out.println("4. Exit");
	System.out.println("Enter an option: ");
	option = input.nextInt();
	
	switch (option) {
	case 1: 
		checkBalance();
		break;
	
	case 2: 
		deposit();
		break;
	
	case 3: 
		withdraw();
		break;
	
	case 4: 
		exit();
		break;

	default: 
		System.out.println("Invalid option");
	break;
	
	}
}
}
public static void checkBalance() {
	System.out.println("Your current balance is " + amount);
}
public static void deposit() {
	Scanner input = new Scanner (System.in);
	System.out.println("How much do you want to deposit?");
	double deposit = input.nextDouble();
	amount+=deposit;
	System.out.println("You deposited " + deposit + " into your account");
	checkBalance();
}
public static void withdraw() {
	Scanner input = new Scanner (System.in);
	System.out.println("How much do you want to withdraw?");
	double withdraw = input.nextDouble();
	if(withdraw > amount) {
		System.out.println("Insuffient funds.");
	}else {
	amount-=withdraw;
	System.out.println("You withdrew" + withdraw + " from your account");
	}
	checkBalance();
}
public static void exit() {
	System.out.println("Thank you for using the Bank Of Aleece! Have a great day!");
}
}
