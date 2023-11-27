package _05_class._interface;

public class Monitor implements RemoteControl{
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Monitor 전원 ON");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Monitor 전원 OFF");
		
	}
	
	
	// volume !== this.volume
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
	
		// volume : 매개로 넘긴 volume
		// --> 그래서 this를 붙여야 함
		System.out.println("현재 모니터 음량 : " + this.volume);
	}
	
	
}
