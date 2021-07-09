package com.music.album.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.music.album.exception.AlbumException;
import com.music.album.model.AlbumDTO;
import com.music.album.service.AlbumService;

@RestController
@CrossOrigin(origins="http://localhost:4200/", allowedHeaders = "*")
@RequestMapping("/album")
public class AlbumController {

	@Autowired
	private AlbumService albumService;

	@GetMapping("/viewAlbum")
	public ResponseEntity<Object> getMovie(@RequestParam("albumId") Integer ablumId) throws AlbumException {
		AlbumDTO album=null;
		if (ablumId == 0) {
			throw new AlbumException("Album id should not be zero");
		} else {
			album = albumService.getAlbum(ablumId);
		}

		return ResponseEntity.ok(album);

	}
	
	@GetMapping("/viewAllAlbum")
	public ResponseEntity<Object> getAllMovie() throws AlbumException {
		List<AlbumDTO> albumList=null;
		
		albumList = albumService.getAllAlbum();
		
		return ResponseEntity.ok(albumList);

	}

	@PostMapping("/createAlbum")
	public ResponseEntity<Object> createAlbum(@RequestBody AlbumDTO album) throws AlbumException {
		if (album.equals(null)) {
			throw new AlbumException("Album should not be Empty");
		} else {
			albumService.createAlbum(album);
		}

		return ResponseEntity.ok(HttpStatus.CREATED);
	}
	@PutMapping("/updateAlbum")
	public ResponseEntity<Object> updateMovie(@RequestBody AlbumDTO album) throws AlbumException {
		if (album.equals(null)) {
			throw new AlbumException("Album should not be Empty");
		} else {
			albumService.updateAlbum(album);
		}

		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteAlbum")
	public ResponseEntity<Object> deleteById(@RequestParam("albumId") Integer albumId){
		if (albumId == 0) {
			throw new AlbumException("Album Id Should Not be Zero");
		} else {
			albumService.deleteAlbum(albumId);
		}
		return ResponseEntity.ok(HttpStatus.OK);
	}


}
