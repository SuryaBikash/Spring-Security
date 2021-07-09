package com.music.album.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.music.album.model.Album;

public interface AlbumRepository extends JpaRepository<Album, Integer>{

}
