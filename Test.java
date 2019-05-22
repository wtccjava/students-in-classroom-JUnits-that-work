import java.util.*;

public class Test {

	public static void main(String[] args) {
		ArrayList<Dog> list = new ArrayList<>();
		list.add(new Dog("Sally", 15));
		list.add(new Dog("Jack", 13));
		list.add(new Dog("Sophie", 12));
		Collections.sort(list);
		System.out.print(list + " ");
		
		Collections.sort(list,  new DogComparator());
		System.out.println(list);
	}
	
	static class DogComparator implements Comparator<Dog> {
		public int compare(Dog d1, Dog d2) {
			return d1.name.compareTo(d2.name);
		}
	}
	
	static class Dog implements Comparable<Dog> {
		String name;
		int weight;
		Dog(String name, int weight) {
			this.name = name;
			this.weight = weight;
		}
		
		public int compareTo(Dog d) {
			return this.weight - d.weight;
		}
		
		public String toString() {
			return "[" + name + ", " + weight + "]";
		}
	}

}
