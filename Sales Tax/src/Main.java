//Main Class is the parent class of all the subclasses Receipt class and Product Class. 

public class Main {

	public static void main(String[] args) {

		Receipt receipt1 = new Receipt("input1.txt");

		receipt1.calculateTotals();

		System.out.println("Output 1:");
		receipt1.printReceipt();
		System.out.println();

		Receipt receipt2 = new Receipt("input2.txt");

		receipt2.calculateTotals();

		System.out.println("Output 2:");
		receipt2.printReceipt();
		System.out.println();

		Receipt receipt3 = new Receipt("input3.txt");

		receipt3.calculateTotals();

		System.out.println("Output 3:");
		receipt3.printReceipt();

	}

}


//This code is developed by Naren Bagavathy