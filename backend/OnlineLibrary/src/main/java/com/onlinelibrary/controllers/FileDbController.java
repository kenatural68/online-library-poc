package com.onlinelibrary.controllers;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.google.common.base.Optional;
import com.onlinelibrary.entities.FileDb;
import com.onlinelibrary.repos.FileDbRepository;
import com.onlinelibrary.services.FileDbService;



@RestController
//@RequestMapping("file")
public class FileDbController {
	
	@Autowired
	private FileDbRepository fileDbRepository;
	
	@PostMapping("/upload")
	@CrossOrigin(origins ="http://localhost:4200")
	public FileDb uplaodImage(@RequestParam("bookpdf") MultipartFile file, String title, String author, String genre) throws IOException {

		System.out.println("Original Image Byte Size - " + file.getBytes().length);
		FileDb book = new FileDb(UUID.randomUUID().toString(), file.getOriginalFilename(),file.getContentType(),file.getBytes(), title, author, genre);
		return fileDbRepository.save(book);
	}
	
//	@GetMapping("/list")
//	public List<FileDb> getFileList(){
//		return fileDbRepository.getFileList();
//		
//	}

	
//	@PostMapping("/file")
//	@CrossOrigin(origins ="http://localhost:4200")
//	public FileDb uploadFile(@RequestParam("file") MultipartFile file, String title, String author, String genre, String description) throws IOException {
//		return fileDbService.store(file, title, author, genre, description);
//			
//	}
//	@GetMapping("/{id}")
//	public FileDb getFile(@PathVariable String id) {
//		return fileDbService.getFileById(id);
//	}
//	
//	
//	@GetMapping(path = { "/get/{name}" })
//	public FileDb getImage(@PathVariable("name") String name) throws IOException {
//
//		final Optional<FileDb> retrievedImage = fileDbRepository.findByName(name);
//		FileDb img = new FileDb(retrievedImage.get().getName(), retrievedImage.get().getType(),name, retrievedImage.get().getData(), name, name, name);
//		return img;
//	}
	
	
	
	@GetMapping("/list")
	@CrossOrigin(origins ="http://localhost:4200")
	public List<FileDb> getFileList(){
		return fileDbRepository.findAll();
		
	}

}
