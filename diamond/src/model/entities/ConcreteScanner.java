package model.entities;

public class ConcreteScanner extends Device{
	
	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("Scan Processing: " + doc);
	}
	public String scan() {
		return "Scanned content";
	}
}
