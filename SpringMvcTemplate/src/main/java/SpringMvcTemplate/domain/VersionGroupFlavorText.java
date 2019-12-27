package SpringMvcTemplate.domain;

public class VersionGroupFlavorText {
	private String text;
	private Language language;
	private VersionGroup version_group;
	public VersionGroupFlavorText(String text, Language language, VersionGroup version_group) {
		super();
		this.text = text;
		this.language = language;
		this.version_group = version_group;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public VersionGroup getVersion_group() {
		return version_group;
	}
	public void setVersion_group(VersionGroup version_group) {
		this.version_group = version_group;
	}
	
	
}
