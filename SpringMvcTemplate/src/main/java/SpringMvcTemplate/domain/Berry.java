package SpringMvcTemplate.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Berry {
	private int id;
	private String name;
	private Integer growth_time;
	private Integer max_harvest;
	private Integer natural_gift_power;
	private Integer size;
	private Integer smoothness;
	private Integer soil_dryness;
	@JsonIgnore
	private BerryFirmness firmness;
	@JsonIgnore
	private List<BerryFlavorMap> flavors;
	@JsonIgnore
	private Item item;
	@JsonIgnore
	private Type natural_gift_type;
	public Berry(int id, String name, Integer growth_time, Integer max_harvest, Integer natural_gift_power,
			Integer size, Integer smoothness, Integer soil_dryness, BerryFirmness firmness,
			List<BerryFlavorMap> flavors, Item item, Type natural_gift_type) {
		super();
		this.id = id;
		this.name = name;
		this.growth_time = growth_time;
		this.max_harvest = max_harvest;
		this.natural_gift_power = natural_gift_power;
		this.size = size;
		this.smoothness = smoothness;
		this.soil_dryness = soil_dryness;
		this.firmness = firmness;
		this.flavors = flavors;
		this.item = item;
		this.natural_gift_type = natural_gift_type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGrowth_time() {
		return growth_time;
	}
	public void setGrowth_time(Integer growth_time) {
		this.growth_time = growth_time;
	}
	public Integer getMax_harvest() {
		return max_harvest;
	}
	public void setMax_harvest(Integer max_harvest) {
		this.max_harvest = max_harvest;
	}
	public Integer getNatural_gift_power() {
		return natural_gift_power;
	}
	public void setNatural_gift_power(Integer natural_gift_power) {
		this.natural_gift_power = natural_gift_power;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getSmoothness() {
		return smoothness;
	}
	public void setSmoothness(Integer smoothness) {
		this.smoothness = smoothness;
	}
	public Integer getSoil_dryness() {
		return soil_dryness;
	}
	public void setSoil_dryness(Integer soil_dryness) {
		this.soil_dryness = soil_dryness;
	}
	public BerryFirmness getFirmness() {
		return firmness;
	}
	public void setFirmness(BerryFirmness firmness) {
		this.firmness = firmness;
	}
	public List<BerryFlavorMap> getFlavors() {
		return flavors;
	}
	public void setFlavors(List<BerryFlavorMap> flavors) {
		this.flavors = flavors;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Type getNatural_gift_type() {
		return natural_gift_type;
	}
	public void setNatural_gift_type(Type natural_gift_type) {
		this.natural_gift_type = natural_gift_type;
	}
	
}
