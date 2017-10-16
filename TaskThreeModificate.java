import java.util.Scanner;


public class TaskThreeModificate {
	
	public void taskThreeModificate() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите первое число: ");
		int firstNumber = in.nextInt();
		
		System.out.println("Введите второе число: ");
		int secondNumber = in.nextInt();
		
		System.out.println("Введите знак: ");
		String sign = in.next();
		
		int result;
		
		if (sign.equals("+")) {
			 result = firstNumber + secondNumber;
			 System.out.println(result);
		} else if(sign.equals("-")) {
			result = firstNumber - secondNumber;
			System.out.println(result);
		} else if(sign.equals("/")) {
			result = firstNumber / secondNumber;
			System.out.println(result);
		} else if(sign.equals("*")) {
			result = firstNumber * secondNumber;
			System.out.println(result);
		} else {
			System.out.println("Вы ввели неверный знак");
		}		
				
	}
	
}
