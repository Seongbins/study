import java.util.Scanner;
import java.util.Random;

public class RSP 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		while(true)
		{
			System.out.print("가위, 바위, 보 중에서 하나를 입력하세요.(그만하고 싶으면 그만을 입력하세요) : ");
			String s1 = scanner.next();
			int i1;
			if(s1.equals("그만"))
				break;
			else if(s1.equals("가위"))
				i1 = 0;
			else if(s1.equals("바위"))
				i1 = 1;
			else
				i1 = 2;
			
			int i2 = random.nextInt(3);
			
			if(i1 == i2)
				System.out.println("비겼습니다.");
			else if(i1 > i2)
			{
				if(i1 - i2 == 2)
					System.out.println("졌습니다.");
				else
					System.out.println("이겼습니다.");
			}
			else
			{
				if(i2 - i1 == 2)
					System.out.println("이겼습니다.");
				else
					System.out.println("졌습니다.");
			}
		}
		scanner.close();
	}
}

/*
가위 0
바위 1
보 2
*/
