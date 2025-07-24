package patterns.singletone.HashcodeEquals;

import java.util.Objects;

public class HashcodeEquals {

	int id;
	String name;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		HashcodeEquals that = (HashcodeEquals) o;
		return id == that.id && Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	public HashcodeEquals(int id, String name) {

	}

	@Override
	public String toString() {
		return super.toString();
	}

}


class HashcodeEqualsTest {
	public static void main(String[] args) {

		HashcodeEquals hashcodeEquals1 = new HashcodeEquals(1, "Mark");
		HashcodeEquals hashcodeEquals2 = new HashcodeEquals(1, "Mark");
		HashcodeEquals hashcodeEquals3 = new HashcodeEquals(1, "Mark");
		System.out.println(hashcodeEquals1); //единый результат HashcodeEquals@3c1
		System.out.println(hashcodeEquals2); //единый результат HashcodeEquals@3c1
		System.out.println(hashcodeEquals3); //единый результат HashcodeEquals@3c1
	}

}
