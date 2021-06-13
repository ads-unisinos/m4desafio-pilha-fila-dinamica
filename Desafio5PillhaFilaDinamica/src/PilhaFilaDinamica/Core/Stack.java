package PilhaFilaDinamica;
/**
 * Interface que define o comportamento de uma Pilha.
 */
public interface Stack<E> {
	/**
	 * Informa se a pilha est� vazia.
	 * @return Verdadeiro se a pilha estiver vazia, falso caso contr�rio.
	 */
	boolean isEmpty();
	
	/**
	 * Informa se a pilha est� cheia.
	 * @return Verdadeiro se a pilha estiver cheia, falso caso contr�rio.
	 */
	boolean isFull();
	
	/**
	 * Informa a quantidade de elementos armazenados na pilha.
	 * @return A quantidade de elementos armazenados na pilha.
	 */
	int numElements();

	/**
	 * Adiciona um novo elemento � pilha.
	 * @param element O elemento a ser adicionado
	 */
	void push(E element) throws OverflowException;
	
	/**
	 * Retira um elemento da pilha.
	 * @return O elemento retirado
	 */
	E pop() throws UnderflowException;
	
	/**
	 * Informa qual o elemento no topo da pilha.
	 * @return O elemento atualmente no topo da pilha
	 */
	E top() throws UnderflowException;
}
