package com.javalanguagezone.interviewtwitter.service.dto;

public class UserInfoDTO {
  //number of tweets, number of followers, number of users following
  private long numberOfTweets;
  private long numberOfFollowers;
  private long numberOfUsersFollowing;

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

  public long getNumberOfTweets() {
    return numberOfTweets;
  }

  public void setNumberOfTweets(long numberOfTweets) {
    this.numberOfTweets = numberOfTweets;
  }

  public long getNumberOfFollowers() {
    return numberOfFollowers;
  }

  public void setNumberOfFollowers(long numberOfFollowers) {
    this.numberOfFollowers = numberOfFollowers;
  }

  public long getNumberOfUsersFollowing() {
    return numberOfUsersFollowing;
  }

  public void setNumberOfUsersFollowing(Long numberOfUsersFollowing) {
    this.numberOfUsersFollowing = numberOfUsersFollowing;
  }
}
