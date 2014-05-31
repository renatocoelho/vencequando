package app.models;

import java.util.Date;
@javax.persistence.Entity
public class Notice extends Entity {

	private String type;
	private Date date;
	private Date frequence;
	private String ststus;

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setFrequence(Date frequence) {
		this.frequence = frequence;
	}

	public Date getFrequence() {
		return frequence;
	}

	public void setStstus(String ststus) {
		this.ststus = ststus;
	}

	public String getStstus() {
		return ststus;
	}

}
