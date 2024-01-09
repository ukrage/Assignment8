package com.uk.mybatisdemo202401;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    private final MovieMapper movieMapper;

    public MovieController(MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }

    @GetMapping("/names")
    public List<Movie> findAll() {
        return movieMapper.findAll();
    }

    @GetMapping("/name")
    public List<Movie> findByNames(@RequestParam String movieName) {
        return movieMapper.findByNameContains(movieName);
    }

    
}
