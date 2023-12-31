package ru.yandex.practicum.filmorate.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.filmorate.model.Film;
import ru.yandex.practicum.filmorate.service.FilmService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/films")
@Slf4j
public class FilmController {

    private final FilmService filmService;

    @Autowired
    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @PostMapping
    public Film addFilm(@Valid @RequestBody Film film) {
        return filmService.addFilm(film);
    }

    @PutMapping
    public Film updateFilm(@Valid @RequestBody Film film) {
        return filmService.updateFilm(film);
    }

    @GetMapping
    public List<Film> getFilms() {
        return filmService.getFilms();
    }

    @GetMapping("/{id}")
    public Film getFilmById(@PathVariable int id) {
        return filmService.getFilmById(id);
    }

    @PutMapping("/{id}/like/{userID}")
    public void addLike(@PathVariable int id, @PathVariable int userID) {
        filmService.addLike(userID, id);
    }

    @DeleteMapping("/{id}/like/{userID}")
    public void deleteLike(@PathVariable int id, @PathVariable int userID) {
        filmService.deleteLike(userID, id);
    }

    @GetMapping("/popular")
    public List<Film> getTopRatedFilms(@RequestParam(value = "count", defaultValue = "10", required = false) Integer count) {
        return filmService.getTopRatedFilms(count);
    }
}
