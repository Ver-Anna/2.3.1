package hiber.service;

import hiber.models.Person;

import java.util.List;

public interface PersonService {
    List<Person> index();
    Person show(int id);
    void save(Person person);
    void update(Person updatePerson);
    void delete(int id);
}
