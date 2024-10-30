package br.com.Woman.tech.WomanTech.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ou GenerationType.AUTO
    private Long id; // Chave primária
    private  String nome;
    private  String email;
    private  String senha;
    private  String AreadeAtuacao;
    private  Number cpf;

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

    public Number getCpf() {
        return cpf;
    }

    public void setCpf(Number cpf) {
        this.cpf = cpf;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
