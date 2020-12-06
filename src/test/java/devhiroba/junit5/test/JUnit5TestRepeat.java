package devhiroba.junit5.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class JUnit5TestRepeat {

    /**
     * テストを3回実施する
     */
    @RepeatedTest(3)
    void test1() {
        System.out.println("JUnit5TestRepeat test1");
    }

    /**
     * RepetitionInfo をパラメータで取得して現在の実行回数とトータル実行回数を取得できる
     */
    @RepeatedTest(3)
    void test2(RepetitionInfo repetitionInfo) {
        System.out.println("JUnit5TestRepeat test2");
        System.out.println(repetitionInfo.getCurrentRepetition() + "/" + repetitionInfo.getTotalRepetitions());
    }

    /**
     * "@RepeatedTest" の属性を利用してテストクラス名を変更できる
     */
    @DisplayName("JUnit5TestRepeat")
    @RepeatedTest(value = 3, name = "{displayName}, {currentRepetition}/{totalRepetitions}")
    void test3() {
        System.out.println("JUnit5TestRepeat test3");
    }

    /**
     * パラメータを渡してテストができる
     * パラメータの数分テストを実行する
     */
    @DisplayName("JUnit5TestRepeat")
    @ParameterizedTest(name = "{index} {displayName} testMsg={0}")
    @ValueSource(strings = {"A", "B", "C"})
    void test4(String testMsg) {
        System.out.println(testMsg);
    }

    /**
     * パラメータを渡してテストができる
     * パラメータの数分テストを実行する
     * Null と 空白をパラメータとして渡すこともできる
     */
    @DisplayName("JUnit5TestRepeat")
    @ParameterizedTest(name = "{index} {displayName} testMsg={0}")
    @ValueSource(strings = {"A", "B", "C"})
    @NullAndEmptySource
//    @NullSource
//    @EmptySource
    void test5(String testMsg) {
        System.out.println(testMsg);
    }

    /**
     * パラメータを渡してテストができる
     * パラメータの数分テストを実行する
     * CSV 形式でパラメータを渡すこともできる
     */
    @DisplayName("JUnit5TestRepeat")
    @ParameterizedTest(name = "{index} {displayName} testMsg={0}")
    @CsvSource({"1, 'A'", "2, 'B'", "3, 'C'"})
    void test6(Integer i, String s) {
        System.out.println(i + "/" + s);
    }
}
