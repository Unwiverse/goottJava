package util;

import java.util.Calendar;

/*
 * 3. Calendar 클래스
 * 		- 날짜/시간 관련된 정보를 제공해주는 클래스.
 * 		- Calendar 클래스는 추상클래스임.<=====????????
 * 		- 추상클래스로 작성한 이유: 날짜 및 시간 계산하는 방법이
 * 													나라마다 지역마다 달라서
 * 		- Calendar 클래스는 잘짜와 시간을 계산하는데 꼭 필요한 
 * 			메서드나 상수로 구성돼있음.
 * 		-   ★★★★★★★★★★★★★★★★
 * 			Calendar 클래스를 객체 생성하려면 Calendar 클래스가
 * 			가진 클래스(정적) 메서드인 getInstance() 메서드를
 * 			써야함.
 * 		- getInstance() 메서드를 호출하면 내부적으로 java.util.GregorianCalendar 클래스의
 * 		  객체를 생성하여 반환해줌.
 * 		- GregorianCalendar 클래스는 Calendar 클래스의 자식 클래스임.
 * 		-   ★★★★★★★★★★★★★★★★
 * 			getInstance(): 싱글턴 방식. 하나의 인스턴스만을 갖고 공유해서 사용하고자 하는 방식. 접근지정자: private
 */

public class Calendar_03 {

	public static void main(String[] args) {
		//Calendar 클래스 객체 생성 방법
		Calendar cal = Calendar.getInstance();
		//날짜와 관련된 정보 확인 
		int year = cal.get(Calendar.YEAR); //현재 연도 반환
		int month = cal.get(Calendar.MONTH)+1; //현재 월
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		//1년 52주 중에 오늘은 몇 번째 주인지?
		int week = cal.get((Calendar.WEEK_OF_YEAR));
				
		System.out.println("지금 연도: "+year+"년");
		System.out.println("현재: "+month+"월");
		System.out.println("현재: "+day+"일");
		System.out.println("지금은 1년 52주 중에 "+week+"주입니다.");
		
		//시간과 관련된 정보를 확인해보자.
		//1. 12시간제를 이용하는 방법 ==> 오전(0)과 오후(1)로 나뉨
			int am_pm = cal.get(Calendar.AM_PM);
			int hour = cal.get((Calendar.HOUR));
			int minute = cal.get(Calendar.MINUTE);
			int second = cal.get(Calendar.SECOND);
			if(am_pm==0) {
				System.out.println("현재 시간은 오전 "+hour+"시 "+minute+"분 "+second+"초 입니다.");
			} else {
				System.out.println("현재 시간은 오전 "+hour+"시 "+minute+"분 "+second+"초 입니다.");
			}
			System.out.println();
		//2. 24시간제를 이용하는 방법 
		int hours = cal.get(Calendar.HOUR_OF_DAY); //하루 중 몇 시?
		System.out.println("현재 시간은 오전 "+hours+"시 "+minute+"분 "+second+"초 입니다.");
		}

}
