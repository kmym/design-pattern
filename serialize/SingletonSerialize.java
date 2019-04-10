import java.io.*;

class SingletonSerialize {
	public static void main(String args[]) throws Exception {
		String filename = "singleton.txt";
		Singleton instance = Singleton.getInstance();

		System.out.println(instance);
		System.out.println(instance.hashCode());

		SingletonSerialize.serialize(instance, filename);

		Singleton desilialize1 = SingletonSerialize.deserialize(filename);
		System.out.println(desilialize1);
		System.out.println(desilialize1.hashCode());

		Singleton desilialize2 = SingletonSerialize.deserialize(filename);
		System.out.println(desilialize2);
		System.out.println(desilialize2.hashCode());
	}

	private static void serialize(Singleton singleton, String fileName) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(fileName);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

		objectOutputStream.writeObject(singleton);
		objectOutputStream.flush();

		objectOutputStream.close();
	}

	private static Singleton deserialize(String fileName) throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream(fileName);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

		Singleton singleton = (Singleton) objectInputStream.readObject();

		objectInputStream.close();

		return singleton;
	}
}


