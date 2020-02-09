package SpringMvcTemplate.domain;

public class Effect {
	private String effect;
	private Language language;
	public Effect(String effect, Language language) {
		super();
		this.effect = effect;
		this.language = language;
	}
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	
}
