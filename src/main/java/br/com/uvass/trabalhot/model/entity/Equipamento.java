package br.com.uvass.trabalhot.model.entity;

public class Equipamento {

    private int id;
    private String nome;
    private String descricao;
    private String foto_url;
    private String data_cadastro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto_url() {
        return foto_url;
    }

    public void setFoto_url(String foto_url) {
        this.foto_url = foto_url;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public String getData_ultima_manutencao() {
        return data_ultima_manutencao;
    }

    public void setData_ultima_manutencao(String data_ultima_manutencao) {
        this.data_ultima_manutencao = data_ultima_manutencao;
    }

    private String data_ultima_manutencao;



}
