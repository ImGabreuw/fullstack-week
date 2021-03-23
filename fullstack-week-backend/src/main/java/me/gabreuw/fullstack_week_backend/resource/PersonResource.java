package me.gabreuw.fullstack_week_backend.resource;

import me.gabreuw.fullstack_week_backend.domain.Person;
import me.gabreuw.fullstack_week_backend.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/people")
public class PersonResource {

    @Autowired
    private PersonService service;

    @GetMapping
    public ResponseEntity<List<Person>> findAll() {
        List<Person> people = service.findAll();

        return ResponseEntity
                .ok()
                .body(people);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Person> findById(
            @PathVariable Long id
    ) {
        Person person = service.findById(id);

        return ResponseEntity
                .ok()
                .body(person);
    }

    @PostMapping
    public ResponseEntity<Person> save(
            @RequestBody Person person
    ) {
        Person entity = service.save(person);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(entity);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Person> update(
            @PathVariable Long id,
            @RequestBody Person person
    ) {
        Person updatedPerson = service.update(id, person);

        return ResponseEntity
                .ok()
                .body(updatedPerson);
    }

}
