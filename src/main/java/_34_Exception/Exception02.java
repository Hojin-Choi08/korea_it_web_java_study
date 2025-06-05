package _34_Exception;

class LoginFailedException extends Exception {
    public LoginFailedException (String message) { //!3!
        super(message);
        System.out.println("예외가 발생했습니다. "); //!2!
    }
}

public class Exception02 {
    public static void login(String id, String pw) throws LoginFailedException { //책임전가 //!4!
        String correctId = "admin";
        String correctPw = "1q2w3e4r";

        if (!id.equals(correctId) || !pw.equals(correctPw)) {
            //예외 발생 지점
            throw new LoginFailedException("ID 또는 PASSWORD가 틀렸어요..."); //!1!
        }
    }

    public static void main(String[] args) {
        String inputId = "admin";
        String inputPw = "1234qwer";

        try {
            login(inputId, inputPw); //!5! 예외 발생
        } catch (LoginFailedException e) {
            System.out.println("로그인 실패 : " + e.getMessage()); //!6! 캐치
        } finally {
            System.out.println("프로그램 정상 가동");
        }

    }
}
