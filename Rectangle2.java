public class Rectangle <T> {

T height;
T width;
public Rectangle (){ height = null; width = null;}
public Rectangle(T h, T w){ height = h; width = w;}
public T getHeight(){ return height;}
public void setHeight(T h){ height = h; }
public T getArea() { return height * width;}

}
