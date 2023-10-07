package com.prova;

import java.util.Objects;

public class Consulta {
    private Integer id;
    private String localdate;
    private String descricaoexame;
    private String historico;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocaldate() {
        return localdate;
    }

    public void setLocaldate(String localdate) {
        this.localdate = localdate;
    }

    public String getDescricaoexame() {
        return descricaoexame;
    }

    public void setDescricaoexame(String descricaoexame) {
        this.descricaoexame = descricaoexame;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public Consulta() {
    }

    public Consulta(Integer id, String localdate, String descricaoexame, String historico) {
        this.id = id;
        this.localdate = localdate;
        this.descricaoexame = descricaoexame;
        this.historico = historico;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "id=" + id +
                ", localdate='" + localdate + '\'' +
                ", descricaoexame='" + descricaoexame + '\'' +
                ", historico='" + historico + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consulta consulta = (Consulta) o;
        return Objects.equals(id, consulta.id) && Objects.equals(localdate, consulta.localdate) && Objects.equals(descricaoexame, consulta.descricaoexame) && Objects.equals(historico, consulta.historico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, localdate, descricaoexame, historico);
    }
}
