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
			System.out.print("����, ����, �� �߿��� �ϳ��� �Է��ϼ���.(�׸��ϰ� ������ �׸��� �Է��ϼ���) : ");
			String s1 = scanner.next();
			int i1;
			if(s1.equals("�׸�"))
				break;
			else if(s1.equals("����"))
				i1 = 0;
			else if(s1.equals("����"))
				i1 = 1;
			else
				i1 = 2;
			
			int i2 = random.nextInt(3);
			
			if(i1 == i2)
				System.out.println("�����ϴ�.");
			else if(i1 > i2)
			{
				if(i1 - i2 == 2)
					System.out.println("�����ϴ�.");
				else
					System.out.println("�̰���ϴ�.");
			}
			else
			{
				if(i2 - i1 == 2)
					System.out.println("�̰���ϴ�.");
				else
					System.out.println("�����ϴ�.");
			}
		}
		scanner.close();
	}
}

/*
���� 0
���� 1
�� 2
*/