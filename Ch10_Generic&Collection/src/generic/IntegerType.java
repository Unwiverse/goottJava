package generic;

public class IntegerType {
		Integer[] iarr; 
		Integer ivar;
		
		void setArr(Integer[] iarr) {
			this.iarr = iarr;
			
		}
		void setVar(Integer ivar) {
			this.ivar = ivar;
		}
		void output() {
			for(Integer s: iarr) {
				System.out.println("str 배열 요소: "+s);
				
			}
			System.out.println("var: "+ivar);
		

	}
}


