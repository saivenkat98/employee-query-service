package com.saivenkat.employeequery.events;

public record EmployeeCreatedEvent(
        String employeeId,
        String eventId,
        String name,
        String email,
        String department,
        long occurredAtEpochMs,
        int version
) {}
