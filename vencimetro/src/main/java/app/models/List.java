package app.models;

@javax.persistence.Entity
public class List extends Entity {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
