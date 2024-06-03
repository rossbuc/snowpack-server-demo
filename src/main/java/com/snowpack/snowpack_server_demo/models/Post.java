package com.snowpack.snowpack_server_demo.models;

import jakarta.persistence.*;
import jdk.javadoc.doclet.Taglet;

import java.awt.*;

public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="location")
    private Taglet.Location location;
    @Column(name="description")
    private TextArea description;
    @Column(name="elevation")
    private int elevation;
    @Column(name="aspect")
    private Aspect aspect;
    @Column(name="temperature")
    private int temperature;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Post(Taglet.Location location, TextArea description, int elevation, Aspect aspect, int temperature, User user) {
        this.location = location;
        this.description = description;
        this.elevation = elevation;
        this.aspect = aspect;
        this.temperature = temperature;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Taglet.Location getLocation() {
        return location;
    }

    public void setLocation(Taglet.Location location) {
        this.location = location;
    }

    public TextArea getDescription() {
        return description;
    }

    public void setDescription(TextArea description) {
        this.description = description;
    }

    public int getElevation() {
        return elevation;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

    public Aspect getAspect() {
        return aspect;
    }

    public void setAspect(Aspect aspect) {
        this.aspect = aspect;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
