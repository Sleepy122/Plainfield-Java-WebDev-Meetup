package SpringMvcTemplate.domain;

public class Stat {
	private Integer base_stat;
	private Integer effort;
	private StatDescription stat;
	public Stat(Integer base_stat, Integer effort, StatDescription stat) {
		super();
		this.base_stat = base_stat;
		this.effort = effort;
		this.stat = stat;
	}
	public Integer getBase_stat() {
		return base_stat;
	}
	public void setBase_stat(Integer base_stat) {
		this.base_stat = base_stat;
	}
	public Integer getEffort() {
		return effort;
	}
	public void setEffort(Integer effort) {
		this.effort = effort;
	}
	public StatDescription getStat() {
		return stat;
	}
	public void setStat(StatDescription stat) {
		this.stat = stat;
	}
	
	
}
