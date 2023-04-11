package encryptDecrypt;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) {

		String password = "12345";

		// Encrypted
		byte[] passwordInBytes = password.getBytes();
		String encodedPassword = Base64.getEncoder().encodeToString(passwordInBytes);
		System.out.println(encodedPassword);

		String encryptedPassword = "MTIzNDU=";

		// Decrypted
		byte[] decryptedPasswordInBytes = Base64.getDecoder().decode(encryptedPassword);
		String decryptedPasswordInText = new String(decryptedPasswordInBytes);
		System.out.println(decryptedPasswordInText);

		// returnDecryptedPassword("MTIzNDU=");

	}

	public static String returnDecryptedPassword(String encryptedPassword) {
		byte[] decryptedPasswordInBytes = Base64.getDecoder().decode(encryptedPassword);
		String decryptedPasswordInText = new String(decryptedPasswordInBytes);
		// System.out.println(decryptedPasswordInText);
		return decryptedPasswordInText;
	}

}
