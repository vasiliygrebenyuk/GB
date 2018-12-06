import java.util.Scanner;
public class GuessNum{
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Игра угадайте число");
		for (int i = 10; i <= 30; i += 10 ) playLavel(i);
			System.out.println("Вы выиграли!");
		scanner.close();
	}
	private static void playLavel(int range) {
		int number = (int)(Math.random() * range);
		while (true){
			System.out.println("Угадайте число в диапазоне от 0 - " + range);
			int inpNum = scanner.nextInt();
			if (inpNum == number){
				System.out.println("Угадали!");
				break;
			} else if (inpNum < number) {
				System.out.println("Загаданное число  больше!");
			} else {
				System.out.println("Загаданное число  меньше!");
			}
		}
	}
}