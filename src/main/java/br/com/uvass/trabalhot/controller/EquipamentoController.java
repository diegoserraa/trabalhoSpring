package br.com.uvass.trabalhot.controller;
import br.com.uvass.trabalhot.model.entity.Equipamento;
import br.com.uvass.trabalhot.model.repository.EquipamentoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.HashMap;

@RestController
@RequestMapping("/equipamento")
public class EquipamentoController {

    private EquipamentoRepository equipamentoRepository;

    public EquipamentoController(JdbcTemplate jdbcTemplate){
        equipamentoRepository = new EquipamentoRepository(jdbcTemplate);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Equipamento inserir(@RequestBody Equipamento equipamento) throws Exception {
        return equipamentoRepository.inserir(equipamento);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public HashMap buscarPorId(@PathVariable int id){
        return equipamentoRepository.buscarPorId(id);
    }


}