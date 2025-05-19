package _06_String;

public class String01 {
    public static void main(String[] args) {
        String str = "My name is DongYoon Lee";

        System.out.println(str.length()); //문자열 길이

        System.out.println(str.toUpperCase()); //전부 대문자로
        System.out.println(str.toLowerCase()); //전부 소문자로

        System.out.println(str.contains("name")); //포함 여부, 결과는 boolean
        System.out.println(str.contains("age"));

        System.out.println(str.indexOf("name")); //해당 위치 정보
        System.out.println(str.indexOf("age")); //만약 없으면 -1

        str = "I like music and movie and travel";
        System.out.println(str.lastIndexOf("and")); //여러개 중에서 마지막 위치
        System.out.println(str.lastIndexOf("java")); //없으면 -1
        System.out.println(str.startsWith("I like")); //해당 문자열로 시작하냐? => boolean
        System.out.println(str.startsWith("My name")); //아니면 false
        System.out.println(str.endsWith("travel")); //해당 문자열로 끝나냐?
        System.out.println(str.endsWith("movie")); //아니면 false

    }
}
