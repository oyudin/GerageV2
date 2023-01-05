package com.example.geragev2.repository.mapper;

import com.example.geragev2.model.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet rows, int rowNum) throws SQLException {
        return Person.builder()
                .id(rows.getInt("id"))
                .name(rows.getString("name"))
                .surname(rows.getString("surname"))
                .build();
    }
//    @Override
//    public Person mapRow(ResultSet rows, int rowNum) throws SQLException {
//        return new Person(rows.getInt("id"),
//                rows.getString("name"),
//                rows.getString("surname"));
//    }
}
