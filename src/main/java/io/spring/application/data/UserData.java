package io.spring.application.data;

import java.util.Objects;


public class UserData {
    private String id;
    private String email;
    private String username;
    private String bio;
    private String image;

    public UserData() {
    }

    public UserData(String id, String email, String username, String bio, String image) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.bio = bio;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserData userData = (UserData) o;
        return Objects.equals(id, userData.id) &&
                Objects.equals(email, userData.email) &&
                Objects.equals(username, userData.username) &&
                Objects.equals(bio, userData.bio) &&
                Objects.equals(image, userData.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, username, bio, image);
    }

    @Override
    public String toString() {
        return "UserData{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", bio='" + bio + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
