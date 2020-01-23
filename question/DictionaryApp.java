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
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̼�");
		dic.put("���繮", "C++");
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
	}
}
