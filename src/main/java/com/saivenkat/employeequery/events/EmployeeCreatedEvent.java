package com.saivenkat.employeequery.events;

import java.time.Instant;

public record EmployeeCreatedEvent(
        String employeeId,
        String eventId,
        String name,
        String email,
        String department,
        Instant occurredAt,
        int version
) {}
