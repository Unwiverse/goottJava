package inheritance;

public class Volume {
		int volume = 1;
		public void setVolume(int volume) {
				this.volume = volume;
		}
		public int getVolume() {
			return volume;
		}
		//볼륨을 올리는 메서드
		void volumeUp() {
			volume++;
			if(volume > 15) {
				volume = 15; //최대 음량 15
			}
		} //volumeUp메서드 end
		void volumeDown() {
			volume--;
			if(volume <1) {
				volume= 1; // 최소 음량 1
			}
		} //볼륨다운 메서드 end
}
