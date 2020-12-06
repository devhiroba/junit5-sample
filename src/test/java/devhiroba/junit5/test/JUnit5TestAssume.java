package devhiroba.junit5.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class JUnit5TestAssume {

    /**
     * assumeTure() が True ではない場合、assumeTure() 以下は実行しない
     * この場合テスト結果も failed ではなく ignored になる
     * 環境変数を参照して開発環境でのみ実行するなどで利用できる
     */
    @Test
    void test1() {
        assumeTrue(true);
        System.out.println("JUnit5TestAssume true です!");
    }

    /**
     * 条件を満たした場合のみテストを実行する
     * 下記の場合は second test の中のテストは実行されない
     */
    @Test
    void test2() {
        // first test
        assumingThat(1 > 0, () -> {
            assertTrue(true, () -> "JUnit5TestAssume test2 first!");
            System.out.println("JUnit5TestAssume test2 first!");
        });
        // second test
        assumingThat(1 < 0, () -> {
            assertTrue(true, () -> "JUnit5TestAssume test2 second!");
            System.out.println("JUnit5TestAssume test2 second!");
        });
    }

    /**
     * 指定した OS のみテストを事項する
     */
    @Test
    @EnabledOnOs(OS.MAC)
    void test3() {
        System.out.println("JUnit5TestAssume test3!");
    }

    /**
     * 指定した OS ではテストを実行しない
     */
    @Test
    @DisabledOnOs({OS.MAC, OS.LINUX})
    void test4() {
        System.out.println("JUnit5TestAssume test4!");
    }

    /**
     * 指定した JRE バージョンの場合のみ実行
     */
    @Test
    @EnabledOnJre({JRE.JAVA_11, JRE.JAVA_12})
    void test5() {
        System.out.println("JUnit5TestAssume test5!");
    }

    /**
     * 取得した OS の環境変数 ENV の値が "DEV" の場合のみテストを実行する
     */
    @Test
    @EnabledIfEnvironmentVariable(named = "ENV", matches="DEV")
    void test6() {
        System.out.println("JUnit5TestAssume test6!");
    }
}
