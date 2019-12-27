package SpringMvcTemplate.domain;

public class Description {
	private String description;
	private Language language;
	public Description(String description, Language language) {
		super();
		this.description = description;
		this.language = language;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	
	
}
