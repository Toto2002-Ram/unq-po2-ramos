package ar.edu.unq.po2.tp3;

public class Punto {

	 private float X;
	 private float Y;
	 public Punto(float x, float y) {
		super();
		this.setXY(x, y);
	 }
	 
	 public void setXY(float x, float y) {
		  this.setX(x);
		  this.setY(y);
	 }
	 public float getX() {
		 return X;
	 }
	 public void setX(float x) {
		 X = x;
	 }
	 public float getY() {
		 return Y;
	 }
	 public void setY(float y) {
		 Y = y;
	 }
	 
	 
	 
	 
}
