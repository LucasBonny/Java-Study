package model.entities;

public class ComboDevice extends Device implements Printer, Scanner {

	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public String scan() {
		// TODO Auto-generated method stub
		return "Combo result";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Process Combo: " + doc);
	}

	@Override
	public void print(String doc) {
		System.out.println("Print Combo: " + doc);
		
	}

}
