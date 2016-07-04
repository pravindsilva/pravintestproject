

public class HelloWorld {

	/**
	 * @param args
	 */
	public void performCalculation(int firstNumber, int Secondnumber){
		RunCalculator r= new RunCalculator();
		r.runCalculator(5, 6);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("This is a calculator");
HelloWorld hello=new HelloWorld();
hello.performCalculation(5,6);
	}

}
