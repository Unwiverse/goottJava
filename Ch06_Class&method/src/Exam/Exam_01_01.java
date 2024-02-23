package Exam;

public class Exam_01_01 {
//	public static void axxem(int i, int k, int j) {
//		System.out.println(( i*k)/j);
		public static int axxem1(int i, int k, int j) {
			int md = (i*k)%j;
			return md;
		}
	

	public static void main(String[] args) {
//		axxem(20, 10, 34);
		int result = axxem1(5,5,5);
		System.out.println(result);
	}

}
