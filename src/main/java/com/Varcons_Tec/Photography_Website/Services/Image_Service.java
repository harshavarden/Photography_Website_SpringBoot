package com.Varcons_Tec.Photography_Website.Services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class Image_Service {

    private final String userUploadsDir = "src/main/resources/static/images/user_uploads/";
    private final String galleryDir = "src/main/resources/static/images/gallery/";

    public String saveImage(MultipartFile file, boolean isGallery) throws IOException {
        String directory = isGallery ? galleryDir : userUploadsDir;
        String filePath = directory + file.getOriginalFilename();
        Files.copy(file.getInputStream(), Paths.get(filePath), StandardCopyOption.REPLACE_EXISTING);
        //this is the utility () from Files class to copy the file. it takes i/p stream, dest path and copy policy
        return filePath;
    }

    public List<String> getGalleryImages() {
        File galleryFolder = new File(galleryDir);
        String[] files = galleryFolder.list();
        return files != null ? Arrays.asList(files) : new ArrayList<>();
    }
}
