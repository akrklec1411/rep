package hr.fer.oop.zad3;

import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class NameablePrinter<T extends Artwork & Nameable> extends MyList<T> implements hr.fer.oop.zad3.Printable{

	
	
	public String print() {
		String s = "";
		for (int i = 0; i < this.size(); ++i) {
			s+= String.format("%s: %s%n", this.elementAt(i).getAuthor(), this.elementAt(i).getName());
		}
		return s;
	}
	
}
