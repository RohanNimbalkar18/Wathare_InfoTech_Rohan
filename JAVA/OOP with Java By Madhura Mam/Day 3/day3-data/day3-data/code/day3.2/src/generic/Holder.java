package generic;

//Create a Holder class , that can hold ANY type
//(any prim type , as well any ref type)
public class Holder<T> { //generic class declaration : parameterized type 
	private T ref;
	public Holder(T ref) {
		super();
		this.ref = ref;
	}
	public T getRef() {
		return ref;
	}	
}
