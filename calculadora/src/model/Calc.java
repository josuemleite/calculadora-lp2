package model;

import java.util.ArrayList;
import java.util.List;

public class Calc {
	
	private List<String> lastOperations = new ArrayList<String>();   
	
	public Number sum(Number valueOne, Number valueTwo) {
		Number result = valueOne.doubleValue() + valueTwo.doubleValue();
		
		saveOperation('+', valueOne, valueTwo, result);
		
		return result;
	}

	public Number sub(Number valueOne, Number valueTwo) {
		Number result = valueOne.doubleValue() - valueTwo.doubleValue();
		
		saveOperation('-', valueOne, valueTwo, result);
		
		return result;
	}
	
	public Number div(Number valueOne, Number valueTwo) {
		Number result = valueOne.doubleValue() / valueTwo.doubleValue();
		
		saveOperation('/', valueOne, valueTwo, result);

		return result;
	}
	
	public Number mult(Number valueOne, Number valueTwo) {
		Number result = valueOne.doubleValue() * valueTwo.doubleValue();
		
		saveOperation('*', valueOne, valueTwo, result);
		
		return result;
	}
	
	public List<String> getLastOperations(){
		List<String> copyLastOperations = new ArrayList<String>();
		
		for(String operation : lastOperations) {
			copyLastOperations.add(operation);
		}
		
		return copyLastOperations;
	}
	
	private void saveOperation(char operation, Number valueOne, Number valueTwo, Number result) {
		String formattedResult = String.format("%.2f %s %.2f = %.2f", 
				valueOne.doubleValue(), operation, valueTwo.doubleValue(), result);

		lastOperations.add(formattedResult);
	}
}