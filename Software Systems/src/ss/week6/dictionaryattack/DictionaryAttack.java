package ss.week6.dictionaryattack;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.binary.Hex;

public class DictionaryAttack {
	private Map<String, String> passwordMap;
	private Map<String, String> hashDictionary;

	/**
	 * Reads a password file. Each line of the password file has the form:
	 * username: encodedpassword
	 * 
	 * After calling this method, the passwordMap class variable should be
	 * filled withthe content of the file. The key for the map should be the
	 * username, and the password hash should be the content.
	 * 
	 * @param filename
	 * @throws IOException
	 */
	public void readPasswords(String filename) throws IOException {
		Path path = Paths.get(filename);
		ArrayList<String> stringList = (ArrayList<String>) Files.readAllLines(path);
		ArrayList<String> userPass = new ArrayList<>();
		for (int i = 0; i < stringList.size(); i++) {
			String[] pair = stringList.get(i).split(": ");
			userPass.add(pair[0]);
			userPass.add(pair[1]);
		}
		passwordMap = new HashMap<>();
		for (int i = 0; i < userPass.size() - 1; i = i + 2) {
			passwordMap.put(userPass.get(i), userPass.get(i + 1));
		}
	}

	/**
	 * Given a password, return the MD5 hash of a password. The resulting hash
	 * (or sometimes called digest) should be hex-encoded in a String.
	 * 
	 * @param password
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws NoSuchAlgorithmException
	 */
	public String getPasswordHash(String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		byte[] passwordArray = password.getBytes();
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] thedigest = md.digest(passwordArray);
		return Hex.encodeHexString(thedigest);
	}

	/*
	 * Checks the password for the user the password list. If the user does not
	 * exist, returns false.
	 * 
	 * @param user
	 * 
	 * @param password
	 * 
	 * @return whether the password for that user was correct.
	 */
	public boolean checkPassword(String user, String password)
			throws UnsupportedEncodingException, NoSuchAlgorithmException {
		if (passwordMap.containsKey(user)) {
			return passwordMap.get(user).equals(this.getPasswordHash(password));
		} else {
			return false;
		}

	}

	/**
	 * Reads a dictionary from file (one line per word) and use it to add
	 * entries to a dictionary that maps password hashes (hex-encoded) to the
	 * original password.
	 * 
	 * @param filename
	 *            filename of the dictionary.
	 * @throws IOException
	 * @throws NoSuchAlgorithmException
	 */
	public void addToHashDictionary(String filename) throws IOException, NoSuchAlgorithmException {
		Path path = Paths.get(filename);
		List<String> passwords = (ArrayList<String>) Files.readAllLines(path);
		hashDictionary = new HashMap<>();
		for (int i = 0; i < passwords.size(); i++) {
			hashDictionary.put(getPasswordHash(passwords.get(i)), passwords.get(i));
		}

	}

	/**
	 * Do the dictionary attack.
	 */
	public void doDictionaryAttack() {
		for (Map.Entry<String, String> entry : passwordMap.entrySet()) {
			String user = entry.getKey();
			String hash = entry.getValue();
			for (Map.Entry<String, String> DicEntry : hashDictionary.entrySet()) {
				if (hash.equals(DicEntry.getKey())) {
					System.out.println(user + ": " + DicEntry.getValue());
				}
			}
		}
	}

	public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
		DictionaryAttack da = new DictionaryAttack();
		da.addToHashDictionary("passwords.txt");
		da.addToHashDictionary("morePasswords.txt");
		da.readPasswords("LeakedPasswords.txt");
		da.doDictionaryAttack();
	}

}
