
## 문제1

#### 다음 Istack 인터페이스가 있다.

```java
interface IStack<T> 
{
	T pop();  
	boolean push(T ob);  
}  
```
#### IStack<T> 인터페이스를 구현(implements)하는 MyStack<T> 클래스를 작성하라. 
##### 스택의 원소는 Vector<E>를 이용하여 저장하라.
##### 다음은 MyStack<Integer>로 구체화한 정수 스택을 생성하고 활용하는 코드와 실행 결과이다.

```java
public class StackManager 
{
  	public static void main(String[] args) 
  	{  
  		IStack<Integer> stack = new MyStack<Integer>();    
      
    		for (int i=0; i<10; i++)  
		{  
			stack.push(i);
		}  
      
    		while(true)   
    		{  
			Integer  n = stack.pop();  
			if(n == null) break;  
			System.out.print(n+" ");  
		}    
	}  
} 
```
  
### 결과
```java
9 8 7 6 5 4 3 2 1 0
```
  
  
***


## 문제 2
  
#### 도시 이름, 위도, 경도 정보를 가진 Location 클래스를 작성하고,  
#### 도시 이름을 '키'로 하는 HashMap<String, Location> 컬렉션을 만들고,  
#### 사용자로부터 입력 받아 4개의 도시를 저장하라. 그리고 도시 이름으로 검색하는 프로그램을 작성하라.  
  
### 결과
```java
도시, 경도, 위도를 입력하세요.  
>> 서울, 37, 126  
>> LA, 34, -118  
>> 파리, 2, 48  
>> 시드니, 151, -33  
----------------------------------  
서울 37 126  
LA 34 -118  
파리 2 48  
시드니 151 -33  
----------------------------------  
도시 이름 >> 피리  
피리는 없습니다.  
도시 이름 >> 파리    
파리 2 48  
도시 이름 >> 그만  
```
  
    
