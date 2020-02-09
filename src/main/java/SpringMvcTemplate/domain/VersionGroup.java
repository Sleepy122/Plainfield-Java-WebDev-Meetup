package SpringMvcTemplate.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class VersionGroup {
	private Integer id;
	private String name;
	private Integer order;
	private String url;
	@JsonIgnore
	private Generation generation;
	@JsonIgnore
	private List<MoveLearnMethod> move_learn_methods;
	@JsonIgnore
	private Pokedex pokedexes;
	@JsonIgnore
	private Region regions;
	@JsonIgnore
	private Version versions;
	
	

	public VersionGroup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VersionGroup(Integer id, String name, Integer order, String url, Generation generation,
			List<MoveLearnMethod> move_learn_methods, Pokedex pokedexes, Region regions, Version versions) {
		super();
		this.id = id;
		this.name = name;
		this.order = order;
		this.url = url;
		this.generation = generation;
		this.move_learn_methods = move_learn_methods;
		this.pokedexes = pokedexes;
		this.regions = regions;
		this.versions = versions;
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

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Generation getGeneration() {
		return generation;
	}

	public void setGeneration(Generation generation) {
		this.generation = generation;
	}

	public List<MoveLearnMethod> getMove_learn_methods() {
		return move_learn_methods;
	}

	public void setMove_learn_methods(List<MoveLearnMethod> move_learn_methods) {
		this.move_learn_methods = move_learn_methods;
	}

	public Pokedex getPokedexes() {
		return pokedexes;
	}

	public void setPokedexes(Pokedex pokedexes) {
		this.pokedexes = pokedexes;
	}

	public Region getRegions() {
		return regions;
	}

	public void setRegions(Region regions) {
		this.regions = regions;
	}

	public Version getVersions() {
		return versions;
	}

	public void setVersions(Version versions) {
		this.versions = versions;
	}
	
}
