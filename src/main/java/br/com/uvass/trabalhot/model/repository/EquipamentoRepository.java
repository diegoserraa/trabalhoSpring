package br.com.uvass.trabalhot.model.repository;
import br.com.uvass.trabalhot.model.entity.Setor;
import br.com.uvass.trabalhot.model.entity.Equipamento;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;


public class EquipamentoRepository {

    private JdbcTemplate jdbcTemplate;

    public EquipamentoRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }


    public Equipamento inserir(Equipamento equipamento) throws Exception {
        String sql = "INSERT INTO equipamento(id, nome, descricao, foto_url, data_cadastro, data_ultima_manutencao) VALUES (?,?,?,?,?,?)";
        int insert = jdbcTemplate.update(sql,
                equipamento.getId(),
                equipamento.getNome(),
                equipamento.getDescricao(),
                equipamento.getFoto_url(),
                equipamento.getData_cadastro(),
                equipamento.getData_ultima_manutencao()
        );

        if (insert == 1){
            return equipamento;
        } throw new Exception("Equipamento nao cadastrado");
    }

    public HashMap buscarPorId(int id)  {
        HashMap hashMap = new HashMap();
        Equipamento equipamento =  jdbcTemplate.queryForObject("SELECT * FROM equipamento WHERE id=?", new Object[]{id}, new EquipamentoMapper());
        hashMap.put("Equipamento", equipamento);
        List<Setor> setor = jdbcTemplate.query("SELECT c.* FROM setor c JOIN equipamento_setor e ON e.setor_id = c.id JOIN equipamento p ON p.id = e.equipamento_id WHERE p.id = ?", new Object[]{id}, new SetorMapper());
        hashMap.put("Setor", setor);
        return hashMap;
    }


}
