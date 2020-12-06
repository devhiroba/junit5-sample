package devhiroba.junit5.test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class JUnit5TestTag {

    /**
     * "@Tag" を付けてテストの実行可否を制御できる
     * 例えば、時間のかかるテストには "slow" という文字列を設定してci環境でのみ実行させることも可能
     * IntelliJ でテストする時は Edit Configurations の　Test kind を　Tag に変更してテストする
     * Build 時のテストの時には build.gradle に設定が必要
     */
    @Test
    @Tag("fast")
    void test1() {
        System.out.println("JUnit5TestTag test1");
    }

    @Test
    @Tag("fast")
    void test2() {
        System.out.println("JUnit5TestTag test2");
    }

    @Test
    @Tag("fast")
    void test3() {
        System.out.println("JUnit5TestTag test3");
    }

    @Test
    @Tag("slow")
    void test4() {
        System.out.println("JUnit5TestTag test4");
    }
}
