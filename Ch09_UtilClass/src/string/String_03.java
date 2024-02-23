package string;


// String 클래스 주요 메서드

public class String_03 {

	public static void main(String[] args) {
		//1. toUpperCase(): 모든 문자열을 대문자로 바꿔주는 메서드
		String str1 = "java progress";
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toUpperCase().toLowerCase());
		//2, toLowerCase(): 모든 문자열으 소문자로 바꿔주는 메서드
		String str2 = "MORE OF HOSTILE IN BOUND";
		System.out.println(str2.toLowerCase());
		
		//2. length(): 문자열의 길이를 정수값으로 반환하는 메서드
		System.out.println(str2.length());
		System.out.println();
		//3. concat(): 문자열을 결합하는 메서드.
		String str3 = "JAVA";
		String str4 = str3.concat("AGENT");
		System.out.println("str3 문자열 결합 결과: "+str4);
		
		//4. equalsIgnoreCase(): 대소문자를 구분하지 않는 메소드.
		if(str2.equalsIgnoreCase(str2)) {
			System.out.println("두 문자열은 같다.");
		} else {
			System.out.println("두 문자열은 다르다.");
		}
		//5. charAt(index): 문자열에서 특정 단일 문자를 추출하는 메소드.
		String juminNo = "123451-5050502";
		char Noi2 = juminNo.charAt(6);
		if(Noi2 == '1') {
			System.out.println("님은 남자임");
		} else if(Noi2 == '2'){
				System.out.println("님은 여자임");
		} else {
			System.out.println("외국인임");
		}
	}
	

}
