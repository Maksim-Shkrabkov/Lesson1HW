import java.util.*;

public class LessonOneTaskSeven {

	public static void main(String[] args) {
			
		Scanner in = new Scanner(System.in);
		
		System.out.println("������� ������ �������� ������: ");
		String nameOfMonth = in.next();
		
		if(nameOfMonth.equals("�������") || nameOfMonth.equals("������") || nameOfMonth.equals("�������")) {
			System.out.println("��� ������ �����");
		} else if(nameOfMonth.equals("����") || nameOfMonth.equals("������") || nameOfMonth.equals("���")) {
			System.out.println("��� �������� �����");
		} else if(nameOfMonth.equals("����") || nameOfMonth.equals("����") || nameOfMonth.equals("������")) {
			System.out.println("��� ������ �����");
		} else if(nameOfMonth.equals("��������") || nameOfMonth.equals("�������") || nameOfMonth.equals("������")) {
			System.out.println("��� ������� �����");
		} else {
			System.out.println("������ ������ ���");
		}

	}

}
