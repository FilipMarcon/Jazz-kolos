package com.jazs22626nbp;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.net.ConnectException;

@ControllerAdvice
public class RestResponseEntity extends ResponseEntityExceptionHandler  {

        @ExceptionHandler(value
                = { HttpClientErrorException.class })
        protected ResponseEntity<Object> handleConflict(
                HttpClientErrorException ex, WebRequest request) {
            if (ex.getStatusCode() == HttpStatus.NOT_FOUND) {
                return handleExceptionInternal(ex, "brak danych",
                        new HttpHeaders(), HttpStatus.OK, request);
            } else if (ex.getStatusCode() == HttpStatus.BAD_REQUEST) {
                return handleExceptionInternal(ex, null,
                        new HttpHeaders(), HttpStatus.NOT_FOUND, request);
            } else if (ex.getStatusCode() == HttpStatus.BAD_GATEWAY) {
                return handleExceptionInternal(ex, null,
                        new HttpHeaders(), HttpStatus.BAD_GATEWAY, request);
            } else {
                return handleExceptionInternal(ex, null,
                        new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
            }
        }

        @ExceptionHandler(value
                = { ConnectException.class })
        protected ResponseEntity<Object> handleConflict(
                ConnectException ex, WebRequest request) {
            return handleExceptionInternal(ex, null,
                    new HttpHeaders(), HttpStatus.GATEWAY_TIMEOUT, request);
        }
    }

