package hr.fer.oop.zad3;



public class PaintingPrinter extends MyList<Painting> implements hr.fer.oop.zad3.Printable {

	public String print() {
		String s = "";
		for (int i = 0; i < this.size(); ++i) {
			s+= String.format("%s: %s painted by using %s%n",this.elementAt(i).getAuthor(),this.elementAt(i).getName(), this.elementAt(i).getTechnique());
		}
		return s;
	}

	

}
