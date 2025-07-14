package co.istad.springclass.exceptioin;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

@RestControllerAdvice
public class ServiceException {
    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<Map<? ,?>> handleResponseStatusException(ResponseStatusException ex) {

        Map<String, Object> error = new HashMap<>() ;
        error.put("message", ex.getMessage());
        error.put("status", ex.getStatusCode().value());
        error.put("path", LocalDateTime.now());
    
        return ResponseEntity.status(ex.getStatusCode()).body(error);
    }
}
