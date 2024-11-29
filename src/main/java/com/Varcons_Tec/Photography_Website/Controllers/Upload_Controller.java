package com.Varcons_Tec.Photography_Website.Controllers;

import com.Varcons_Tec.Photography_Website.Services.Image_Service;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MultipartFile;

@RestControllerAdvice
public class Upload_Controller {

    @Autowired
    private Image_Service imageService;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
        try {
            String filePath = imageService.saveImage(file, false);
            return ResponseEntity.ok("File uploaded successfully: " + filePath);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("File upload failed");
        }
    }
}
