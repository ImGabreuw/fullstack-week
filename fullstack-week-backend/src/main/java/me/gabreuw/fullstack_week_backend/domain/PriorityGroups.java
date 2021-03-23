package me.gabreuw.fullstack_week_backend.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(of = "id")
@Entity
public class PriorityGroups implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String name;
    private String description;

}
