package SpringMvcTemplate.domain;

public class Version {
	private String name;
	private String url;
	
	
	public Version() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Version(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}