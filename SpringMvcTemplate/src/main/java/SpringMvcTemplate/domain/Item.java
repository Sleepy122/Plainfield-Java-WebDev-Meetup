package SpringMvcTemplate.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Item {
	private Integer id;
	private String name;
	private Integer cost;
	private Integer fling_power;
	private ItemFlingEffect fling_effect;
	private List<ItemAttribute> attributes;
	private ItemCategory category;
	private List<VerboseEffect> effect_entries;
	private List<VersionGroupFlavorText> flavor_text_entries;
	@JsonIgnore
	private List<GenerationGameIndex> game_indices;
	private List<Name> names;
	@JsonIgnore
	private ItemSprites sprites;
	@JsonIgnore
	private List<ItemHolderPokemon> held_by_pokemon;
	@JsonIgnore
	private EvolutionChain baby_trigger_for;
	@JsonIgnore
	private MachineVersionDetail machines;
	public Item(Integer id, String name, Integer cost, Integer fling_power, ItemFlingEffect fling_effect,
			List<ItemAttribute> attributes, ItemCategory category, List<VerboseEffect> effect_entries,
			List<VersionGroupFlavorText> flavor_text_entries, List<GenerationGameIndex> game_indices, List<Name> names,
			ItemSprites sprites, List<ItemHolderPokemon> held_by_pokemon, EvolutionChain baby_trigger_for,
			MachineVersionDetail machines) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.fling_power = fling_power;
		this.fling_effect = fling_effect;
		this.attributes = attributes;
		this.category = category;
		this.effect_entries = effect_entries;
		this.flavor_text_entries = flavor_text_entries;
		this.game_indices = game_indices;
		this.names = names;
		this.sprites = sprites;
		this.held_by_pokemon = held_by_pokemon;
		this.baby_trigger_for = baby_trigger_for;
		this.machines = machines;
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
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public Integer getFling_power() {
		return fling_power;
	}
	public void setFling_power(Integer fling_power) {
		this.fling_power = fling_power;
	}
	public ItemFlingEffect getFling_effect() {
		return fling_effect;
	}
	public void setFling_effect(ItemFlingEffect fling_effect) {
		this.fling_effect = fling_effect;
	}
	public List<ItemAttribute> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<ItemAttribute> attributes) {
		this.attributes = attributes;
	}
	public ItemCategory getCategory() {
		return category;
	}
	public void setCategory(ItemCategory category) {
		this.category = category;
	}
	public List<VerboseEffect> getEffect_entries() {
		return effect_entries;
	}
	public void setEffect_entries(List<VerboseEffect> effect_entries) {
		this.effect_entries = effect_entries;
	}
	public List<VersionGroupFlavorText> getFlavor_text_entries() {
		return flavor_text_entries;
	}
	public void setFlavor_text_entries(List<VersionGroupFlavorText> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
	}
	public List<GenerationGameIndex> getGame_indices() {
		return game_indices;
	}
	public void setGame_indices(List<GenerationGameIndex> game_indices) {
		this.game_indices = game_indices;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public ItemSprites getSprites() {
		return sprites;
	}
	public void setSprites(ItemSprites sprites) {
		this.sprites = sprites;
	}
	public List<ItemHolderPokemon> getHeld_by_pokemon() {
		return held_by_pokemon;
	}
	public void setHeld_by_pokemon(List<ItemHolderPokemon> held_by_pokemon) {
		this.held_by_pokemon = held_by_pokemon;
	}
	public EvolutionChain getBaby_trigger_for() {
		return baby_trigger_for;
	}
	public void setBaby_trigger_for(EvolutionChain baby_trigger_for) {
		this.baby_trigger_for = baby_trigger_for;
	}
	public MachineVersionDetail getMachines() {
		return machines;
	}
	public void setMachines(MachineVersionDetail machines) {
		this.machines = machines;
	}
	
	
}
