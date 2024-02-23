package generic;

public class Type_04 {

	public static void main(String[] args) {
		//StringType 클래스 객체 생성
		StringType st = new StringType();
		String[] str = {"홍길동", "세종대왕", "유관순"};
		
		String var = "김유신"; 
		
		st.setStr(str);
		st.setVar(var);
		st.output();
		System.out.println();
		
		//Integer type 클래스 객체 생성
		IntegerType it = new IntegerType();
		Integer[] iarr = {10, 20, 30, 40, 50};
		Integer ivar = 157;
		
		it.setArr(iarr);
		it.setVar(ivar);
		it.output();

	}

}
