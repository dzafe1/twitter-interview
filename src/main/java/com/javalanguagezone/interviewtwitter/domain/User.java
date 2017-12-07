package com.javalanguagezone.interviewtwitter.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.*;

import static java.util.Collections.singletonList;
import static javax.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PRIVATE;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = PRIVATE)
@Table(name = "app_user")
@ToString(exclude = {"following", "followers"})
@EqualsAndHashCode(exclude = {"following", "followers"})
public class User implements UserDetails {
  public static final List<SimpleGrantedAuthority> AUTHORITIES = singletonList(new SimpleGrantedAuthority("USER"));

  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;

  @Column(unique = true)
  private String username;

  @JsonIgnore
  @ManyToMany
  private Set<User> following = new HashSet<>();

  @JsonIgnore
  @ManyToMany(mappedBy = "following")
  private Set<User> followers = new HashSet<>();

  @JsonIgnore
  private String password;

  private String fName;

  private String lName;

  @OneToMany(mappedBy = "author")
  private List<Tweet> tweets;


  public User(String username, String fName, String lName, String password) {
    this.username = username;
    this.fName = fName;
    this.lName = lName;
    this.password = password;
  }
  /*****************GET AND SET**********************/

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Set<User> getFollowing() {
    return following;
  }

  public void setFollowing(Set<User> following) {
    this.following = following;
  }

  public Set<User> getFollowers() {
    return followers;
  }

  public void setFollowers(Set<User> followers) {
    this.followers = followers;
  }

  @Override
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getfName() {
    return fName;
  }

  public void setfName(String fName) {
    this.fName = fName;
  }
  public String getFullName(){
    return fName + " " + lName;
  }

  public String getlName() {
    return lName;
  }

  public void setlName(String lName) {
    this.lName = lName;
  }

  public List<Tweet> getTweets() {
    return tweets;
  }

  public void setTweets(List<Tweet> tweets) {
    this.tweets = tweets;
  }


  /*****************GET AND SET**********************/

  public void addFollowing(User... users){
    following.addAll(Arrays.asList(users));
  }

  @Override
  @JsonIgnore
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return AUTHORITIES;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      ", username='" + username + '\'' +
      ", password='" + password + '\'' +
      ", fName='" + fName + '\'' +
      ", lName='" + lName + '\'' +
      ", tweets=" + tweets.toString() +
      '}';
  }
}
