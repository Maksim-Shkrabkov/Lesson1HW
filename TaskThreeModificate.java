import java.util.Scanner;


public class TaskThreeModificate {
	
	public void taskThreeModificate() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("������� ������ �����: ");
		int firstNumber = in.nextInt();
		
		System.out.println("������� ������ �����: ");
		int secondNumber = in.nextInt();
		
		System.out.println("������� ����: ");
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
			System.out.println("�� ����� �������� ����");
		}		
				
	}
	
}
