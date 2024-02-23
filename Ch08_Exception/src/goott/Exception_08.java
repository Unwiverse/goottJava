package goott;

public class Exception_08 {
	void exception1() {
		String str1 = "java";
		String str2 = null;
		try {
			System.out.println("str1 문자열 길이: "+str1.length());
			System.out.println("str2 문자열 길이: "+str2.length());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 * printStackTrace()
	 * - 에러 메세지의 발생 근원을 찾아서
	 * 	  단계별로 에러를 출력해주는 메서드.
	 */
	void exception2() {
		int num1= 15, num2=0, result =0;
		try {
			result = num1/num2;
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		Exception_08 exception = new Exception_08();
		exception.exception1();
		exception.exception2();
	}

}
