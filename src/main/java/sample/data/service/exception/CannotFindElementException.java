/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.data.service.exception;

/**
 *
 * @author Romain
 */
public class CannotFindElementException extends RuntimeException {
    
    public CannotFindElementException(String message) {
        super(message);
    }
}
