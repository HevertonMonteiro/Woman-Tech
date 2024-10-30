package br.com.Woman.tech.WomanTech.Model;

import jakarta.persistence.Entity;

@Entity
public class usuarioCursos {

    private  String nomeCurso;

    public Number getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(Number cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    private Number cpfUsuario;


}
