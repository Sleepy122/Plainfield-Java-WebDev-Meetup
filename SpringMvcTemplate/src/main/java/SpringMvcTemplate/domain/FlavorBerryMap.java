package SpringMvcTemplate.domain;

public class FlavorBerryMap {
	private Integer potency;
	private Berry berry;
	public FlavorBerryMap(Integer potency, Berry berry) {
		super();
		this.potency = potency;
		this.berry = berry;
	}
	public Integer getPotency() {
		return potency;
	}
	public void setPotency(Integer potency) {
		this.potency = potency;
	}
	public Berry getBerry() {
		return berry;
	}
	public void setBerry(Berry berry) {
		this.berry = berry;
	}
	
}
