package devhiroba.junit5.test;

import org.junit.jupiter.api.*;

public class JUnit5Test {

    @Test
    void test1() {
        System.out.println("JUnit5Test test1");
    }

    @Test
    void test2() {
        System.out.println("JUnit5Test test2");
    }

    /**
     * "@Disabled"
     * テストを実行しない
     * JUnit4 では @Ignore
     */
    @Test
    @Disabled("テスト不要")
    void test3() {
        System.out.println("JUnit5Test test2");
    }

    /**
     *
     */
    @DisplayName("aaa")
    @Test
    void test4() {
        System.out.println("JUnit5Test test4");
    }

    /**
     * JUnit5Test クラスのテストが実行される前に1回のみ実行
     * 必ず static
     * JUnit4 では @BeforeClass
     */
    @BeforeAll
    static void beforeAll() {
        System.out.println("JUnit5Test beforeAll");
    }

    /**
     * JUnit5Test クラスのテストが実行された後に1回のみ実行
     * 必ず static
     * JUnit4 では @AfterClass
     */
    @AfterAll
    static void afterAll() {
        System.out.println("JUnit5Test afterAll");
    }

    /**
     * 各テストが実行される前に実行
     * Junit4 では @Before
     */
    @BeforeEach
    void beforeEach() {
        System.out.println("JUnit5Test beforeEach");
    }

    /**
     * 各テストが実行された後に実行
     * JUnit4 では @After
     */
    @AfterEach
    void afterEach() {
        System.out.println("JUnit5Test afterEach");
    }
}
