package jp.co.nagura.sample.catalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jp.co.nagura.sample.catalog.mappers.PersonMapper;
import jp.co.nagura.sample.catalog.mappers.beans.Person;

public class PersonService {

    @Autowired
    PersonMapper personMapper;

    public List<Person> getLists() {
        return personMapper.selectAll();
    }

}