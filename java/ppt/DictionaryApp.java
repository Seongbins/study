abstract class PairMap
{
	protected String KeyArray[];
	protected String ValueArray[];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}

class Dictionary extends PairMap
{
	int l;
	int c;
	String KeyArray[];
	String ValueArray[];
	
	
	public Dictionary(int c)
	{
		l = 0;
		this.c = c;
		KeyArray = new String[this.c];
		ValueArray = new String[this.c];
		
	}
	
	@Override
	public String get(String key)
	{
		for(int i = 0; i < l ; i++)
		{
			if(KeyArray[i].equals(key))
				return ValueArray[i];
		}
		return null;
	}
	
	@Override
	public void put(String key, String value)
	{
		if(l == c)
			;
		else
		{
			int i;
			for(i = 0 ; i < c ; i++)
			{
				if(i == l)
				{
					KeyArray[l] = key;
					ValueArray[l++] = value;
					break;
				}
				else
				{
					if(KeyArray[i].equals(key))
					{
						ValueArray[i] = value;
						break;
					}
				}
			}
		}
	}
	
	@Override
	public String delete(String key)
	{
		for(int i = 0 ; i < l ; i++)
		{
			if(KeyArray[i].equals(key))
			{
				String s = ValueArray[i];
				ValueArray[i] = null;
				return s;
			}
		}
		return null;
	}
	
	@Override
	public int length()
	{
		return l;
	}
}

public class DictionaryApp 
{
	public static void main(String args[])
	{
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));
	}
}
