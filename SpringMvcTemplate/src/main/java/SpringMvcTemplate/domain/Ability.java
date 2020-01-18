package SpringMvcTemplate.domain;

public class Ability {
	private AbilityDescription ability;
	private boolean is_hidden;
	private Integer slot;
	
	
	public Ability() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ability(AbilityDescription ability, boolean is_hidden, Integer slot) {
		super();
		this.ability = ability;
		this.is_hidden = is_hidden;
		this.slot = slot;
	}
	public AbilityDescription getAbility() {
		return ability;
	}
	public void setAbility(AbilityDescription ability) {
		this.ability = ability;
	}
	public boolean isIs_hidden() {
		return is_hidden;
	}
	public void setIs_hidden(boolean is_hidden) {
		this.is_hidden = is_hidden;
	}
	public Integer getSlot() {
		return slot;
	}
	public void setSlot(Integer slot) {
		this.slot = slot;
	}
	
}
