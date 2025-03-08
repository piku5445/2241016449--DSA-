 class Box<T> {
private T t; 
public void set(T t) {
 this.t = t;
}
public T get() {
 return t;
}
public <U extends Number> void inspect(String string){
 System.out.println("T: "+ t.getClass().getName());
 System.out.println("U:  "+ string.getClass().getName());
}
public static void main(String[] args) {
 Box<Integer> integerBox = new Box<Integer>();
 integerBox.set(new Integer(15));
 integerBox.inspect("some text"); // error: is presented since this would still be 
//returning a String;
}
}
public class q1 {

}
