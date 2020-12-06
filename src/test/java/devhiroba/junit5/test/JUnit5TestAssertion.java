package devhiroba.junit5.test;

import devhiroba.junit5.domain.ExceptionModel;
import devhiroba.junit5.domain.TimeoutModel;
import devhiroba.junit5.domain.UserModel;
import org.junit.jupiter.api.Test;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class JUnit5TestAssertion {

    /**
     * test1()の場合、複数のテストを実行しているが、
     * 途中でエラーなった場合、その次のテストは実行しない
     */
    @Test
    void test1(){
        UserModel userModel_null = null;
        UserModel userModel = new UserModel();

        /**
         * Null の場合 OK
         */
        assertNull(userModel_null);
        /**
         * NotNull の場合 OK
         */
        assertNotNull(userModel);
        /**
         * 期待値と実際の結果が一致する場合 OK
         * テストエラーの場合に出力するメッセージの設定の可能
         */
        assertEquals("japan2020", userModel.getId(), () -> "id が japan2020 ではない");
        /**
         * 期待値と実際の結果が一致しない場合 OK
         */
        assertNotEquals("japan2019", userModel.getId());
        /**
         * 条件または値が True の場合 OK
         */
        assertTrue(userModel.getAge() > 10);
        /**
         * 想定した Exception が発生した場合 OK
         */
        assertThrows(NullPointerException.class, () -> new ExceptionModel());
        NullPointerException ex = assertThrows(NullPointerException.class, () -> new ExceptionModel());
        System.out.println(ex.getMessage());
        /**
         * 指定した時間を超過した場合 NG
         * TimeoutModel の中の処理が30ミリセカンドを超えた場合 NG
         * TimeoutModel の処理か終わるまで待機して処理が終わった後に処理時間を比較する
         */
        assertTimeout(Duration.ofMillis(30), () -> new TimeoutModel(20));
        /**
         * 指定した時間を超過した場合 NG
         * 指定した時間になると TimeoutModel の処理を待たずに NG にする
         */
        assertTimeoutPreemptively(Duration.ofMillis(30), () -> new TimeoutModel(20));
    }

    /**
     * test2()の場合、assertAll の中テストの途中でエラーがあっても全てのテストを実行する
     */
    @Test
    void test2(){
        UserModel userModel_null = null;
        UserModel userModel = new UserModel();

        assertAll(
            () -> assertNull(userModel_null),
            () -> assertNotNull(userModel),
            () -> assertEquals("japan2021", userModel.getId(), () -> "id が japan2020 ではない"), // ←エラーになる
            () -> assertNotEquals("japan2019", userModel.getId()),
            () -> assertTrue(userModel.getAge() > 10)
        );
    }
}
