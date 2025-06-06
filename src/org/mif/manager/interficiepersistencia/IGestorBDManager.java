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
     * Crea una nova temporada a la BD
     * 
     * @param data Data de la nova temporada en string
     * @return int indicant si s'ha afegit la temporada (1) o no (0)
     * @throws GestorBDManagerException 
     */
    int crearTemporada(String data) throws GestorBDManagerException;
    
    /**
     * Retorna el llistat de tots els equips de la BD per a la temporada escollida
     * @param t temporada escollida
     * @return Llista d'equips recuperats
     * @throws GestorBDManagerException 
     */
    List<Equip> obtenirEquips(Temporada t) throws GestorBDManagerException;
    
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
     * @return int Indicant la quantitat de linies afectades
     * @throws GestorBDManagerException 
     */
    int afegirEquip(Equip e) throws GestorBDManagerException;

    /**
     * Modifica l'equip a la BD
     * 
     * @param e Equip a modificar
     * @return int Indicant la quantitat de linies afectades
     * @throws GestorBDManagerException 
     */
    int modificarEquip(Equip e) throws GestorBDManagerException;
    
    /**
     * Esborra l'equip de la BD
     * 
     * @param e Equip a eliminar
     * @return int Indicant la quantitat de linies afectades
     * @throws GestorBDManagerException 
     */
    int eliminarEquip(Equip e) throws GestorBDManagerException;
    
    /**
     * Retorna tots els jugadors de la BD
     * 
     * @return Llista de tots els jugadors
     * @throws GestorBDManagerException 
     */
    List<Jugador> obtenirJugadors() throws GestorBDManagerException;
    
    /**
     * Retorna els jugadors d'un equip
     * 
     * @param eqId EquipId del qual volem obtenir els jugadors
     * @return Llista dels jugadors de l'equip pasat per parametre
     * @throws GestorBDManagerException 
     */
    List<Jugador> obtenirJugadorsEquip(int eqId) throws GestorBDManagerException;
    
    /**
     * Retorna els jugadors inscriptibles dins l'equip especificat
     * 
     * @param eqId EquipId del qual volem obtenir els jugadors inscriptibles
     * @return Llista dels jugadors que podrien inscriure-s'hi a l'equip
     * @throws GestorBDManagerException 
     */
    List<Jugador> obtenirJugadorsEquipInscriptibles(int eqId) throws GestorBDManagerException;
    
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
     * @param idJugador id legal del jugador a obtenir
     * @return Jugador obtingut
     * @throws GestorBDManagerException 
     */
    Jugador obtenirJugador(String idJugador) throws GestorBDManagerException;
    
    /**
     * Comprova si un jugador és titular a un equip.
     * 
     * @param equipId id de l'equip
     * @param jugadorId id del jugador
     * @return true si és titular, false si és convidat o no hi és
     * @throws GestorBDManagerException
    */
    boolean esTitular(int equipId, int jugadorId) throws GestorBDManagerException;
    
    /**
     * Insereix jugador a la BD
     * 
     * @param j Jugador a inserir
     * @return int Indicant la quantitat de linies afectades
     * @throws GestorBDManagerException 
     */
    int afegirJugador(Jugador j) throws GestorBDManagerException;
    
    /**
     * Modifica el jugador a la BD
     * 
     * @param j Jugador a modificar
     * @return int Indicant la quantitat de linies afectades
     * @throws GestorBDManagerException 
     */
    int modificarJugador(Jugador j) throws GestorBDManagerException;
    
    /**
     * ESborra el jugador de la BD
     * 
     * @param j Jugador a eliminar
     * @return int Indicant la quantitat de linies afectades
     * @throws GestorBDManagerException 
     */
    int eliminarJugador(Jugador j) throws GestorBDManagerException;
    
    /**
     * Retorna l'id de l'equip on el jugador és titular, o null si no n'és a cap.
     * 
     * @param jugadorId id del jugador a consultar
     * @return id de l'equip o null si no n'és titular a cap equip
     * @throws GestorBDManagerException 
    */
    Integer obtenirEquipOnEsTitular(int jugadorId) throws GestorBDManagerException;
    
    /**
     * Obtenim les relacions de membres de la BD
     * 
     * @return Llista de membres
     * @throws GestorBDManagerException 
     */
    List<Membre> obtenirMembres() throws GestorBDManagerException;
    
    /**
     * Afegeix una nova relació membre a la BD
     * 
     * @param m Membre a afegir
     * @return int Indicant la quantitat de linies afectades
     * @throws GestorBDManagerException 
     */
    int afegirMembre(Membre m) throws GestorBDManagerException;
    
    /**
     * Modifica una relació membre a la BD
     * 
     * @param m Membre a modificar
     * @param titular Nou estat de titularitat
     * @return int Indicant la quantitat de linies afectades
     * @throws GestorBDManagerException 
     */
    int modificarMembre(Membre m, boolean titular) throws GestorBDManagerException;
    
    /**
     * Elimina una relació membre a la BD
     * 
     * @param m Membre a eliminar
     * @return int Indicant la quantitat de linies afectades
     * @throws GestorBDManagerException 
     */
    int eliminarMembre(Membre m) throws GestorBDManagerException;
    
    /**
     * Elimina totes les relacions membre associades a un equip
     * 
     * @param equipId id de l'equip del qual es volen eliminar tots els membres
     * @return int nombre de membres eliminats
     * @throws GestorBDManagerException
    */
   int eliminarMembresEquip(int equipId) throws GestorBDManagerException;

    
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
     * @return int Depenent de si troba o no l'usuari indicat
     * @throws GestorBDManagerException 
     */
    int loginUsuari(String login, String pswd) throws GestorBDManagerException;
    
    /**
     * Tanca la conexió amb la BD
     * 
     * @throws GestorBDManagerException 
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
