import java.util.*;

public class LessonOneTaskNine {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("������� ������ �����: ");
		int firstNumber = in.nextInt();
		
		System.out.println("������� ������ �����: ");
		int secondNumber = in.nextInt();
		
		System.out.println("������� ������ �����: ");
		int thirdNumber = in.nextInt();
		
		int min = 0;
		int max = 0;
		
		if(firstNumber <= secondNumber && firstNumber <= thirdNumber) {
			min = firstNumber;
		} 
		
		if(secondNumber <= firstNumber && secondNumber <= thirdNumber) {
			min = secondNumber;
		}  
		
		if(thirdNumber <= secondNumber && thirdNumber <= firstNumber) {
			min = thirdNumber;
		}
		
		if(firstNumber >= secondNumber && firstNumber >= thirdNumber) {
			max = firstNumber;
		} 
		
		if(secondNumber >= firstNumber && secondNumber >= thirdNumber) {
			max = secondNumber;
		}  
		
		if(thirdNumber >= secondNumber && thirdNumber >= firstNumber) {
			max = thirdNumber;
		}
		
		int sum = min + max;
		
	    System.out.println(sum);
			

	}

}
