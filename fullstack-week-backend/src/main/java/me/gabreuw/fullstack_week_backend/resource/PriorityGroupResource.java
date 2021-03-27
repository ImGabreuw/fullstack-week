package me.gabreuw.fullstack_week_backend.resource;

import me.gabreuw.fullstack_week_backend.domain.PriorityGroup;
import me.gabreuw.fullstack_week_backend.service.PriorityGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "priority-groups")
public class PriorityGroupResource {

    @Autowired
    private PriorityGroupService service;

    @GetMapping
    public List<PriorityGroup> findAll(){
        return service.findAll();
    }

    @GetMapping("/{codigo}")
    public PriorityGroup findById(@PathVariable Long id) {
        return service.findById(id);
    }

}
