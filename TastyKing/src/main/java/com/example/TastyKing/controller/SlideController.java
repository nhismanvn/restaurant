package com.example.TastyKing.controller;

import com.example.TastyKing.model.Slide;
import com.example.TastyKing.service.SlideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/slides")
public class SlideController {

    @Autowired
    private SlideService slideService;

    @GetMapping
    public String listSlides(Model model) {
        model.addAttribute("slides", slideService.getAllSlides());
        return "admin/slide_list";
    }

    @GetMapping("/add")
    public String addSlideForm(Model model) {
        model.addAttribute("slide", new Slide());
        return "admin/slide_form";
    }

    @PostMapping("/add")
    public String addSlide(@ModelAttribute Slide slide) {
        slideService.saveSlide(slide);
        return "redirect:/admin/slides";
    }

    @GetMapping("/edit/{id}")
    public String editSlideForm(@PathVariable Long id, Model model) {
        Slide slide = slideService.getSlideById(id).orElseThrow(() -> new IllegalArgumentException("Invalid slide Id:" + id));
        model.addAttribute("slide", slide);
        return "admin/slide_form";
    }

    @PostMapping("/edit/{id}")
    public String editSlide(@PathVariable Long id, @ModelAttribute Slide slide) {
        slide.setId(id);
        slideService.saveSlide(slide);
        return "redirect:/admin/slides";
    }

    @GetMapping("/delete/{id}")
    public String deleteSlide(@PathVariable Long id) {
        slideService.deleteSlide(id);
        return "redirect:/admin/slides";
    }
}
