import java.util.*;


public class LessonOneTaskFive {

	public static void main(String[] args) {
			
		Scanner in = new Scanner(System.in);
		
		System.out.println("¬ведите число от 0 до 9: ");
		int number = in.nextInt();
		
		if(number == 2 || number == 4 || number == 6 || number == 8) {
			System.out.println("Ёто чЄтное число");
		} else {
			System.out.println("Ёто нечетное число");
		}
			
	}

}
