package SpringMvcTemplate.domain;

import java.util.List;

public class ContestType {
	private Integer id;
	private String name;
	private BerryFlavor berry_flavor;
	private List<ContestName> names;
	public ContestType(Integer id, String name, BerryFlavor berry_flavor, List<ContestName> names) {
		super();
		this.id = id;
		this.name = name;
		this.berry_flavor = berry_flavor;
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
	public BerryFlavor getBerry_flavor() {
		return berry_flavor;
	}
	public void setBerry_flavor(BerryFlavor berry_flavor) {
		this.berry_flavor = berry_flavor;
	}
	public List<ContestName> getNames() {
		return names;
	}
	public void setNames(List<ContestName> names) {
		this.names = names;
	}
	
	
}
