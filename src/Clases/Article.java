package Clases;

import java.awt.Color;
import java.awt.Image;


public class Article {
	public Color color;
        public String tipo;
	public String ocasion;
        public String descripcion;
        public Image imagen;

	Article next; //Apuntador

	public Article(){}
	public Article(Color color, String tipo, String ocasion, String descripcion, Image imagen ){
		this.color = color;
		this.tipo =tipo;
                this.ocasion = ocasion;
                this.descripcion = descripcion;
                this.imagen = imagen;
	}
	@Override
	public String toString(){
		return "color:" + this.color + "\t" + "tipo: " + this.tipo + "\n";
	}
}
