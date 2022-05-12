package kg.easy.ideaservice.models.dto;

import lombok.Data;

@Data
public class IdeaDto {
    private Long id;
    private String description;
    private boolean contactWithMe;
    private UserDto user;
}
