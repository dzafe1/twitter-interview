package com.javalanguagezone.interviewtwitter.service.dto;

public class UserInfoDTO {
  //number of tweets, number of followers, number of users following
  private int numberOfTweets;
  private int numberOfFollowers;
  private int numberOfUsersFollowing;

  public UserInfoDTO() {
  }

  public UserInfoDTO(int numberOfTweets) {
    this.numberOfTweets = numberOfTweets;
  }

  public UserInfoDTO(int numberOfTweets, int numberOfFollowers, int numberOfUsersFollowing) {
    this.numberOfTweets = numberOfTweets;
    this.numberOfFollowers = numberOfFollowers;
    this.numberOfUsersFollowing = numberOfUsersFollowing;
  }

  public int getNumberOfTweets() {
    return numberOfTweets;
  }

  public void setNumberOfTweets(int numberOfTweets) {
    this.numberOfTweets = numberOfTweets;
  }

  public int getNumberOfFollowers() {
    return numberOfFollowers;
  }

  public void setNumberOfFollowers(int numberOfFollowers) {
    this.numberOfFollowers = numberOfFollowers;
  }

  public int getNumberOfUsersFollowing() {
    return numberOfUsersFollowing;
  }

  public void setNumberOfUsersFollowing(int numberOfUsersFollowing) {
    this.numberOfUsersFollowing = numberOfUsersFollowing;
  }
}
