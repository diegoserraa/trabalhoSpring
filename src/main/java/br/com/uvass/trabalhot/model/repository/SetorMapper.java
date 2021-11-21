package br.com.uvass.trabalhot.model.repository;
import br.com.uvass.trabalhot.model.entity.Setor;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SetorMapper implements RowMapper<Setor> {
    @Override
    public Setor mapRow(ResultSet result, int i) throws SQLException {
        Setor setor = new Setor();
        setor.setId(result.getInt("id"));
        setor.setImagem_url(result.getString("imagem_url"));
        setor.setNome(result.getString("nome"));
        setor.setDescricao(result.getString("descricao"));
        return setor;
    }
}


