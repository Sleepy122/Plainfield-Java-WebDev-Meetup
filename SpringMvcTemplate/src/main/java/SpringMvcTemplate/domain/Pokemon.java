package SpringMvcTemplate.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Pokemon {
	@JsonIgnore
	private String location_area_encounters;
	
	private List<Type> types;
	
	@JsonIgnore
	private Integer base_experience;
	
	@JsonIgnore
	private List<Item> held_items;
	
	
	private Integer weight;
	
	@JsonIgnore
	private boolean is_default;
	
	@JsonIgnore
	private Sprite sprites;
	
	@JsonIgnore
	private List<Ability> abilities;
	
	@JsonIgnore
	private List<GameIndicy> game_indices;
	
	@JsonIgnore
	private Species species;
	
	@JsonIgnore
	private List<Stat> stats;
	
	@JsonIgnore
	private List<Move> moves;
	
	private String name;
	
	@JsonIgnore
	private Integer id;
	
	@JsonIgnore
	private List<Form> forms;
	
	private Integer height;
	
	@JsonIgnore
	private Integer order;
	
	private List<String> moveNames;
	
	public Pokemon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pokemon(String location_area_encounters, List<Type> types, Integer base_experience, List<Item> held_items,
			Integer weight, boolean is_default, Sprite sprites, List<Ability> abilities,
			List<GameIndicy> game_indices, Species species, List<Stat> stats, List<Move> moves, String name,
			Integer id, List<Form> forms, Integer height, Integer order) {
		super();
		this.location_area_encounters = location_area_encounters;
		this.types = types;
		this.base_experience = base_experience;
		this.held_items = held_items;
		this.weight = weight;
		this.is_default = is_default;
		this.sprites = sprites;
		this.abilities = abilities;
		this.game_indices = game_indices;
		this.species = species;
		this.stats = stats;
		this.moves = moves;
		this.name = name;
		this.id = id;
		this.forms = forms;
		this.height = height;
		this.order = order;
	}
	public String getLocation_area_encounters() {
		return location_area_encounters;
	}
	public void setLocation_area_encounters(String location_area_encounters) {
		this.location_area_encounters = location_area_encounters;
	}
	public List<Type> getTypes() {
		return types;
	}
	public void setTypes(List<Type> types) {
		this.types = types;
	}
	public Integer getBase_experience() {
		return base_experience;
	}
	public void setBase_experience(Integer base_experience) {
		this.base_experience = base_experience;
	}
	public List<Item> getHeld_items() {
		return held_items;
	}
	public void setHeld_items(List<Item> held_items) {
		this.held_items = held_items;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public boolean isIs_default() {
		return is_default;
	}
	public void setIs_default(boolean is_default) {
		this.is_default = is_default;
	}
	public Sprite getSprites() {
		return sprites;
	}
	public void setSprites(Sprite sprites) {
		this.sprites = sprites;
	}
	public List<Ability> getAbilities() {
		return abilities;
	}
	public void setAbilities(List<Ability> abilities) {
		this.abilities = abilities;
	}
	public List<GameIndicy> getGame_indices() {
		return game_indices;
	}
	public void setGame_indices(List<GameIndicy> game_indices) {
		this.game_indices = game_indices;
	}
	public Species getSpecies() {
		return species;
	}
	public void setSpecies(Species species) {
		this.species = species;
	}
	public List<Stat> getStats() {
		return stats;
	}
	public void setStats(List<Stat> stats) {
		this.stats = stats;
	}
	public List<Move> getMoves() {
		return moves;
	}
	public void setMoves(List<Move> moves) {
		this.moves = moves;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Form> getForms() {
		return forms;
	}
	public void setForms(List<Form> forms) {
		this.forms = forms;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}
	public List<String> getMoveNames() {
		return moveNames;
	}
	public void setMoveNames(List<String> moveNames) {
		this.moveNames = moveNames;
	}
	
	public void addMoveNames(String moveName) {
		this.moveNames.add(moveName);
	}

	
}
