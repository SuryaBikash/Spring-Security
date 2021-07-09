package com.music.album.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.album.dao.AlbumRepository;
import com.music.album.exception.AlbumException;
import com.music.album.model.Album;
import com.music.album.model.AlbumDTO;
import com.music.album.service.AlbumService;


@Service
public class AlbumServiceImpl extends AlbumService {

	@Autowired
	private AlbumRepository albumRepo;
	
	@Override
	public void createAlbum(AlbumDTO albumdto) {
		
		Album album=new Album();
		
		album.setName(albumdto.getName());
		album.setSinger(albumdto.getSinger());
		album.setLyricist(albumdto.getLyricist());
		album.setMusicdirector(albumdto.getMusicdirector());
		
		albumRepo.save(album);
	}
	@Override
	public List<AlbumDTO> getAllAlbum() {
		AlbumDTO albumDTO=null;
		List<Album> albumList=albumRepo.findAll();
		List<AlbumDTO> albumDTOList=new ArrayList<AlbumDTO>(); 
		if(albumList.size()>0) {
			for (Album album : albumList) {
				albumDTO=new AlbumDTO();
				albumDTO.setId(album.getAlbumId());
				albumDTO.setLyricist(album.getLyricist());
				albumDTO.setMusicdirector(album.getMusicdirector());
				albumDTO.setName(album.getName());
				albumDTO.setSinger(album.getSinger());
				albumDTOList.add(albumDTO);
			}
		}
		
		return albumDTOList;
	}
	@Override
	public AlbumDTO getAlbum(Integer ablumId) throws AlbumException {
		
		 Album album=albumRepo.findById(ablumId).orElseThrow(()-> new AlbumException("Album notfound"));
		
		 AlbumDTO albumDTO=new AlbumDTO();
		 albumDTO.setId(album.getAlbumId());
		 albumDTO.setName(album.getName());
		 albumDTO.setLyricist(album.getLyricist());
		 albumDTO.setMusicdirector(album.getMusicdirector());
		 albumDTO.setSinger(album.getSinger());
		 
		 return albumDTO;
	}

	@Override
	public void deleteAlbum(Integer albumId) {

		Album album=albumRepo.findById(albumId).orElseThrow(()->new AlbumException("Movie Not Found"));
		
		if (album.equals(null)) {
			throw new AlbumException("Album Object Not found");
		}else {
			album.setIsActive(false);
			albumRepo.save(album);
		}
	}

	@Override
	public void updateAlbum(AlbumDTO albumDTO) throws AlbumException {

		Album album=albumRepo.findById(albumDTO.getId()).orElseThrow(()->new AlbumException("Album not found")); 
		
		album.setName(albumDTO.getName());
		album.setLyricist(albumDTO.getLyricist());
		album.setMusicdirector(albumDTO.getMusicdirector());
		album.setSinger(albumDTO.getSinger());
		
		albumRepo.save(album);
	
	}

	
}
