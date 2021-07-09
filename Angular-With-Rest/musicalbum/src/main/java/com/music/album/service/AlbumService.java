package com.music.album.service;

import java.util.List;

import com.music.album.model.AlbumDTO;

public abstract class AlbumService {


	public abstract AlbumDTO getAlbum(Integer ablumId);

	public abstract void createAlbum(AlbumDTO album);

	public abstract void updateAlbum(AlbumDTO album);

	public abstract void deleteAlbum(Integer albumId);

	public abstract List<AlbumDTO> getAllAlbum();

}
