package SpringMvcTemplate.domain;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Berry  implements Serializable {
	private List<BerryFlavorMap> flavors;
	private TypeDescription natural_gift_type;
	private Item item;
	private int id;
	private String name;
	private int growth_time;
	private int max_harvest;
	private int natural_gift_power;
	private int size;
	private int smoothness;
	private int soil_dryness;
	private BerryFirmness firmness;

	public Berry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Berry(List<BerryFlavorMap> flavors, TypeDescription natural_gift_type, Item item, int id, String name, int growth_time,
			int max_harvest, int natural_gift_power, int size, int smoothness, int soil_dryness,
			BerryFirmness firmness) {
		super();
		this.flavors = flavors;
		this.natural_gift_type = natural_gift_type;
		this.item = item;
		this.id = id;
		this.name = name;
		this.growth_time = growth_time;
		this.max_harvest = max_harvest;
		this.natural_gift_power = natural_gift_power;
		this.size = size;
		this.smoothness = smoothness;
		this.soil_dryness = soil_dryness;
		this.firmness = firmness;
	}

	public List<BerryFlavorMap> getFlavors() {
		return flavors;
	}

	public void setFlavors(List<BerryFlavorMap> flavors) {
		this.flavors = flavors;
	}

	public TypeDescription getNatural_gift_type() {
		return natural_gift_type;
	}

	public void setNatural_gift_type(TypeDescription natural_gift_type) {
		this.natural_gift_type = natural_gift_type;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
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

	public int getGrowth_time() {
		return growth_time;
	}

	public void setGrowth_time(int growth_time) {
		this.growth_time = growth_time;
	}

	public int getMax_harvest() {
		return max_harvest;
	}

	public void setMax_harvest(int max_harvest) {
		this.max_harvest = max_harvest;
	}

	public int getNatural_gift_power() {
		return natural_gift_power;
	}

	public void setNatural_gift_power(int natural_gift_power) {
		this.natural_gift_power = natural_gift_power;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSmoothness() {
		return smoothness;
	}

	public void setSmoothness(int smoothness) {
		this.smoothness = smoothness;
	}

	public int getSoil_dryness() {
		return soil_dryness;
	}

	public void setSoil_dryness(int soil_dryness) {
		this.soil_dryness = soil_dryness;
	}

	public BerryFirmness getFirmness() {
		return firmness;
	}

	public void setFirmness(BerryFirmness firmness) {
		this.firmness = firmness;
	}
	
	
	
	
}
