import java.util.Scanner;

interface Stack
{
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}

class StringStack implements Stack
{
	int l;
	int c;
	Object[] stack;
	public StringStack(int c)
	{
		l = 0;
		this.c = c;
		stack = new Object[c];
	}
	
	public int length()
	{
		return l;
	}
	
	public int capacity()
	{
		return c;
	}
	
	public String pop()
	{
		if(l == 0)
			return null;
		l--;
		return (String)stack[l];
	}
	
	public boolean push(String Val)
	{
		if(l == c)
			return false;
		stack[l++] = Val;
		return true;
	}
}

public class StackApp 
{
	public static void main(String[] args)
	{
		int cap;
		String s;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		cap = scanner.nextInt();
		Stack stack = new StringStack(cap);
		
		while(true)
		{
			System.out.print("���ڿ� �Է� >> ");
			s = scanner.next();
			if(s.equals("�׸�"))
			{
				int l = stack.length();
				System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
				for(int i = 0; i < l; i++)
					System.out.print(stack.pop() + " ");
				break;
			}
			if(stack.push(s) == false)
			{
				System.out.println("������ �� ���� Ǫ�� �Ұ�!");
			}
		}
		scanner.close();
	}
}
