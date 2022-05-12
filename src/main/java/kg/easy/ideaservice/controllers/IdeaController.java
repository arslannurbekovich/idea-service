package kg.easy.ideaservice.controllers;


import kg.easy.ideaservice.models.dto.IdeaDto;
import kg.easy.ideaservice.services.IdeaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/idea")
public class IdeaController {

    private IdeaService ideaService;

    public IdeaController(IdeaService ideaService){
        this.ideaService=ideaService;
    }

    @PostMapping("/save")
    public IdeaDto saveIdea(@RequestBody IdeaDto ideaDto){
        return ideaService.save(ideaDto);
    }
}
