/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mif.manager.interficiepersistencia;

/**
 *
 * @author markos
 */
public class GestorBDManagerException extends Exception
{
    public GestorBDManagerException(String message)
    {
        super(message);
    }

    public GestorBDManagerException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
