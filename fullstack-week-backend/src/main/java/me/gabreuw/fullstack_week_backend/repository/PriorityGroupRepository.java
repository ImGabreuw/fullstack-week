package me.gabreuw.fullstack_week_backend.repository;

import me.gabreuw.fullstack_week_backend.domain.PriorityGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriorityGroupRepository extends JpaRepository<PriorityGroup, Long> {}