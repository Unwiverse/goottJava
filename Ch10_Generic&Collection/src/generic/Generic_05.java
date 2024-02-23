package generic;

public class Generic_05 {

	public static void main(String[] args) {
		//String 타입의 클래스 객체 생성
		Generic<String> st = new Generic<>();
		String[] str = {"홍길동", "세종대왕", "유관순"};
		
		String var = "김유신"; 
		
		st.setArr(str);
		st.setVar(var);
		st.output();
		System.out.println();
		
		//Integer type 클래스 객체 생성
		Generic<Integer> it = new Generic<>();
		Integer[] iarr = {10, 20, 30, 40, 50};
		Integer ivar = 157;
		
		it.setArr(iarr);
		it.setVar(ivar);
		it.output();

	}

}
