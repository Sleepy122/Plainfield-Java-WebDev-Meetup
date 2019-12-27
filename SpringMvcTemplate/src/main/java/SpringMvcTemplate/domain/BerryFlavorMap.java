package SpringMvcTemplate.domain;

public class BerryFlavorMap {
	private Integer potency;
	private BerryFlavor flavor;
	public BerryFlavorMap(Integer potency, BerryFlavor flavor) {
		super();
		this.potency = potency;
		this.flavor = flavor;
	}
	public Integer getPotency() {
		return potency;
	}
	public void setPotency(Integer potency) {
		this.potency = potency;
	}
	public BerryFlavor getFlavor() {
		return flavor;
	}
	public void setFlavor(BerryFlavor flavor) {
		this.flavor = flavor;
	}
	
	
}
