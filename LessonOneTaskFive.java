import java.util.*;


public class LessonOneTaskFive {

	public static void main(String[] args) {
			
		Scanner in = new Scanner(System.in);
		
		System.out.println("������� ����� �� 0 �� 9: ");
		int number = in.nextInt();
		
		if(number == 2 || number == 4 || number == 6 || number == 8) {
			System.out.println("��� ������ �����");
		} else {
			System.out.println("��� �������� �����");
		}
			
	}

}
