package io.spring.core.user;

import java.util.Objects;
import java.util.UUID;

public class User {
    private String id;
    private String email;
    private String username;
    private String password;
    private String bio;
    private String image;

    public User() {
    }

    public User(String email, String username, String password, String bio, String image) {
        this.id = UUID.randomUUID().toString();
        this.email = email;
        this.username = username;
        this.password = password;
        this.bio = bio;
        this.image = image;
    }

    public void update(String email, String username, String password, String bio, String image) {
        if (!"".equals(email)) {
            this.email = email;
        }

        if (!"".equals(username)) {
            this.username = username;
        }

        if (!"".equals(password)) {
            this.password = password;
        }

        if (!"".equals(bio)) {
            this.bio = bio;
        }

        if (!"".equals(image)) {
            this.image = image;
        }
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getBio() {
        return bio;
    }

    public String getImage() {
        return image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
