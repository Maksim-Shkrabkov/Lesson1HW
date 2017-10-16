import java.util.*;

public class LessonOneTaskFour {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите число от 0 до 9: ");
		int number = in.nextInt();
		
		if(number == 0) {
			System.out.println("Ноль");
		} else if(number == 1) {
			System.out.println("Один");
		} else if(number == 2) {
			System.out.println("Два");
		} else if(number == 3) {
			System.out.println("Три");
		} else if(number == 4) {
			System.out.println("Четыре");
		} else if(number == 5) {
			System.out.println("Пять");
		} else if(number == 6) {
			System.out.println("Шесть");
		} else if(number == 7) {
			System.out.println("Семь");
		} else if(number == 8) {
			System.out.println("Восемь");
		} else if(number == 9) {
			System.out.println("Девять");
		} else {
			System.out.println("Вы ввели неправильно число");
		}

	}
	
	
	
}
