package _31_Generic.Product;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product<T> {
    private String productName;
    private T productInfo;


}
