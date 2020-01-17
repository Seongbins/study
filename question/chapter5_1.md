
## 문제1

#### 다음 Stack 인터페이스를 상속받아 실수를 저장하는 StringStack 클래스를 구현하라.  

```java
interface Stack 
{
   int length(); // 현재 스택에 저장된 개수 리턴  
   int capacity(); // 스택의 전체 저장 가능한 개수 리턴  
   String pop(); // 스택의 톱(top)에 실수 저장  
   boolean push(String val); // 스택의 톱(top)에 저장된 실수 리턴  
}
```
#### 그리고 다음 실행 사례와 같이 작동하도록 StackApp 클래스에 main() 메소드를 작성하라.  
  
### 결과
```java
총 스택 저장 공간의 크기 입력 >> 3
문자열 입력 >> hello
문자열 입력 >> sunny
문자열 입력 >> smile
문자열 입력 >> happy
스택이 꽉 차서 푸시 불가!
문자열 입력 >> 그만
스택에 저장된 모든 문자열 팝 : smile sunny hello 
```
  
***


## 문제 2
  
#### 다음은 키와 값을 하나의 아이템으로 저장하고 검색 수정이 가능한 추상 클래스가 있다.  
  
```java
abstract class PairMap   
{  
   protected String KeyArray[]; // key 들을 저장하는 배열  
   protected String valueArray[]; // value 들을 저장하는 배열   
   abstract String get(String key); // key 값을 가진 value 리턴, 없으면 null 리턴   
   abstract void put(String ket, String value); // key와 value를 쌍으로 저장. 기존에 key가 있으면, 값을 value로 수정  
   abstract String delete(String key); // key 값을 가진 아이템 (value와 함꼐) 삭제, 삭제된 value 값 리턴  
   abstract int length(); // 현재 저장된 아이템의 개수 리턴  
}  
```
#### PairMap을 상속받는 Dictionary 클래스를 구현하고, 이를 다음과 같이 활용하는 main() 메소드를 가진 클래스 DictionaryApp도 작성하라.
  
```java
public static void main(String[] args)  
{  
   Dictionary<K, V> dic = new Dictionary(10);  
   dic.put("황기태", "자바");  
   dic.put("이재문", "파이선");  
   dic.put("이재문", "C++"); // 이재문의 값을 C++로 수정  
   System.out.println("이재문의 값은 "+dic.get("이재문"));  
   System.out.println("황기태의 값은 "+dic.get("황기태"));  
   dic.delete("황기태"); // 황기태 아이템 삭제  
   System.out.println("황기태의 값은 "+dic.get("황기태")); //삭제된 아이템 접근  
}  
```
  
### 결과
```java
이재문의 값은 C++
황기태의 값은 자바
황기태의 값은 null 
```




  
    
