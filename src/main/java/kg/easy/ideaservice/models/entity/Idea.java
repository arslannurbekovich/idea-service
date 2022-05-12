package kg.easy.ideaservice.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ideas")
public class Idea {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String description;
    private boolean contactWithMe;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
