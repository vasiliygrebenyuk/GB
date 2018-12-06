import java.util.Scanner;
public class Calculator{
	public static void main(String[] args) {
		System.out.println("1. для сложения");
		System.out.println("2. для вычитания");
		System.out.println("3. для умножения");
		System.out.println("4. для деления");
		Scanner scanner = new Scanner(System.in);
		int operation = scanner.nextInt();

		System.out.println("Введите 1ое  число");
		int a = scanner.nextInt();

		System.out.println("Введите 2ое  число");
		int b = scanner.nextInt();

		int result ;
		if (operation == 1) {
			result = a + b;
		} else if (operation == 2) {
			result = a - b;
		} else if (operation == 3) {
			result = a * b;
		} else if (operation == 4) {
			result = a / b;
		}
			//System.out.println("Не верный номер операции");
			
		
		System.out.println("Результат = " + result);
	}
}