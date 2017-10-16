
public class LessonOneTaskOneToFour {

	public static void main(String[] args) {
		
		taskOne();
		taskTwo();
		
		int TaskThree = taskThree();
		System.out.println(TaskThree);
		
		TaskThreeModificate taskmodif = new TaskThreeModificate();
		taskmodif.taskThreeModificate();
		
		
	}
	
	public static void taskOne() {
		System.out.println("Hello World");
	}
	
	public static void taskTwo() {
		System.out.println("Шкрабков");
		System.out.println("Максим");
		System.out.println("Игоревич");
	}
	
	public static int taskThree() {
		int a = 8;
		int b = 9;
		int c = a + b;
		return c;
	}
}
