package collection;

public class Array_01 {

	public static void main(String[] args) {
		//크기가 7인 문자열 배열을 생성하여 초기값을 할당해보자.
		String[] str = {"가", "나", "다", "라", "마", "바", "사"};
		
		//만약에 배열 생성 후에 "다", "바"의 데이터가 필요가 없어졌다고 가정해보자.
		//배열은 한 번 정해지면 추가나 삭제는 안된다.
		// 그러므로 아래와같이 해당 인덱스에는 null을 입력해서 데이터를 삭제한다.
		// 이런말씀입니다. ==> 글고 이거밖에 안됨.
		str[2] =null; str[5] =null;
		for(String s:str) {
			System.out.println(s);
		}

	}

}
