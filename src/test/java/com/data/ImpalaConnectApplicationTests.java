package com.data;

import com.data.model.Person;
import com.data.services.ImpalaService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class ImpalaConnectApplicationTests {
    @Resource
    private ImpalaService impalaService;
    @Test
    void contextLoads() {
        Person person = new Person();
        person.setId(10);
        person.setName("张四");
        impalaService.executeSql(person);
    }


    @Test
    void selectSql() {

        List<Person>  list= impalaService.selectSql();
        System.out.println(list);
    }

    @Test
    void selectSqlByPage() {

        List<Person>  list= impalaService.selectSqlByPage();
        System.out.println(list);
    }

    @Test
    void updateSql() {
        Person person = new Person();
        person.setId(2);
        person.setName("是");
        impalaService.updatetSql(person);
    }
    @Test
    void deleteSql() {
        Person person = new Person();
        person.setId(2);
        impalaService.deleteSql(person);
    }
}
