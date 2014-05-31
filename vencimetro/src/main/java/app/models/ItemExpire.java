package app.models;

import java.util.Date;
@javax.persistence.Entity
public class ItemExpire extends Entity {

	private String description;
	private Float value;
	private Date start;
	private Date expire;
	private Date lastNotice;
	private Integer origin;

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setValue(Float value) {
		this.value = value;
	}

	public Float getValue() {
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

	public void setLastNotice(Date lastNotice) {
		this.lastNotice = lastNotice;
	}

	public Date getLastNotice() {
		return lastNotice;
	}

	public void setOrigin(Integer origin) {
		this.origin = origin;
	}

	public Integer getOrigin() {
		return origin;
	}

}
