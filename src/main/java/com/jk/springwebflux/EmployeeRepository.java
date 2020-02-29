package com.jk.springwebflux;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import org.springframework.stereotype.Component;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class EmployeeRepository {
	private Map<Integer, Employee> employees = new HashMap<>();

	public EmployeeRepository() {
		IntStream.range(0, 20).forEach(n -> employees.put(n, new Employee(n, "Jitendra-" + n)));
	}

	public Mono<Employee> findById(int id) {
		return Mono.just(employees.get(id));
	}

	public Flux<Employee> getAll() {
		//return Flux.fromIterable(employees.values()).delayElements(Duration.ofSeconds(2));
		return Flux.fromIterable(employees.values());
	}

}
