package interfaces;

public interface IStack<T>
{
	boolean isEmpty();
	void push(T data);
	T pop();
	T peek();
	void clear();
	int size();
}
