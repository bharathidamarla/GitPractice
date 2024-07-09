package com.Git.Demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Response {
	@JsonProperty("StatusCode")
	private Integer statusCode;
	@JsonProperty("isError")
	private Object isError;
	@JsonProperty("Result")
	private Object result;
}
