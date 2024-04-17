package non_generic;

//Create a Holder class , that can hold ANY type
//(any prim type , as well any ref type)
public class Holder {
	private Object ref;
	public Holder(Object ref) {
		super();
		this.ref = ref;
	}
	public Object getRef() {
		return ref;
	}	
}
