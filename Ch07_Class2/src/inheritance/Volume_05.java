package inheritance;

import java.util.Scanner;

public class Volume_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TV tv = new TV();
		Audio audio = new Audio();
		Computer computer = new Computer();
		
		
		while(true) {
			System.out.println("1. TV/ 2. Audio/ 3. Computer/ 4. 종료");
			System.out.print("위 메뉴 중 하나를 고르세요: ");
			int menu = sc.nextInt();
			if(menu ==4) {
				break;
			}
			System.out.println("1. 볼륨 Up/ 2. 볼륨 Down");
			int volume = sc.nextInt();
			switch(menu) {
			case 1: // TV 메뉴 선택한 경우
					if(volume ==1) {
						tv.volumeUp();
					
					} else {
						tv.volumeDown();
					}
					break;
			case 2: //Audio 메뉴 선택한 경우
				if(volume ==1) {
					audio.volumeUp();
				
				} else {
					audio.volumeDown();
				}
				break;
			case 3: //Computer 메뉴 선택한 경우
				if(volume ==1) {
					computer.volumeUp();
				
				} else {
					computer.volumeDown();
				}
				break;
			
			} //switch~case 조건문 end
			
			System.out.println();
			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("TV volume: "+tv.getVolume()+"/"+"Audio volume: "+audio.getVolume()+"/"+"Computer volume: "+computer.getVolume());
		} // while문 end
		System.out.println();
		System.out.println("ㅅㄱㅇ");
		sc.close();
	}

}
