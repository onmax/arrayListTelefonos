
import java.util.Stack;
public class TestGuiaTlfoOrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuiaTelefonosOrd guia = new GuiaTelefonosOrd(10);
		guia.poner(new Contacto("A", 1));
		guia.poner(new Contacto("C", 2));
		guia.poner(new Contacto("B", 3));
		
		System.out.println(guia);
		
		System.out.println(guia.buscarNombre("A"));
		System.out.println(guia.buscarNombre("X"));
		
		guia.quitar(new Contacto("A", 1) );
		
		System.out.println(guia);
		
		
		

	}

}
