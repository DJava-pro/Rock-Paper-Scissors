
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Камень ножницы бумага.");
		System.out.println("Выбери из этого списка 1: камень 2: ножницы 3: бумага");
		System.out.print("Введите: ");
		int user = scan.nextByte(); // 1: камень 2: ножнецы 3: бумага
		int bot = rand.nextInt(3) + 1;

		if ((user == 1 && bot == 2) || (user == 2 && bot == 3) || (user == 3 && bot == 1)) {
			System.out.println("Ты выйграл");
		} else {
			if (user >= 3) {
				System.out.println("Выбери из этого списка 1: камень 2: ножницы 3: бумага");
			} else {
				if (user == bot) {
					System.out.println("Ничья");
				} else {
					System.out.println("Бот выйграл");
				}
			}
		}

		scan.close();
	}
}
