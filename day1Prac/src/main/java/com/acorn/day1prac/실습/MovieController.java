package com.acorn.day1prac.실습;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/movie")  // 모든 경로가 /movie로 시작함

public class MovieController {
    MovieForm m = new MovieForm();
    
    @RequestMapping(value = "/movieForm", method=RequestMethod.GET)
    public String setMovie() {
        return "movieForm";  // /movie/movieForm 으로 접근 가능
    }

    @RequestMapping(value = "/savemovie")
    public String saveMovie(Movie movie, Model model) {
        System.out.println(movie);
        m.list.add(movie);
        return "redirect:/movie/showMovie";
    }

    @RequestMapping(value="/showMovie", method=RequestMethod.GET)
    public String showMovie(Model model) {
        model.addAttribute("list", m.list);
        return "showMovie";
    }
}

