package com.javalanguagezone.interviewtwitter.service.dto;

public class UserInfoDTO {
  //number of tweets, number of followers, number of users following
  private Long numberOfTweets;
  private Long numberOfFollowers;
  private Long numberOfUsersFollowing;

  public UserInfoDTO() {
  }

  public UserInfoDTO(Long numberOfTweets) {
    this.numberOfTweets = numberOfTweets;
  }

  public UserInfoDTO(long numberOfTweets, long numberOfFollowers, long numberOfUsersFollowing) {
    this.numberOfTweets = numberOfTweets;
    this.numberOfFollowers = numberOfFollowers;
    this.numberOfUsersFollowing = numberOfUsersFollowing;
  }

  public Long getNumberOfTweets() {
    return numberOfTweets;
  }

  public void setNumberOfTweets(Long numberOfTweets) {
    this.numberOfTweets = numberOfTweets;
  }

  public Long getNumberOfFollowers() {
    return numberOfFollowers;
  }

  public void setNumberOfFollowers(Long numberOfFollowers) {
    this.numberOfFollowers = numberOfFollowers;
  }

  public Long getNumberOfUsersFollowing() {
    return numberOfUsersFollowing;
  }

  public void setNumberOfUsersFollowing(Long numberOfUsersFollowing) {
    this.numberOfUsersFollowing = numberOfUsersFollowing;
  }
}
