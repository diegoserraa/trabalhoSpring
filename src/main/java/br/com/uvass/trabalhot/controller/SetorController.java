package br.com.uvass.trabalhot.controller;
import br.com.uvass.trabalhot.model.entity.Setor;
import br.com.uvass.trabalhot.model.repository.SetorRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.HashMap;

@RestController
@RequestMapping("/setor")
public class SetorController {

    private SetorRepository setorRepository;

    public SetorController(JdbcTemplate jdbcTemplate){
        setorRepository = new SetorRepository(jdbcTemplate);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Setor inserirSetor(@RequestBody Setor setor) throws Exception {
        return setorRepository.inserirSetor(setor);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public HashMap buscarPorIdd(@PathVariable int id){
        return setorRepository.buscarPorIdd(id);
    }

}
