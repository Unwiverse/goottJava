package method;

public class MethodExam_08 {
	public static void change(int[] array) { //array는 arr의 배열 주소값을 넘겨받음
		System.out.println("array: "+array);
		for(int i=0; i<array.length; i++) {
			array[i] = array[i] *10;
		}
	}
	public static void main(String[] args) {
		//2. call by reference 방식
		int[] arr = new int[3];
		arr[0] = 10; arr[1] = 20; arr[2] =30;
		System.out.println("arr: "+arr);
		System.out.println("change() 메소드 호출 전: ");
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]: "+arr[i]);
		}	System.out.println();
		
		change(arr);
		
		System.out.println("change() 메소드 호출 후: ");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]: "+arr[i]);
		}
	}

}
