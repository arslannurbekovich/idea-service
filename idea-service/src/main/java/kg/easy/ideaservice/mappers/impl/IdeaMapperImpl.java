package kg.easy.ideaservice.mappers.impl;

import kg.easy.ideaservice.mappers.IdeaMapper;
import kg.easy.ideaservice.mappers.UserMapper;
import kg.easy.ideaservice.models.dto.IdeaDto;
import kg.easy.ideaservice.models.entity.Idea;
import kg.easy.ideaservice.models.entity.User;

public class IdeaMapperImpl implements IdeaMapper {
    @Override
    public Idea ideaDtoToIdea(IdeaDto ideaDto) {

        Idea idea = new Idea();
        User user = UserMapper.INSTANCE.userDtoToUser(ideaDto.getUser());
        idea.setDescription(ideaDto.getDescription());
        idea.setContactWithMe(ideaDto.isContactWithMe());
        idea.setUser(user);
        if (ideaDto.getId()!=null){
            idea.setId(ideaDto.getId());
        }
        return idea;
    }

    @Override
    public IdeaDto ideaToIdeaDto(Idea idea) {
        IdeaDto ideaDto = new IdeaDto();
        ideaDto.setId(idea.getId());
        ideaDto.setDescription(idea.getDescription());
        ideaDto.setContactWithMe(idea.isContactWithMe());
        ideaDto.setUser(UserMapper.INSTANCE.userToUserDto(idea.getUser()));
        return ideaDto;
    }
}
