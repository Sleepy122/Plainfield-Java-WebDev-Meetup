package SpringMvcTemplate.domain;

public class VersionGroupDetail {
	private Integer level_learned_at;
	private MoveLearnMethod move_learn_method;
	private VersionGroup version_group;
	
	
	public VersionGroupDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VersionGroupDetail(Integer level_learned_at, MoveLearnMethod move_learn_method, VersionGroup version_group) {
		super();
		this.level_learned_at = level_learned_at;
		this.move_learn_method = move_learn_method;
		this.version_group = version_group;
	}
	public Integer getLevel_learned_at() {
		return level_learned_at;
	}
	public void setLevel_learned_at(Integer level_learned_at) {
		this.level_learned_at = level_learned_at;
	}
	public MoveLearnMethod getMove_learn_method() {
		return move_learn_method;
	}
	public void setMove_learn_method(MoveLearnMethod move_learn_method) {
		this.move_learn_method = move_learn_method;
	}
	public VersionGroup getVersion_group() {
		return version_group;
	}
	public void setVersion_group(VersionGroup version_group) {
		this.version_group = version_group;
	}
	
	
}
