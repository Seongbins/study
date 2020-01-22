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
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		cap = scanner.nextInt();
		Stack stack = new StringStack(cap);
		
		while(true)
		{
			System.out.print("문자열 입력 >> ");
			s = scanner.next();
			if(s.equals("그만"))
			{
				int l = stack.length();
				System.out.print("스택에 저장된 모든 문자열 팝 : ");
				for(int i = 0; i < l; i++)
					System.out.print(stack.pop() + " ");
				break;
			}
			if(stack.push(s) == false)
			{
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
		}
		scanner.close();
	}
}
