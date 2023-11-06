package ru.yandex.practicum.filmorate.model;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

@Data
@Builder
public class Film {
    public static final Comparator<Film> COMPARE_BY_LIKES = new Comparator<Film>() {
        @Override
        public int compare(Film o1, Film o2) {
            return o1.getLikes().size() - o2.getLikes().size();
        }
    };
    @NotBlank(message = "Название не должно быть пустым")
    private final String name;
    @Size(max = 200, message = "Максимальная длина описания 200 символов.")
    private final String description;
    private final LocalDate releaseDate;
    @PositiveOrZero(message = "Продолжительность фильма не может быть отрицательной")
    private final int duration;
    private final MpaRating mpa;
    private int id;
    private List<Genre> genres;
    private Set<Integer> likes;
}
