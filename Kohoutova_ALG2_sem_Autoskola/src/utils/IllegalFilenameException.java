/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author kristyna kohoutova
 */
public class IllegalFilenameException extends Exception {

    public IllegalFilenameException(String messageToUser) {
        super(messageToUser);
    }
    
}
