package devhiroba.junit5.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

/**
 * "@DisplayNameGeneration"
 * 全てのテストクラス名の _ を空白に変換する
 */
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class JUnit5TestDisplayName {

    @Test
    void test_no1(){
        System.out.println("JUnit5TestDisplayName test_no1");
    }

    @Test
    void test_no2(){
        System.out.println("JUnit5TestDisplayName test_no2");
    }

    /**
     * "@DisplayName"
     * クラス名の代わりに指定文字列を表示する
     */
    @Test
    @DisplayName("JUnit5TestDisplayName test_no3")
    void test_no3(){
        System.out.println("JUnit5TestDisplayName test_no3");
    }
}
