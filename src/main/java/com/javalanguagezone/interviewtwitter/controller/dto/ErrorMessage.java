package com.javalanguagezone.interviewtwitter.controller.dto;

import lombok.Value;

@Value
public class ErrorMessage {
  private String message;

  public ErrorMessage(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
