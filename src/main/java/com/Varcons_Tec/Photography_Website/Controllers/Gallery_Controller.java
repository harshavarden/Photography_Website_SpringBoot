package com.Varcons_Tec.Photography_Website.Controllers;

import java.util.List;
import com.Varcons_Tec.Photography_Website.Services.Image_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;

@Controller
public class Gallery_Controller {

    @Autowired
    private Image_Service imageService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/gallery")
    public String gallery(Model model) {
        List<String> images = imageService.getGalleryImages();
        model.addAttribute("images", images);
        return "gallery";
    }
}
