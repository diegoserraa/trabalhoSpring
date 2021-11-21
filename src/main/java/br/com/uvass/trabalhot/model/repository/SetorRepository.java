package br.com.uvass.trabalhot.model.repository;
import br.com.uvass.trabalhot.model.entity.Equipamento;
import br.com.uvass.trabalhot.model.entity.Setor;
import org.springframework.jdbc.core.JdbcTemplate;


import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;



public class SetorRepository {

    private JdbcTemplate jdbcTemplate;

    public SetorRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public Setor inserirSetor(Setor setor) throws Exception {
        String sql = "INSERT INTO setor (id, imagem_url, nome, descricao) VALUES (?,?,?,?)";
        int insert = jdbcTemplate.update(sql,
                setor.getId(),
                setor.getImagem_url(),
                setor.getNome(),
                setor.getDescricao()

        );


        if (insert == 1){
            return setor;
        } throw new Exception("Setor nao cadastrado");
    }
    public HashMap buscarPorIdd(int id)  {
        HashMap hashMap = new HashMap();
        Setor setor =  jdbcTemplate.queryForObject("SELECT * FROM setor WHERE id=?", new Object[]{id}, new SetorMapper());
        hashMap.put("Setor", setor);

        return hashMap;
    }

}

