import java.util.Scanner;

public class LessonOneTaskEleven {

	public static void main(String[] args) {
		
		String stroke;
		
		do {
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("������� ������ ������: ");
			stroke = in.nextLine();
			
		} while(!stroke.equals("Stop"));
		
		

	}

}
