package me.gabreuw.fullstack_week_backend.service;

import me.gabreuw.fullstack_week_backend.domain.PriorityGroup;
import me.gabreuw.fullstack_week_backend.repository.PriorityGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriorityGroupService {

    @Autowired
    private PriorityGroupRepository repository;

    public List<PriorityGroup> findAll() {
        return repository.findAll();
    }

    public PriorityGroup findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Entity not found. Id: " + id));
    }

}
