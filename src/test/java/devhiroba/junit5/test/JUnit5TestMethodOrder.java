package devhiroba.junit5.test;

import org.junit.jupiter.api.*;

/**
 * "@TestMethodOrder" と　"@Order" を使用して各テストの実行順番を制御できる
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class JUnit5TestMethodOrder {
    @Order(3)
    @Test
    void test1() {
        System.out.println(this);
        System.out.println("JUnit5TestMethodOrder test1");
    }
    @Order(2)
    @Test
    void test2() {
        System.out.println(this);
        System.out.println("JUnit5TestMethodOrder test2");
    }
    @Order(1)
    @Test
    void test3() {
        System.out.println(this);
        System.out.println("JUnit5TestMethodOrder test3");
    }
}
