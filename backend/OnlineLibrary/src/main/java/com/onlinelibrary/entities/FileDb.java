package com.onlinelibrary.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="FILES")
public class FileDb {

	@Id
	private String id;
	private String name;
	private String type;
	
	@Lob
	private byte[] data;
	
	private String title;
	private String author;
	private String genre;

	
	

	
	public FileDb() {
		
	}




	public FileDb(String id, String name, String type, byte[] data, String title, String author, String genre) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.data = data;
		this.title = title;
		this.author = author;
		this.genre = genre;

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




	public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}




	public byte[] getData() {
		return data;
	}




	public void setData(byte[] data) {
		this.data = data;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getAuthor() {
		return author;
	}




	public void setAuthor(String author) {
		this.author = author;
	}




	public String getGenre() {
		return genre;
	}




	public void setGenre(String genre) {
		this.genre = genre;
	}




	


	
	
	
//	public FileDb(String id, String name, String type, byte[] data) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.type = type;
//		this.data = data;
//	}
//
//
//
//
//
//	public String getId() {
//		return id;
//	}
//
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//
//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//	public String getType() {
//		return type;
//	}
//
//
//	public void setType(String type) {
//		this.type = type;
//	}
//
//
//	public byte[] getData() {
//		return data;
//	}
//
//
//	public void setData(byte[] data) {
//		this.data = data;
//	}
	
	
}
