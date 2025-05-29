package _26_Objects;

import java.util.Objects;

public class Teacher {
    private String name;
    private String schoolName;

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return name + " 선생님의 근무지는 " + schoolName + "입니다";
    }

    //hashcode를 override하면 toequals로 해주어야한다.

    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
    }
    //name가 schoolName의 값을을 기반으로 고유한 숫자 (hasCode)를 생성

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Teacher)) return false;
        Teacher teacher = (Teacher) obj;
        return this.name.equals(teacher.name) && this.schoolName.equals(teacher.schoolName);
    }
    //equals에서 같다고 판별된 같은 해시코드를 가져야한다. 라고 자바 공식 규칙
}
