package hiber.dao;

import hiber.models.Person;

import java.util.List;

public interface PersonDAO {
    List<Person> index();
    Person show(int id);
    void save(Person person);
    void update(Person updatePerson);
    void delete(int id);
}
