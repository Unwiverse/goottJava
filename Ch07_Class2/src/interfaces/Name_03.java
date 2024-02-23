package interfaces;



interface Camera {
	// 사진을 찍는 기능
	void photo();
}
interface Search {
	void search();
	
}

interface MP3 {
	//음악을 들음
	void playMusic();
}

class MyPhone implements Camera, Search, MP3 {

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("음악듣기");
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("검색하기");
	}

	@Override
	public void photo() {
		// TODO Auto-generated method stub
		System.out.println("사진찍기");
	}
	
}
public class Name_03 {
	

	public static void main(String[] args) {
		MyPhone myphone = new MyPhone();
		myphone.photo();
		myphone.search();
		myphone.playMusic();

	}

}
