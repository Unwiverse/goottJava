package goott;

public class Exception_05 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		String str1 = "korea";
		String str2 = null;
		try {
		str2.length();
		} catch(Exception e) {
			System.out.println("예외 정보 발생: "+e);
		}
		System.out.println("문자열 길이: "+str1.length()); //length() ==> 문자열 길이를 정수값으로 반환
		
		
		System.out.println("프로그램 종료");

		}

}

