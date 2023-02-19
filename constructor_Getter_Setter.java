import java.util.*;


enum constructor_getter_setter{
	

	number1(101),number2(102),number3(103),number4();
	
	private int number;

	//defalut constructor:
	private constructor_getter_setter() {
		number=1000;
	}

	//parameterised constructor:
	private constructor_getter_setter(int number) {
		this.number = number;
	}

	//getter for number:
	public int getNumber() {
		return number;
	}

	//setter for number:
	public void setNumber(int number) {
		this.number = number;
	}

}



public class constructor_Getter_Setter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program for the learning of 'ENUM CLASS' using the constructor and getter and the setter");
		System.out.println("-----------------------------------------------------------------------------------------------\n");
		

		constructor_getter_setter arr[]=constructor_getter_setter.values();


		System.out.println("Result will be:");
		for(constructor_getter_setter op:constructor_getter_setter.values()) {
			System.out.println("Number = "+op.ordinal()+" : "+"Value = "+op+"GivenNumber = "+op.getNumber());
		}
		
	}

}