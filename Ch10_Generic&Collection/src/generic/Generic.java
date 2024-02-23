package generic;

public class Generic <T>{
	T[] arr;
	T var;
	
	void setArr(T[] arr) {
		this.arr = arr;
	}
		void setVar(T var) {
			this.var =var;
		}
		void output() {
			for(T t: arr) {
				System.out.println("arr 배열 요소: "+t);
			}
			System.out.println("var: "+var);
		}
	}

