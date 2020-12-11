package com.example.demo.entities;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Restaurant {
 
	@Id
	private int id;
	private String name;
	private int phone;
	private String address;
	private String inTime;
	private String outTime;
	private String status;
	
	
	public Restaurant() {}
	
	public Restaurant(int id, String name,int phone, String address, String inTime, String outTime,String status) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.inTime = inTime;
		this.outTime = outTime;
		this.status=status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public String getOutTime() {
		return outTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	 
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", inTime="
				+ inTime + ", outTime=" + outTime + ", status=" + status + "]";
	}

	
	
	
	
	
}
