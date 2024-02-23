package abstracts;

public abstract class Person {
		String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		} 
		// 사람의 정보를 출력하는 메서드.
		abstract void getInfo();
		
}
