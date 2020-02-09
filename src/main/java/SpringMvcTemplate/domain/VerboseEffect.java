package SpringMvcTemplate.domain;

public class VerboseEffect {
	private String effect;
	private String short_effect;
	private Language language;
	public VerboseEffect(String effect, String short_effect, Language language) {
		super();
		this.effect = effect;
		this.short_effect = short_effect;
		this.language = language;
	}
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	public String getShort_effect() {
		return short_effect;
	}
	public void setShort_effect(String short_effect) {
		this.short_effect = short_effect;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	
	
}
