package br.com.Woman.tech.WomanTech.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // ou GenerationType.AUTO
    private int id; // Chave primária
    private  String nome;
    private  String email;
    private  String senha;
    private  String AreadeAtuacao;
    private  String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAreadeAtuacao() {
        return AreadeAtuacao;
    }

    public void setAreadeAtuacao(String areadeAtuacao) {
        AreadeAtuacao = areadeAtuacao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
