package com.Varcons_Tec.Photography_Website.Controllers;

import java.io.IOException;
import com.Varcons_Tec.Photography_Website.Services.Image_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import org.springframework.ui.Model;

@Controller
public class Admin_Controller {

    @Autowired
    private Image_Service imageService;

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    @PostMapping("/admin/upload")
    public String uploadToGallery(@RequestParam("file") MultipartFile file, Model model) {
        try {
            imageService.saveImage(file, true);
            model.addAttribute("message", "Image uploaded to gallery successfully!");
        } catch (IOException e) {
            model.addAttribute("error", "Failed to upload image.");
        }
        return "admin";
    }
}
