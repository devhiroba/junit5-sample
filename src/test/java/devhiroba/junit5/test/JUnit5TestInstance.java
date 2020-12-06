package devhiroba.junit5.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

/**
 * JUnit は各テスト毎にインスタンスを作成する
 * ただ、@TestInstance(TestInstance.Lifecycle.PER_CLASS)をつけると
 * 各テスト単位ではなくクラスに一つだけインスタンスを作成する
 * 下記のテストだと count を共有することになるため
 * テスト毎に count が増加していく
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class JUnit5TestInstance {

    int count = 1;

    /**
     * クラスインスタンスを一つだけ作るため BeforeAll と AfterAll が static ではなくてもいい
     */
    @BeforeAll
    void beforeAll() {
        System.out.println(this);
        System.out.println(count++);
        System.out.println("JUnit5TestInstance beforeAll");
    }

    @AfterAll
    void afterAll() {
        System.out.println(this);
        System.out.println(count++);
        System.out.println("JUnit5TestInstance afterAll");
    }

    @Test
    void test1() {
        System.out.println(this);
        System.out.println(count++);
        System.out.println("JUnit5TestInstance test1");
    }

    @Test
    void test2() {
        System.out.println(this);
        System.out.println(count++);
        System.out.println("JUnit5TestInstance test2");
    }
}
