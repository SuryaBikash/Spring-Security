package com.music.album.model;

public class AlbumDTO {

	private Integer id;
	private String name;
	private String singer;
	private String musicdirector;
	private String lyricist;
	
	
	public AlbumDTO() {
	}
	
	
	
	public AlbumDTO(Integer id, String name, String singer, String musicdirector, String lyricist) {
		super();
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.musicdirector = musicdirector;
		this.lyricist = lyricist;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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





}
