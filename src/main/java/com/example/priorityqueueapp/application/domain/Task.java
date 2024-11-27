package com.example.priorityqueueapp.application.domain;


import java.time.Instant;

public record Task(
    String id,
    String namespace,
    String topic,
    int priority,
    byte[] payload,
    byte[] metadata,
    Instant dequeueDelay,
    long leaseDuration,
    long ttl
) {}