package br.com.fiap.roardemo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "roar")
public class Roar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    private int likes;

    private String username;

    public Roar() {}

    public Roar(String content, String username) {
        this.content = content;
        this.likes = 0;
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public int getLikes() {
        return likes;
    }

    public String getUsername() {
        return username;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
