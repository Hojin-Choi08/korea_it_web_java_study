package _33_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Map;

@AllArgsConstructor
@ToString
class Book{
    private String isbn;
    private String title;
    private String author;
    private String price;
    private String publisher;
}

public class BookJson {
    public static void main(String[] args) {

        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        Book book = new Book(
                "1234",
                "Wizards of Oz",
                "IDK",
                "$12",
                "IDK"
        );

        String bookJson = gsonBuilder.toJson(book);
        System.out.println("gson 문자열: " + book);


    }
}
