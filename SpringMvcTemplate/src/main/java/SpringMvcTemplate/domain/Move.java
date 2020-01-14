package SpringMvcTemplate.domain;

import java.util.List;

public class Move {
	private MoveDescription move;
	private List<VersionGroupDetail> version_group_details;
	public Move(MoveDescription move, List<VersionGroupDetail> version_group_details) {
		super();
		this.move = move;
		this.version_group_details = version_group_details;
	}
	public MoveDescription getMove() {
		return move;
	}
	public void setMove(MoveDescription move) {
		this.move = move;
	}
	public List<VersionGroupDetail> getVersion_group_details() {
		return version_group_details;
	}
	public void setVersion_group_details(List<VersionGroupDetail> version_group_details) {
		this.version_group_details = version_group_details;
	}
	
	

}
