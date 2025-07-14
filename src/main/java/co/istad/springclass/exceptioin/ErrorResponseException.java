package co.istad.springclass.exceptioin;

import java.time.Instant;

public class ErrorResponseException extends RuntimeException {
    private final int status;
    private final String message;
    private final long timestamp;

    public ErrorResponseException(int status, String message) {
        super(message);
        this.status = status;
        this.message = message;
        this.timestamp = Instant.now().toEpochMilli();
    }

    public int getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public long getTimestamp() {
        return timestamp;
    }
}