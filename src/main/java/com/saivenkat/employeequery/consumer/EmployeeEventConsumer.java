package com.saivenkat.employeequery.consumer;

import com.saivenkat.employeequery.events.EmployeeCreatedEvent;
import com.saivenkat.employeequery.model.EmployeeView;
import com.saivenkat.employeequery.repo.EmployeeViewRepository;

import org.springframework.stereotype.Component;

import java.time.Instant;

import org.springframework.kafka.annotation.KafkaListener;

@Component
public class EmployeeEventConsumer {

    private final EmployeeViewRepository repo;

    public EmployeeEventConsumer(EmployeeViewRepository repo) {
        this.repo = repo;
    }

    @KafkaListener(topics="employee.events")
    public void onEmployeeCreated(EmployeeCreatedEvent event) {
        Instant createdAt = Instant.ofEpochMilli(event.occurredAtEpochMs());

        //project event to EmployeeView
        EmployeeView employeeView = new EmployeeView(
            event.employeeId(),
            event.name(),
            event.email(),
            event.department(),
            createdAt
        );

        repo.save(employeeView);
    }
}


// This class is a projection updater.
// Its responsibility:
// Listen to events → update the read model.
// what it does architecturally: Event stream (Kafka) → Read database (MongoDB)