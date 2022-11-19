package jp.co.nagura.sample.catalog.mappers;

import java.util.List;

import jp.co.nagura.sample.catalog.mappers.beans.Person;

public interface PersonMapper {

    public List<Person> selectAll();
}
