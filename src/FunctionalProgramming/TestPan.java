package FunctionalProgramming;

public class TestPan {

	public static void main(String[] args) {
		
		
		
		
		//ABCDE1234T
	PanValidator val=(p)->{
			String panCardPattern="[A-Z]{5}[0-9]{4}[A-Z]{1}";
		if(p.matches(panCardPattern))
		{
			return "Valid PAN card";
		}
		else
		{
			return "Invalid";
		}
				
		};
	System.out.print(val.validatePAN("ADE4567T"));

	}

}
