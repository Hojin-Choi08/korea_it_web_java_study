package _34_Exception;

class SignUpFailedException extends Exception {
    public SignUpFailedException (String message) {
        super(message);
        System.out.println("예외 발생~ ");
    }
}

public class SignUpException {
    public static void SignUp(String name, int age) throws SignUpFailedException {
        if (age < 14) {
            throw new SignUpFailedException("나이가 14세 미만..");
        }
        System.out.println(name + "님 회원가입 완료되었습니다. ");
    }

    public static void main(String[] args) {
        String name = "ooo";
        int age = 13;

        try {
            SignUp(name, age); //!5! 예외 발생
        } catch (SignUpFailedException e) {
            System.out.println("Sign up Failed : " + e.getMessage()); //!6! 캐치
        }

    }
}
