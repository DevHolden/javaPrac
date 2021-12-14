package DesignPattern.Singleton;

// Singleton : 한번의 하나의 객체(Instance)만 가질 수 있는 클래스
public class Main {
    public static void main(String[] args) {
        // 일반 클래스와 달리 싱글톤 클래스는 getInstance() 메소드로 정의
        SingletonClass s1 = SingletonClass.getInstance();
        SingletonClass s2 = SingletonClass.getInstance();
        SingletonClass s3 = SingletonClass.getInstance();

        System.out.println(s1.str);
        System.out.println(s2.str);
        System.out.println(s3.str); // 3 Lines의 My Singleton Class 출력

        System.out.println();
        s2.str = "No.2 Changed";

        System.out.println(s1.str);
        System.out.println(s2.str);
        System.out.println(s3.str); // Singleton 클래스는 하나의 인스턴스만 존재하고 바라보기에 s1, s2, s3의 str 모두 No.2 Changed로 출력된다
    }
}

class SingletonClass {
    // singleton instance 초기화
    private static SingletonClass singleton_instance = null;

    public String str;
    // 1. 생성자를 private로 만든다
    private SingletonClass() {
        str = "My Singleton Class";
    }

    // 이 싱글톤 클래스를 반환 유형으로하는 정적 메소드를 작성
    public static SingletonClass getInstance() {
        if(singleton_instance == null) {
            singleton_instance = new SingletonClass();
        }

        return singleton_instance;
    }
}
