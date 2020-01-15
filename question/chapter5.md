
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
#### 스택의 원소는 Vector<E>를 이용하여 저장하라.
#### 다음은 MyStack<Integer>로 구체화한 정수 스택을 생성하고 활용하는 코드와 실행 결과이다.

```java
public class StackManager 
{
  public static void main(String[] args) 
  {  
    IStack<Integer> stack = new MyStack<Integer>();    
      
    for (int i=0; i<10; i++)   
      stack.push(i);  
      
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
9 8 7 6 5 4 3 2 1 0

***


