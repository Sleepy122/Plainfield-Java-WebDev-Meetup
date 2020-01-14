package SpringMvcTemplate.domain;

public class Type {
	private Integer slot;
	private Type type;
	public Type(Integer slot, Type type) {
		super();
		this.slot = slot;
		this.type = type;
	}
	public Integer getSlot() {
		return slot;
	}
	public void setSlot(Integer slot) {
		this.slot = slot;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	
}
