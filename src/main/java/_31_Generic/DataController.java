package _31_Generic;

import _27_Bean.UserEntityLombok;

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
//        ResponseData responseData = new ResponseData
//                ("데이터: ", "My Pookie", 18, 23.23);
//        System.out.println(responseData.toStringstr());
//        System.out.println(responseData.toStringInt());
//        System.out.println(responseData.toStringDouble());

        ResponseData<String> responseData1 = new ResponseData<String>("Name: ", "Pookie");
        System.out.println(responseData1);
        ResponseData<Integer> responseData2 = new ResponseData<Integer>("Age: ", 14);
        System.out.println(responseData2);
        ResponseData<Double> responseData3 = new ResponseData<Double>("Double Value: ", 32.32);

        Date now = new Date();
        ResponseData<Date> nowData = new ResponseData<>("Current Time: ",now);
        System.out.println(nowData);

//        UserEntityLombok userEntityLombok = new UserEntityLombok();
//        userEntityLombok.setUserId(12);
//        userEntityLombok.setUsername("PK");
//        userEntityLombok.setAge(71);
//        userEntityLombok.setEmail("HU Mail");
//        ResponseData<UserEntityLombok> user = new ResponseData<>("User Entity: ", "");
//        System.out.println(user);

        //product 패키지
        //ProductController.java, Product.java
        //상품 정보, => 상품명(productName), 상품정보(productInfo)

    }
}
