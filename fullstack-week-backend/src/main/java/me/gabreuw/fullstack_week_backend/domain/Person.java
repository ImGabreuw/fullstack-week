package me.gabreuw.fullstack_week_backend.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(of = "id")
@Entity
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String name;
    private String cpf;
    private String telephone;
    private String email;
    private String birthDate;

    private Integer age;

    private Boolean vaccinated;

    @ManyToOne
    @JoinColumn(name = "id_priority_group")
    private PriorityGroup group;

}
