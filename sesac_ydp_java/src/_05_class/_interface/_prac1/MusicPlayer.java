package _05_class._interface._prac1;

public class MusicPlayer {
	public static void main(String[] args) {
		Music m;
		m = new Mp3Player();
		m.getMusic("아이유 블루밍");
		System.out.println("=== MP3 Player ===");
		m.play();
		m.stop();
		
		m = new CdPlayer();
		m.getMusic("아이유 꽃갈피");
		System.out.println("=== CD Player ===");
		m.play();
		m.stop();
	}
}
