package CIET;
//import java.util.concurrent.ConcurrentHashMap;
 class Box<T> {
	 private T value;
	 public void set(T value) {
		 this.value=value;
	 }
	 public T get() {
		 return value;
		 
	 }
}
class concerent_hashMap {
	public static void main(String[] args) {
		Box<String> strBox = new Box<>();
		strBox.set("Lavanya");
		System.out.println(strBox.get());
		
		Box <Integer> intBox = new Box<>();
		intBox.set(100);
		System.out.println(intBox.get());
	}
}