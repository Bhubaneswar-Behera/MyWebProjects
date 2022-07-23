package in.ashokit;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.google.gson.Gson;

/**
 * 
 * @author Bhubaneswar Behera @date 23-Jul-2022
 *
 */

public class Main {
	public static void main(String[] args) throws Exception{
		Order order = new Order();
		order.setOrderId(101);
		order.setOrderBy("Ramu");
		order.setOrderstatus("CONFIRMED");
		order.setBillAmount(560.00);
		
		System.out.println("Conversion started...");
		Gson gson  = new Gson();
		
		gson.toJson(order , new FileWriter("D:\\MyWebProjects\\30-GSON-API-APP\\order.json"));
		
		String jsonString = gson.toJson(order);
		System.out.println(jsonString);
		
		
		Order orderFromJson = gson.fromJson(new FileReader(new File("D:\\\\MyWebProjects\\\\30-GSON-API-APP\\\\order.json")), Order.class);
		System.out.println(orderFromJson);
		
		Order orderObjectFromString = gson.fromJson(jsonString, Order.class);
		System.out.println(orderObjectFromString);
		
		
		System.out.println("Conversion completed...");
		
	}

}
