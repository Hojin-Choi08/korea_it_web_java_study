package _33_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class OrderJson {
    public static void main(String[] args) {
        JsonObject jsonObject1 = new JsonObject();
        jsonObject1.addProperty("orderId: ", "ORD123456");
        jsonObject1.addProperty("customer: ", "곽두팔");
        jsonObject1.addProperty("product: ", "AirPods Pro 2th Gen");
        jsonObject1.addProperty("quantity: ", 1);
        jsonObject1.addProperty("price: ", 349000);

        JsonObject address = new JsonObject();
        address.addProperty("receiver", "곽두팔");
        address.addProperty("phone number", "010 - 5678 - 1234");
        address.addProperty("city", "Seoul");
        address.addProperty("district", "마포구");
        address.addProperty("zipCode", 04123);

        jsonObject1.add("address", address);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(jsonObject1);
        System.out.println(json);
    }
}
