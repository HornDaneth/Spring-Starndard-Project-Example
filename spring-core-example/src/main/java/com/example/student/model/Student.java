package com.example.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="tu_student")
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY, region="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="stu_id",nullable=false)
	private long id;
	
	@Column(name="stu_name",length=50,nullable=true)
	private String name;
	
	@Column(name="stu_addr",length=50,nullable=true)
	private String address;
	
	@Column(name="stu_tel",length=50,nullable=true)
	private String tel;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", tel=" + tel + "]";
	}
	
	
}
