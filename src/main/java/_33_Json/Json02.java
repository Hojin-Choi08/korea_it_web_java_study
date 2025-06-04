package _33_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@ToString
class User{
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class Json02 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        String userJson = null;

        User user = new User(
            "EU",
            "2008",
             "EUmail",
             "ㅇㅇㅇ",
                "17"
        );
        System.out.println("user객체 : " + user);
        userJson = gson.toJson(user); // => user객체를 String형태
        System.out.println("gson만 사용: " + userJson);

        userJson = gsonBuilder.toJson(user); // => user객체를 json형태로 예쁘게 변환
        System.out.println("gsonBuilder 사용 : " + userJson);

        //JsonObject -> json
        JsonObject jsonObject1 = new JsonObject();
        jsonObject1.addProperty("SC", "1");
        jsonObject1.addProperty("SN", "EU");
        jsonObject1.addProperty("SY", "4");
        jsonObject1.addProperty("SS", "A-");

        String studentJson = gson.toJson(jsonObject1);
        System.out.println("gson 사용했을 때: " + jsonObject1);

        studentJson = gsonBuilder.toJson(jsonObject1);
        System.out.println("gsonBuilder 사용했을 때: "+ jsonObject1);

        //Map => Json
        Map<String, String> map1 = new HashMap<>();
        map1.put("productCode", "EUEU");
        map1.put("productName", "iPad pro 12");

        System.out.println("gson 사용 했을 때: " + gson.toJson(map1));
        System.out.println("gsonBuilder 사용했을 때: " + gsonBuilder.toJson(map1));
        String productJson = gsonBuilder.toJson(map1);

        //Json -> Map
        Map<String, String> map2 = gson.fromJson(productJson, Map.class);
        System.out.println(map2);

        //Json -> User
        User user2 = gson.fromJson(userJson, User.class);
        System.out.println(user2);

        //Json -> JsonObject => Json과 JsonObject는 같은 형태가 아니다.
        //studentJson의 자료형은 String -> JsonObject의 자료형은 JsonObject
        JsonObject jsonObject2 = gson.fromJson(studentJson, JsonObject.class);
        System.out.println(jsonObject2);

    }
}
