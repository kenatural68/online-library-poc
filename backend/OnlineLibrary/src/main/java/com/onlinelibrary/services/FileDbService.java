package com.onlinelibrary.services;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.onlinelibrary.entities.FileDb;
import com.onlinelibrary.repos.FileDbRepository;


@Service
public class FileDbService {
	
	@Autowired
	private FileDbRepository filedbRepository;
	
//	public FileDb store(MultipartFile file) throws IOException {
//	String fileName = file.getOriginalFilename();
//	FileDb fileDb = new FileDb(UUID.randomUUID().toString(),fileName, file.getContentType(), file.getBytes());
//	return filedbRepository.save(fileDb);
//}
	
//	public FileDb store(MultipartFile file, 
//			@RequestParam("title") String title,
//			@RequestParam("author") String author,
//			@RequestParam("genre") String genre,
//			@RequestParam("description") String description
//			) throws IOException {
//	String fileName = file.getOriginalFilename();
//	String title = 
//	
//	FileDb fileDb = new FileDb(UUID.randomUUID().toString(),fileName, file.getContentType(), file.getBytes());
//	return filedbRepository.save(fileDb);
//}
	
	
	//, @RequestBody FileDb fileDb
	public FileDb store(MultipartFile file, String title, String author, String genre, String description) throws IOException {
String fileName = file.getOriginalFilename();
//String title = "asd";
//String author = null;
//String genre = null;
//String description = null;


FileDb fileDb = new FileDb(UUID.randomUUID().toString(),fileName, file.getContentType(), file.getBytes(), title, author, genre);
return filedbRepository.save(fileDb);
}
	
	

	
public FileDb getFileById(String id) {
	Optional<FileDb> fileOptional = filedbRepository.findById(id);
	
	
	if(fileOptional.isPresent()) {
		return fileOptional.get();
	}
	
			return null;
			
}

public List<FileDb> getFileList(){
	return filedbRepository.findAll();
}

}
