package app.models;

import java.util.Date;
@javax.persistence.Entity
public class User extends Entity {

	private Integer idUser;
	private String name;
	private String email;
	private String password;
	private String provider;
	private Date birth;
	private String gender;

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getProvider() {
		return provider;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Date getBirth() {
		return birth;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

}
