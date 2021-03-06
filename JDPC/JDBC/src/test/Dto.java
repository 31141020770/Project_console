package test;

import java.io.Serializable;

public class Dto implements Serializable{
	private String id;
	private String name;
	private String dprtmt_id;
	private String rank_id;
	private String reg_id;
	private String reg_date;
	private String updt_id;
	private String updt_date;
	private String del_id;
	private String del_date;
	public Dto() {
		super();
	}
	public Dto(String id, String name, String dprtmt_id, String rank_id, String reg_id, String reg_date, String updt_id,
			String updt_date, String del_id, String del_date) {
		super();
		this.id = id;
		this.name = name;
		this.dprtmt_id = dprtmt_id;
		this.rank_id = rank_id;
		this.reg_id = reg_id;
		this.reg_date = reg_date;
		this.updt_id = updt_id;
		this.updt_date = updt_date;
		this.del_id = del_id;
		this.del_date = del_date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDprtmt_id() {
		return dprtmt_id;
	}
	public void setDprtmt_id(String dprtmt_id) {
		this.dprtmt_id = dprtmt_id;
	}
	public String getRank_id() {
		return rank_id;
	}
	public void setRank_id(String rank_id) {
		this.rank_id = rank_id;
	}
	public String getReg_id() {
		return reg_id;
	}
	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public String getUpdt_id() {
		return updt_id;
	}
	public void setUpdt_id(String updt_id) {
		this.updt_id = updt_id;
	}
	public String getUpdt_date() {
		return updt_date;
	}
	public void setUpdt_date(String updt_date) {
		this.updt_date = updt_date;
	}
	public String getDel_id() {
		return del_id;
	}
	public void setDel_id(String del_id) {
		this.del_id = del_id;
	}
	public String getDel_date() {
		return del_date;
	}
	public void setDel_date(String del_date) {
		this.del_date = del_date;
	}
	
	
}
