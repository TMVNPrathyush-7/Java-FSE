package com.cognizant.spring_learn.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CountryNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handleCountryNotFound(CountryNotFoundException ex){

        ExceptionResponse response =
                new ExceptionResponse(
                        new Date(),
                        ex.getMessage(),
                        "Country Not Found"
                );

        return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);

    }

}