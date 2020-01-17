
interface IStack<T>
{
	T pop();
	boolean push(T ob);
}

class MyStack<T> implements IStack<T>
{
	int i;
	Object[] stack;
	
	public MyStack() 
	{
		i = 0;
		stack = new Object[10];
	}
	
	public boolean push(T ob)
	{
		if(i == 10)
			return false;
		stack[i++] = ob;
		return true;
	}
	
	
	public T pop()
	{
		if(i == 0)
			return null;
		i--;
		return (T)(stack[i]);
	}
}

public class StackManager 
{
	public static void main(String[] args)
	{
		IStack<Integer> stack = new MyStack<Integer>();
		
		for(int i = 0; i < 10; i++)
		{
			stack.push(i);
		}
		
		while(true)
		{
			Integer n = stack.pop();
			if(n == null)
				break;
			System.out.print(n + " ");
		}
	}
}
