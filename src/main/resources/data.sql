MERGE INTO mpa_rating
    USING (SELECT CAST('G' AS varchar)) AS g (name)
    ON (mpa_rating.name = g.name)
    WHEN NOT MATCHED THEN
        INSERT (name)
            VALUES ('G');

MERGE INTO mpa_rating
    USING (SELECT CAST('PG' AS varchar)) AS pg (name)
    ON (mpa_rating.name = pg.name)
    WHEN NOT MATCHED THEN
        INSERT (name)
            VALUES ('PG');

MERGE INTO mpa_rating
    USING (SELECT CAST('PG-13' AS varchar)) AS pg13 (name)
    ON (mpa_rating.name = pg13.name)
    WHEN NOT MATCHED THEN
        INSERT (name)
            VALUES ('PG-13');

MERGE INTO mpa_rating
    USING (SELECT CAST('R' AS varchar)) AS r (name)
    ON (mpa_rating.name = r.name)
    WHEN NOT MATCHED THEN
        INSERT (name)
            VALUES ('R');

MERGE INTO mpa_rating
    USING (SELECT CAST('NC-17' AS varchar)) AS nc17 (name)
    ON (mpa_rating.name = nc17.name)
    WHEN NOT MATCHED THEN
        INSERT (name)
            VALUES ('NC-17');

MERGE INTO genre
    USING (SELECT CAST('Comedy' AS varchar)) AS c (name)
    ON (genre.name = c.name)
    WHEN NOT MATCHED THEN
        INSERT (name)
            VALUES ('Comedy');

MERGE INTO genre
    USING (SELECT CAST('Drama' AS varchar)) AS d (name)
    ON (genre.name = d.name)
    WHEN NOT MATCHED THEN
        INSERT (name)
            VALUES ('Drama');

MERGE INTO genre
    USING (SELECT CAST('Cartoon' AS varchar)) AS h (name)
    ON (genre.name = h.name)
    WHEN NOT MATCHED THEN
        INSERT (name)
            VALUES ('Cartoon');

MERGE INTO genre
    USING (SELECT CAST('Triller' AS varchar)) AS a (name)
    ON (genre.name = a.name)
    WHEN NOT MATCHED THEN
        INSERT (name)
            VALUES ('Triller');

MERGE INTO genre
    USING (SELECT CAST('Documentary' AS varchar)) AS t (name)
    ON (genre.name = t.name)
    WHEN NOT MATCHED THEN
        INSERT (name)
            VALUES ('Documentary');

MERGE INTO genre
    USING (SELECT CAST('Action' AS varchar)) AS t (name)
    ON (genre.name = t.name)
    WHEN NOT MATCHED THEN
        INSERT (name)
            VALUES ('Action');