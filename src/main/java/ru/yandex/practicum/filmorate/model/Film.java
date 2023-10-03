package ru.yandex.practicum.filmorate.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class Film {
    private final int id;
    @NotBlank
    private String name;
    @Size(max = 200)
    private String description;
    private final LocalDate releaseDate;
    @PositiveOrZero
    private int duration;
}
