import java.util.*;

class locate
{
	Integer latitude;
	Integer longitude;
	public locate(Integer a, Integer b)
	{
		this.latitude = a;
		this.longitude = b;
	}
}

public class location 
{
	public static void main(String[] args)
	{
		HashMap<String, locate> Loc = new HashMap<String, locate>();
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 4; i ++)
		{
			System.out.println("도시, 경도, 위도를 입력하세요.");
			String s = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(s, " ,");
			String city = st.nextToken();
			Integer a = Integer.parseInt(st.nextToken());
			Integer b = Integer.parseInt(st.nextToken());
			
			Loc.put(city, new locate(a, b));
		}
		System.out.println("----------------------------------");
		Set<String> keys = Loc.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext())
		{
			String city = it.next();
			int a = Loc.get(city).latitude;
			int b = Loc.get(city).longitude;
			System.out.println(city + " " + a + " " + b);
		}
		
		System.out.println("----------------------------------");
		while(true)
		{
			System.out.print("도시 이름 ");
			String str = scanner.next();
			if(str.equals("그만"))
				break;
			
			locate c = Loc.get(str);
			if(c == null)
				System.out.println(str + "는 없습니다.");
			else
				System.out.println(str + " " + c.latitude + " " + c.longitude);
		}
		scanner.close();
	}
	
}
