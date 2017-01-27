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
public class ElementAlreadyExistException extends RuntimeException {
    
    public ElementAlreadyExistException(String message) {
        super(message);
    }
}
