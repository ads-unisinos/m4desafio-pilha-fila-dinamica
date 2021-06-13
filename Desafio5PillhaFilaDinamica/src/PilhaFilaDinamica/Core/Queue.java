package PilhaFilaDinamica.Core;

import PilhaFilaDinamica.Exceptions.*;

/**
 * Interface que define o comportamento de uma Fila.
 */
public interface Queue<E> {
	/**
	 * Informa se a fila est� vazia.
	 * @return Verdadeiro se a fila estiver vazia, falso caso contr�rio.
	 */
	boolean isEmpty();
	
	/**
	 * Informa se a fila est� cheia.
	 * @return Verdadeiro se a fila estiver cheia, falso caso contr�rio.
	 */
	boolean isFull();
	
	/**
	 * Informa a quantidade de elementos armazenados na fila.
	 * @return A quantidade de elementos armazenados na fila.
	 */
	int numElements();

	/**
	 * Insere um novo elemento na fila.
	 * @param element O elemento a ser inserido
	 */
	void enqueue(E element) throws OverflowException;
	
	/**
	 * Retira um elemento da fila.
	 * @return O elemento retirado
	 */
	E dequeue() throws UnderflowException;
	
	/**
	 * Informa qual o primeiro elemento da fila.
	 * @return O primeiro elemento da fila
	 */
	E front() throws UnderflowException;
	
	/**
	 * Informa qual o �ltimo elemento da fila.
	 * @return O �ltimo elemento da fila
	 */
	E back() throws UnderflowException;
}
