package kg.easy.ideaservice.mappers;

import kg.easy.ideaservice.mappers.impl.IdeaMapperImpl;
import kg.easy.ideaservice.models.dto.IdeaDto;
import kg.easy.ideaservice.models.entity.Idea;


public interface IdeaMapper {
    IdeaMapper INSTANCE =new IdeaMapperImpl();
    Idea ideaDtoToIdea(IdeaDto ideaDto);

    IdeaDto ideaToIdeaDto(Idea idea);
}
