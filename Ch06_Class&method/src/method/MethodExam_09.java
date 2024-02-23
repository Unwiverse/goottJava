package method;

/*
 * ★★★★★★★★★★★★★★★★★★★★★★★★★
 * ★★★★★★★★★★★★★★★★★★★★★★★★★
 * ★★★★★★★★★★★★★★★★★★★★★★★★★
 * ★★★★★★★★★★★★★★★★★★★★★★★★★
 * ★★★★★★★★★★★★★★★★★★★★★★★★★
 * ★★★★★★★★★★★★★★★★★★★★★★★★★
 * ★★★★★★★★★★★★★★★★★★★★★★★★★
 * 메서드를 호출 시 반환형에 대한 내용
 * 
 */
public class MethodExam_09 {
			//값이 반환이 되는 경우
			public static int method1() {
				return 178;
			}
			
			//변수명이 반환이 될 때
			public static int method2(int su1, int su2) {
				int sum = (su1*su2) + (su2*2);
				return sum;
				
			}
			
			//수식이 반환될 때
			public static int method3(int su1, int su2) {

				return su1*su2;
				
			}
			//단순 문자열 반환
			public static String method4() {
				return "덤벨컬플라이";
				
			}
			// 문자열 변수 반환
			public static String method5(String str1, String str2) {
				String result = str1 +str2+"만세";
				return result;
				
			}
			// 문자열 수식을 반환하는 경우
			public static String method6(String str1, String str2) {
				return str1+str2;
				
			}
	public static void main(String[] args) {
		int num = method1();
//		System.out.println("num: "+num);
		System.out.println("메소드 호출 후 반환된 값: "+method1());
		
		System.out.println("메소드 호출 후 반환된 값: "+method2(200, 142));
		
		System.out.println("메소드 호출 후 반환된 값: "+method3(200, 142));
		
		System.out.println("메소드 호출 후 반환된 값: "+method4());
		
		System.out.println("메소드 호출 후 반환된 값: "+method5("대한", "민국"));
		
		System.out.println("메소드 호출 후 반환된 값: "+method6("홍", "길동"));
	}

}
