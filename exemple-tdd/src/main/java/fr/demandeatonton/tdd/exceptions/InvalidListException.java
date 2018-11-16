package fr.demandeatonton.tdd.exceptions;

@SuppressWarnings("serial")

/**
 * afin d'eviter une nullexception on cree une customer exception
 * 
 * @author franck Desmedt
 *
 */
public class InvalidListException extends RuntimeException {

	/**
	 * 
	 * @param arg0
	 * 
	 */
	public InvalidListException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
}
