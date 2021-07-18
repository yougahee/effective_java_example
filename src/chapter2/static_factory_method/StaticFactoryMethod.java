package chapter2.static_factory_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StaticFactoryMethod {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Boolean b = Boolean.parseBoolean(br.readLine());
		if(b.equals(Boolean.TRUE)) System.out.println("True");
		else System.out.println("FALSE");
	}
}
