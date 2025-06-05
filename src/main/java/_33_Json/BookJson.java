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

        Book book1 = new Book(
                "1234",
                "Wizards of Oz",
                "IDK",
                "$12",
                "IDK"
        );

        //1st
        String bookJson = gson.toJson(book1);
        System.out.println("Json: " + bookJson);
        //2nd
        Map<String, String> map1 = gson.fromJson(bookJson, Map.class);
        System.out.println("Map: " + map1);
        //3rd
        System.out.println("Pretty Json: " + gsonBuilder.toJson(map1));
        //4rd
        Book book2 = gson.fromJson(bookJson, Book.class);
        System.out.println("Book: " +book2);


    }
}
