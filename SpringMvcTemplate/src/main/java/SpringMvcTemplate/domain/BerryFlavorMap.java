package SpringMvcTemplate.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class BerryFlavorMap  implements Serializable {
	private Integer potency;
	private Flavor flavor;
	
	public BerryFlavorMap() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BerryFlavorMap(Integer potency, Flavor flavor) {
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

	public Flavor getFlavor() {
		return flavor;
	}

	public void setFlavor(Flavor flavor) {
		this.flavor = flavor;
	}

	
}
