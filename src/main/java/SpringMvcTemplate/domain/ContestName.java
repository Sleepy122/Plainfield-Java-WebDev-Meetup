package SpringMvcTemplate.domain;

public class ContestName {
	private String name;
	private String color;
	private Language language;
	public ContestName(String name, String color, Language language) {
		super();
		this.name = name;
		this.color = color;
		this.language = language;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	
	
}
