package AbstractDataTypes;

public class App {

	public static void main(String[] args) {
		Counter ob = new Counter("myCounter");
		ob.increment();
		ob.increment();
		ob.increment();
		ob.increment();
		ob.increment();
		ob.increment();
		ob.increment();
		ob.increment();
		ob.increment();
		System.out.println(ob.getCurrentValue());
	}

}
