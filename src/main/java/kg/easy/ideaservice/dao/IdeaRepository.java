package kg.easy.ideaservice.dao;

import kg.easy.ideaservice.models.entity.Idea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdeaRepository extends JpaRepository<Idea,Long> {
}
