package com.example.TastyKing.service;

import com.example.TastyKing.model.Slide;
import com.example.TastyKing.repository.SlideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SlideService {

    @Autowired
    private SlideRepository slideRepository;

    public List<Slide> getAllSlides() {
        return slideRepository.findAll();
    }

    public Optional<Slide> getSlideById(Long id) {
        return slideRepository.findById(id);
    }

    public Slide saveSlide(Slide slide) {
        return slideRepository.save(slide);
    }

    public void deleteSlide(Long id) {
        slideRepository.deleteById(id);
    }
}
