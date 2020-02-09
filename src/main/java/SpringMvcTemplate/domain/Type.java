package SpringMvcTemplate.domain;

public class Type {
	private Integer slot;
	private TypeDescription type;
	
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Type(Integer slot, TypeDescription type) {
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
	public TypeDescription getType() {
		return type;
	}
	public void setType(TypeDescription type) {
		this.type = type;
	}
	
	
}
