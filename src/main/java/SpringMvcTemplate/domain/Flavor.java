package SpringMvcTemplate.domain;

import java.io.Serializable;
import java.util.List;

public class Flavor implements Serializable {
	private Integer id;
	private String name;
	private List<FlavorBerryMap> berries;
	private ContestType contest_type;
	private Name names;
	private String url;
	
	public Flavor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flavor(Integer id, String name, List<FlavorBerryMap> berries, ContestType contest_type, Name names,
			String url) {
		super();
		this.id = id;
		this.name = name;
		this.berries = berries;
		this.contest_type = contest_type;
		this.names = names;
		this.url = url;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
