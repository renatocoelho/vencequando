package app.models;

import java.util.Date;
@javax.persistence.Entity
public class ItemExpire extends Entity {

	private Integer idItemExpire;
	private String description;
	private String value;
	private Date start;
	private Date expire;
	private String lastNotice;
	private String origin;

	public void setIdItemExpire(Integer idItemExpire) {
		this.idItemExpire = idItemExpire;
	}

	public Integer getIdItemExpire() {
		return idItemExpire;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getStart() {
		return start;
	}

	public void setExpire(Date expire) {
		this.expire = expire;
	}

	public Date getExpire() {
		return expire;
	}

	public void setLastNotice(String lastNotice) {
		this.lastNotice = lastNotice;
	}

	public String getLastNotice() {
		return lastNotice;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getOrigin() {
		return origin;
	}

}
