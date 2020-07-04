package com.data.mapper.impala;

import com.data.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImpalaMapper {
    void executeSql(Person person);

    List<Person>  selectSql();

    List<Person>  selectSqlByPage();

    void updateSql(Person person);

    void deleteSql(Person person);
}