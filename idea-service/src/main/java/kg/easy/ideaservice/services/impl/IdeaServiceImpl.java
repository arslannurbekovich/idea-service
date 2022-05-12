package kg.easy.ideaservice.services.impl;

import kg.easy.ideaservice.dao.IdeaRepository;
import kg.easy.ideaservice.mappers.IdeaMapper;
import kg.easy.ideaservice.models.dto.IdeaDto;
import kg.easy.ideaservice.models.entity.Idea;
import kg.easy.ideaservice.services.IdeaService;
import org.springframework.stereotype.Service;

@Service
public class IdeaServiceImpl implements IdeaService {

    private IdeaRepository ideaRepository;

    public IdeaServiceImpl(IdeaRepository ideaRepository){
        this.ideaRepository = ideaRepository;
    }

    @Override
    public IdeaDto save(IdeaDto ideaDto) {
        Idea idea = IdeaMapper.INSTANCE.ideaDtoToIdea(ideaDto);
        idea = ideaRepository.save(idea);
        return IdeaMapper.INSTANCE.ideaToIdeaDto(idea);
    }
}
