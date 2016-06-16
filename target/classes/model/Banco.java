
public class Banco {
	private static Banco instance = null;
	   protected Banco() {
	      // Exists only to defeat instantiation.
	   }
	   public static Banco getInstance() {
	      if(instance == null) {
	         instance = new Banco();
	      }
	      return instance;
	   }
}
