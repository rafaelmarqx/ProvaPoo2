package com.prova;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Veterinario {

    private Integer id;
    private String nome;
    private String endereco;
    private String telefone;

    private List<Consulta> consults = new LinkedList<>();

    public List<Consulta> getConsults() {
        return consults;
    }

    public void setConsults(List<Consulta> consults) {
        this.consults = consults;
    }

    public Veterinario() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Veterinario(Integer id, String nome, String endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veterinario that = (Veterinario) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(endereco, that.endereco) && Objects.equals(telefone, that.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, endereco, telefone);
    }
}

