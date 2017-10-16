import java.util.*;

public class LessonOneTaskTen {

	public static void main(String[] args) {
		
		char ch;
		
		do {
			Scanner in = new Scanner(System.in);
			
			System.out.println("Введите символ: ");
			ch = in.next().charAt(0);
			
		} while(ch != 'q');

	}

}
