package SpringMvcTemplate.domain;

import java.util.ArrayList;
import java.util.List;

public class NabeelObject {
	private String name;
	private Integer weight;
	private Integer height;
	private String type;
	private List<String> moves;
	public NabeelObject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NabeelObject(String name, Integer weight, Integer height, String type) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.type = type;
		this.moves = new ArrayList();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<String> getMoves() {
		return moves;
	}
	public void setMoves(List<String> moves) {
		this.moves = moves;
	}
	
	public void addMove(String move) {
		moves.add(move);
	}
	
	
}
