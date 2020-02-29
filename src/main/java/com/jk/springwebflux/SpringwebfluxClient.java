package com.jk.springwebflux;

import org.springframework.http.HttpMethod;
import org.springframework.web.reactive.function.client.WebClient;

public class SpringwebfluxClient {
	public static void main(String[] args) {
		WebClient client1 = WebClient.create("http://localhost:8080");

		WebClient.RequestBodySpec uri1 = client1.method(HttpMethod.GET).uri("/employees/");
	}
}
