package SpringMvcTemplate.domain;

import java.util.List;

public class Pokemon {
	private Integer id;
	private String name;
	private Integer base_experience;
	private Integer height;
	private boolean is_default;
	private String location_area_encounters;
	private Integer order;
	private Integer weight;
	private List<Ability> abilities;
	private List<GameIndicy> game_indices;
	private List<Move> moves;
	private List<Species> species;
	private List<Stat> stats;
	private List<Type> types;
	private List<Sprite> sprites;
	public Pokemon(Integer id, String name, Integer base_experience, Integer height, boolean is_default,
			String location_area_encounters, Integer order, Integer weight, List<Ability> abilities,
			List<GameIndicy> game_indices, List<Move> moves, List<Species> species, List<Stat> stats, List<Type> types,
			List<Sprite> sprites) {
		super();
		this.id = id;
		this.name = name;
		this.base_experience = base_experience;
		this.height = height;
		this.is_default = is_default;
		this.location_area_encounters = location_area_encounters;
		this.order = order;
		this.weight = weight;
		this.abilities = abilities;
		this.game_indices = game_indices;
		this.moves = moves;
		this.species = species;
		this.stats = stats;
		this.types = types;
		this.sprites = sprites;
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
	public Integer getBase_experience() {
		return base_experience;
	}
	public void setBase_experience(Integer base_experience) {
		this.base_experience = base_experience;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public boolean isIs_default() {
		return is_default;
	}
	public void setIs_default(boolean is_default) {
		this.is_default = is_default;
	}
	public String getLocation_area_encounters() {
		return location_area_encounters;
	}
	public void setLocation_area_encounters(String location_area_encounters) {
		this.location_area_encounters = location_area_encounters;
	}
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
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
	public List<Move> getMoves() {
		return moves;
	}
	public void setMoves(List<Move> moves) {
		this.moves = moves;
	}
	public List<Species> getSpecies() {
		return species;
	}
	public void setSpecies(List<Species> species) {
		this.species = species;
	}
	public List<Stat> getStats() {
		return stats;
	}
	public void setStats(List<Stat> stats) {
		this.stats = stats;
	}
	public List<Type> getTypes() {
		return types;
	}
	public void setTypes(List<Type> types) {
		this.types = types;
	}
	public List<Sprite> getSprites() {
		return sprites;
	}
	public void setSprites(List<Sprite> sprites) {
		this.sprites = sprites;
	}
	
	
	
	
}
