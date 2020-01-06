import java.util.Scanner;

public class calculate
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("사칙 연산을 입력하세요. ex ) 6 + 8, 7 * 2");
		int a = scanner.nextInt();
		char sign = scanner.next().charAt(0);
		int b = scanner.nextInt();
		int answer;
		
		try 
		{
			if(sign == '+')
				answer = a + b;
			else if(sign == '-')
				answer = a - b;
			else if(sign == '*')
				answer = a * b;
			else
				answer = a / b;
			System.out.print(a + " ");
			System.out.print(sign + " ");
			System.out.print(b + " = ");
			System.out.println(answer);
		}
		catch(ArithmeticException e)
		{
			System.out.println("0으로 나눌 수 없습니다.");
		}
		scanner.close();
	}
}
