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
        Person personMapper = mapper(findById(id), person);

        return repository.save(personMapper);
    }

    public Person mapper(Person oldDate, Person updatedDate) {
        oldDate.setName(updatedDate.getName());
        oldDate.setCpf(updatedDate.getCpf());
        oldDate.setTelephone(updatedDate.getTelephone());
        oldDate.setTelephone(updatedDate.getTelephone());
        oldDate.setEmail(updatedDate.getEmail());
        oldDate.setAge(updatedDate.getAge());
        oldDate.setBirthDate(updatedDate.getBirthDate());

        return oldDate;
    }

}
