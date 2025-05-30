package _29_Builder;

public class MemberLombokMain {
    public static void main(String[] args) {
        MemberLombok memberLombok = MemberLombok.builder()
                .age(18)
                .email("Mail")
                .name("Hun")
                .build();
    }
}
