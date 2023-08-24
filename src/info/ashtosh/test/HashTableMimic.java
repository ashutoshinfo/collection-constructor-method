package info.ashtosh.test;

import java.util.ArrayList;
import java.util.List;

class KeyValue<K, V> {
	private final K key;
	private final V value;

	public KeyValue(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}

public class HashTableMimic<K, V> {

	private static final int BUCKET_COUNT = 10;
	private List<List<KeyValue<K, V>>> buckets;

	public HashTableMimic() {
		buckets = new ArrayList<>(BUCKET_COUNT);
		for (int i = 0; i < BUCKET_COUNT; i++) {
			buckets.add(new ArrayList<>());
		}
	}

	private int getIndex(K key) {
		int hashCode = key.hashCode();
		return Math.abs(hashCode) % BUCKET_COUNT;
	}

	public void put(K key, V value) {
		int index = getIndex(key);
		List<KeyValue<K, V>> bucket = buckets.get(index);

		for (KeyValue<K, V> keyValue : bucket) {
			if (keyValue.getKey().equals(key)) {
				keyValue = new KeyValue<>(key, value); // Update existing value
				return;
			}
		}

		bucket.add(new KeyValue<>(key, value));
	}

	public V get(K key) {
		int index = getIndex(key);
		List<KeyValue<K, V>> bucket = buckets.get(index);

		for (KeyValue<K, V> keyValue : bucket) {
			if (keyValue.getKey().equals(key)) {
				return keyValue.getValue();
			}
		}

		return null; // Key not found
	}

	public static void main(String[] args) {
		HashTableMimic<String, Integer> hashTable = new HashTableMimic<>();
		hashTable.put("one", 1);
		hashTable.put("two", 2);

		System.out.println("Value for key 'one': " + hashTable.get("one")); // Output: 1
		System.out.println("Value for key 'two': " + hashTable.get("two")); // Output: 2
		System.out.println("Value for key 'three': " + hashTable.get("three")); // Output: null
	}
}
