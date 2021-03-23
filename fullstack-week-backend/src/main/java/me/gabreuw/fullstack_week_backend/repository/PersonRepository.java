package me.gabreuw.fullstack_week_backend.repository;

import me.gabreuw.fullstack_week_backend.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}