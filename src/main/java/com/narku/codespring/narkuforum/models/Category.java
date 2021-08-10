package com.narku.codespring.narkuforum.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Categories")
public class Category {
    @Id
    String id;
    String name;
    int posts;
    int topics;
    String lastUpdated;
    String owner;

    public Category(){}

    public Category(String id, String name, int posts, int topics, String lastUpdated, String owner) {
        this.id = id;
        this.name = name;
        this.posts = posts;
        this.topics = topics;
        this.lastUpdated = lastUpdated;
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosts() {
        return posts;
    }

    public void setPosts(int posts) {
        this.posts = posts;
    }

    public int getTopics() {
        return topics;
    }

    public void setTopics(int topics) {
        this.topics = topics;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
