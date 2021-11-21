package br.com.uvass.trabalhot.model.repository;
import br.com.uvass.trabalhot.model.entity.Equipamento;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EquipamentoMapper implements RowMapper<Equipamento> {
    @Override
    public Equipamento mapRow(ResultSet result, int i) throws SQLException {
        Equipamento equipamento = new Equipamento();
        equipamento.setId(result.getInt("id"));
        equipamento.setNome(result.getString("nome"));
        equipamento.setDescricao(result.getString("descricao"));
        equipamento.setFoto_url(result.getString("foto_url"));
        equipamento.setData_cadastro(result.getString("data_cadastro"));
        equipamento.setData_ultima_manutencao(result.getString("data_ultima_manutencao"));
        return equipamento;
    }
}