package me.gabreuw.fullstack_week_backend.repository;

import me.gabreuw.fullstack_week_backend.domain.PriorityGroups;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriorityGroupsRepository extends JpaRepository<PriorityGroups, Long> {}