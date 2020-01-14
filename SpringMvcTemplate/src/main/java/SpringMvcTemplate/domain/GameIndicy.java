package SpringMvcTemplate.domain;

public class GameIndicy {
	private Integer game_index;
	private Version version;
	public GameIndicy(Integer game_index, Version version) {
		super();
		this.game_index = game_index;
		this.version = version;
	}
	public Integer getGame_index() {
		return game_index;
	}
	public void setGame_index(Integer game_index) {
		this.game_index = game_index;
	}
	public Version getVersion() {
		return version;
	}
	public void setVersion(Version version) {
		this.version = version;
	}
	
	
}
