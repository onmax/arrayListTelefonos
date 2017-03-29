import list.ArrayList;

public class GuiaTelefonosOrd{
	private ArrayList<Contacto> guia;
	private int numContactos;

	public GuiaTelefonosOrd(int capacidad){
		this.guia = new ArrayList<Contacto>();
		numContactos = 0;
	}

	public String toString(){
		String res = "";
		for (int i = 0; i < numContactos; i++){
			res += this.guia.get(i) + "\n";
		}
		return res;
	}
	
	public void poner(Contacto contacto){
		guia.add(numContactos, contacto);
		numContactos++;
	}

	public void quitar(Contacto contacto){
		for (int i = 0; i < this.numContactos; i++){
			if (contacto.equals(this.guia.get(i)))
				this.guia.remove(contacto);
		}
	}

	public Contacto buscarNombre(String nombre){
		boolean aux_bool = true;
		Contacto res = new Contacto("", 0);
		for (int i = 0; aux_bool && i <= getOcupacion() - 1; i++){
			if (nombre.equals(this.guia.get(i).getNombre())){
				res = this.guia.get(i);
				aux_bool = false;
			}
		}
		if(aux_bool){
			return null;
		}else{
			return res;
		}
	}
	
	public int getOcupacion() {
		return this.guia.size();
	}

	public int getCapacidad() {
		return this.numContactos;
	}
}

