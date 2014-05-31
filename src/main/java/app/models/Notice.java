package app.models;

import java.util.Date;
@javax.persistence.Entity
public class Notice extends Entity {

	private Integer idNotice;
	private String type;
	private Date data;
	private String frequency;
	private Integer status;

	public void setIdNotice(Integer idNotice) {
		this.idNotice = idNotice;
	}

	public Integer getIdNotice() {
		return idNotice;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getData() {
		return data;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStatus() {
		return status;
	}

}
