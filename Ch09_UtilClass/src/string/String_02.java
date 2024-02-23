package string;

public class String_02 {

	public static void main(String[] args) {
		String str1 = "Hello ";
		String str2 = "Java";
		System.out.println("str1 주소: "+System.identityHashCode(str1));
		System.out.println("str1 주소: "+System.identityHashCode(str2));
		System.out.println();
		
		//문자열 결합(+)
		String SP = str1 += str2; //==> str1 = str1+str2
		System.out.println(SP);
		System.out.println("SP 주소:  "+System.identityHashCode(SP)); 
		//heap 메모리 영역에 글자를 합친 새로운 클래스 데이터가 생성됨
		//String 자료형 변수와 클래스는 데이터가 final 형태이기 때문에 값을 바꿀 수 없음
		
	}

}
