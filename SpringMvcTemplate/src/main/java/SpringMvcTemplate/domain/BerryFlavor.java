package SpringMvcTemplate.domain;

import java.util.List;

public class BerryFlavor {
	private Integer id;
	private String name;
	private List<FlavorBerryMap> berries;
	private ContestType contest_type;
	private Name names;
	public BerryFlavor(Integer id, String name, List<FlavorBerryMap> berries, ContestType contest_type, Name names) {
		super();
		this.id = id;
		this.name = name;
		this.berries = berries;
		this.contest_type = contest_type;
		this.names = names;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<FlavorBerryMap> getBerries() {
		return berries;
	}
	public void setBerries(List<FlavorBerryMap> berries) {
		this.berries = berries;
	}
	public ContestType getContest_type() {
		return contest_type;
	}
	public void setContest_type(ContestType contest_type) {
		this.contest_type = contest_type;
	}
	public Name getNames() {
		return names;
	}
	public void setNames(Name names) {
		this.names = names;
	}
	
	
}
