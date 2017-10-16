import java.util.*;

public class LessonOneTaskSeven {

	public static void main(String[] args) {
			
		Scanner in = new Scanner(System.in);
		
		System.out.println("¬ведите полное название мес€ца: ");
		String nameOfMonth = in.next();
		
		if(nameOfMonth.equals("ƒекабрь") || nameOfMonth.equals("январь") || nameOfMonth.equals("‘евраль")) {
			System.out.println("Ёто зимний мес€ц");
		} else if(nameOfMonth.equals("ћарт") || nameOfMonth.equals("јпрель") || nameOfMonth.equals("ћай")) {
			System.out.println("Ёто весенний мес€ц");
		} else if(nameOfMonth.equals("»юнь") || nameOfMonth.equals("»юль") || nameOfMonth.equals("јвгуст")) {
			System.out.println("Ёто летний мес€ц");
		} else if(nameOfMonth.equals("—ент€брь") || nameOfMonth.equals("ќкт€брь") || nameOfMonth.equals("Ќо€брь")) {
			System.out.println("Ёто осенний мес€ц");
		} else {
			System.out.println("“акого мес€ца нет");
		}

	}

}
