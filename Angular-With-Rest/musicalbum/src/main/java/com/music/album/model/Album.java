package com.music.album.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "album")
public class Album implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 526370338411794282L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer albumId;
	@Column(name = "name")
	private String name;
	@Column(name = "singer")
	private String singer;
	@Column(name = "music_director")
	private String musicdirector;
	@Column(name = "lyricist")
	private String lyricist;
	
	
	public Album() {
	}
	public Album(Integer albumId, String name, String singer, String musicdirector, String lyricist) {
		super();
		this.albumId = albumId;
		this.name = name;
		this.singer = singer;
		this.musicdirector = musicdirector;
		this.lyricist = lyricist;
	}
	public Integer getAlbumId() {
		return albumId;
	}
	public void setAlbumId(Integer albumId) {
		this.albumId = albumId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getMusicdirector() {
		return musicdirector;
	}
	public void setMusicdirector(String musicdirector) {
		this.musicdirector = musicdirector;
	}
	public String getLyricist() {
		return lyricist;
	}
	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}
	public void setIsActive(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
	
	
		

}
