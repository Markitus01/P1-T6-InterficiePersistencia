/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.mif.manager.interficiepersistencia;

import java.util.List;
import org.mif.manager.model.*;

/**
 *
 * @author markos
 */
public interface IGestorBDManager
{
    /**
     * Retorna el llistat de temporades de la BD
     * 
     * @return Llista de temporades recuperades
     * @throws GestorBDManagerException 
     */
    List<Temporada> obtenirTemporades() throws GestorBDManagerException;
    
    /**
     * Retorna el llistat de tots els equips de la BD
     * 
     * @return Llista d'equips recuperats
     * @throws GestorBDManagerException 
     */
    List<Equip> obtenirEquips() throws GestorBDManagerException;
    
    /**
     * Retorna un llistat amb els equips que tinguin la String introduida al nom i/o siguin del tipus introduït
     * 
     * @param nomEquip Nom de l'equip (o equips) que es vol cercar
     * @param tipus Tipus de l'equip (o equips) que es vol cercar
     * @return Llistat d'equips que concordin amb nom i/o tipus
     * @throws GestorBDManagerException 
     */
    List<Equip> buscarEquips(String nomEquip, String tipus) throws GestorBDManagerException;
    
    /**
     * Retorna l'equip obtingut a partir de la seva id
     * 
     * @param idEquip id de l'equip a obtenir
     * @return Equip obtingut
     * @throws GestorBDManagerException 
     */
    Equip obtenirEquip(int idEquip) throws GestorBDManagerException;
    
    /**
     * Insereix l'equip a la BD
     * 
     * @param e Equip a inserir
     * @return int Indicant la quantitat de linies inserides
     * @throws GestorBDManagerException 
     */
    int afegirEquip(Equip e) throws GestorBDManagerException;
    
    /**
     * Modifica l'equip a la BD
     * 
     * @param e Equip a modificar
     * @throws GestorBDManagerException 
     */
    void modificarEquip(Equip e) throws GestorBDManagerException;
    
    /**
     * Esborra l'equip de la BD
     * 
     * @param e Equip a eliminar
     * @throws GestorBDManagerException 
     */
    void eliminarEquip(Equip e) throws GestorBDManagerException;
    
    /**
     * Retorna tots els jugadors de la BD
     * 
     * @return Llista de tots els jugadors
     * @throws GestorBDManagerException 
     */
    List<Jugador> obtenirJugadors() throws GestorBDManagerException;
    
    /**
     * Retorna llistat amb els jugadors que concordin amb nom/cognoms, equip o sexe introduits per cercar
     * 
     * @param nomJugador Nom o Cognoms dels jugadors o jugador que es volen cercar
     * @param e Equip del qual es volen obtenir els o el jugador
     * @param sexe Sexe del jugador o jugadors que es volen cercar
     * @return Llistat amb els jugadors (o jugador) que compleixin les condicions introduides
     * @throws GestorBDManagerException 
     */
    List<Jugador> buscarJugadors(String nomJugador, Equip e, String sexe) throws GestorBDManagerException;
    
    /**
     * Retorna el jugador obtingut a partir de la seva id
     * @param idJugador id del jugador a obtenir
     * @return Jugador obtingut
     * @throws GestorBDManagerException 
     */
    Jugador obtenirJugador(int idJugador) throws GestorBDManagerException;
    
    /**
     * Insereix jugador a la BD
     * 
     * @param j Jugador a inserir
     * @throws GestorBDManagerException 
     */
    void afegirJugador(Jugador j) throws GestorBDManagerException;
    
    /**
     * Modifica el jugador a la BD
     * 
     * @param j Jugador a modificar
     * @throws GestorBDManagerException 
     */
    void modificarJugador(Jugador j) throws GestorBDManagerException;
    
    /**
     * ESborra el jugador de la BD
     * 
     * @param j Jugador a eliminar
     * @throws GestorBDManagerException 
     */
    void eliminarJugador(Jugador j) throws GestorBDManagerException;
    
    /**
     * Retorna llistat amb totes les categories existents
     * 
     * @return Llista de totes les categories a la BD
     * @throws GestorBDManagerException 
     */
    List<Categoria> obtenirCategories() throws GestorBDManagerException;
    
    /**
     * Retorna la categoria trobada a partir del seu id
     * 
     * @param categoria id de la categoria
     * @return Categoria obtenida
     * @throws GestorBDManagerException 
     */
    Categoria obtenirCategoria(String categoria) throws GestorBDManagerException;
    
    /**
     * Retorna l'usuari administrador de la BD loguejat amb login i contrasenya
     * 
     * @param login Identificador del administrador (mail)
     * @param pswd Contrasenya del administrador
     * @return Usuari administrador
     * @throws GestorBDManagerException 
     */
    Usuari retornarUsuari(String login, String pswd) throws GestorBDManagerException;
    
    /**
     * Tanca la conexió amb la BD
     * 
     * @throws GestorBDEmpresaException 
     */
    void tancarCapa() throws GestorBDManagerException;
    
    /**
     * Conserva els canvis efectuats a la BD
     * 
     * @throws GestorBDManagerException 
     */
    void confirmarCanvis() throws GestorBDManagerException;
    
    /**
     * Desfa els canvis efectuats a la BD
     * 
     * @throws GestorBDManagerException
     */
    void desferCanvis() throws GestorBDManagerException;
}
