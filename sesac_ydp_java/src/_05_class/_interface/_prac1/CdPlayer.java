package _05_class._interface._prac1;

public class CdPlayer implements Music {

	private String name;

	  @Override
	  public void getMusic(String name) {
	    this.name = name;
	  }
	
	@Override
	public void play() {
	    System.out.printf("CD 플레이어에서 '%s' 앨범을 재생합니다.\n", name);
	    }

	@Override
	public void stop() {
		 System.out.printf("CD 플레이어에서 '%s' 앨범을 정지합니다.\n\n", name);
	}
	
}
