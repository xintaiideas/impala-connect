package com.data.services;

import com.data.mapper.impala.ImpalaMapper;
import com.data.model.Person;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class ImpalaService {

    @Resource
    private ImpalaMapper impalaMapper;

    public void executeSql(Person person) {
        try {
            impalaMapper.executeSql(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Person> selectSql() {
        List<Person> list =  impalaMapper.selectSql();
        return list;
    }
    public List<Person> selectSqlByPage() {
        List<Person> list =  impalaMapper.selectSqlByPage();
        return list;
    }
    public void updatetSql(Person person) {
          impalaMapper.updateSql(person);

    }
    public void deleteSql(Person person) {
         impalaMapper.deleteSql(person);

    }
}

