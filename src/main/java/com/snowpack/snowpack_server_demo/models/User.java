package com.snowpack.snowpack_server_demo.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="users")
public class User {

    @Column(name="Username")
    private String userName;

    @Column(name="password")
    private String passsword;

    @Column(name="email")
    private String email;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Post> posts;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    public User(String userName, String passsword, String email, List<Post> posts) {
        this.userName = userName;
        this.passsword = passsword;
        this.email = email;
        this.posts = posts;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
