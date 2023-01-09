package com.example.geragev2.repository;

public enum SQLQueries {
    SELECT_ALL_PERSONS_WITH_CARS("SELECT * FROM persons p INNER JOIN Cars c " +
            "ON p.id = c.person_id ORDER BY c.person_id;"),

    SELECT_ALL_PERSONS("SELECT * FROM persons;"),

    SELECT_PERSON_BY_ID("SELECT * FROM persons WHERE id = "),

    SAVE_PERSON("INSERT INTO persons (name, surname) VALUES (?, ?)"),

    DELETE_PERSON("DELETE FROM persons WHERE id = "),

    UPDATE_PERSON("UPDATE persons SET name = ?, surname = ? WHERE id = "),

    ADD_CAR_TO_PERSON("UPDATE cars SET person_id = ? WHERE car_id = ?"),

    SELECT_ALL_CARS("SELECT * FROM cars"),

    SAVE_CAR("INSERT INTO cars (number, brand, model, color) VALUES (?, ?, ?, ?)"),

    UPDATE_CAR("UPDATE cars SET number = ?, brand = ?, model = ?, color = ? WHERE car_id = "),

    DELETE_CAR("DELETE FROM cars WHERE car_id = ");

    public final String query;

    SQLQueries(String query) {
        this.query = query;
    }

    @Override
    public String toString() {
        return query;
    }
}
