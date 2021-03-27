package me.gabreuw.fullstack_week_backend.service;

import me.gabreuw.fullstack_week_backend.domain.Person;
import me.gabreuw.fullstack_week_backend.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public List<Person> findAll() {
        return repository.findAll();
    }

    public Person findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Entity not found. Id: " + id));
    }

    public Person save(Person person) {
        return repository.save(person);
    }

    public Person update(Long id, Person person) {
        Person updatedPerson = updateData(id, person);

        return repository.save(updatedPerson);
    }

    public Person updateData(Long oldPersonId, Person newPerson) {
        Person person = findById(oldPersonId);

        person.setName(newPerson.getName());
        person.setCpf(newPerson.getCpf());
        person.setTelephone(newPerson.getTelephone());
        person.setTelephone(newPerson.getTelephone());
        person.setEmail(newPerson.getEmail());
        person.setAge(newPerson.getAge());
        person.setBirthDate(newPerson.getBirthDate());

        return person;
    }

}
