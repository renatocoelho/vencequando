package app.models;

@javax.persistence.Entity
public class UserList extends Entity {

	private Integer idUser;
	private Integer idList;

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdList(Integer idList) {
		this.idList = idList;
	}

	public Integer getIdList() {
		return idList;
	}

}
