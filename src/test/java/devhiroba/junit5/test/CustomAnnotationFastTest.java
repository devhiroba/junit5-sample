package devhiroba.junit5.test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * "@Test" と "@Tag" をメタアノテーションとして使用した CustomAnnotationFastTest アノテーションを作成する
 */
@Target(ElementType.METHOD) // このアノテーションをメソッドで利用する
@Retention(RetentionPolicy.RUNTIME) // このアノテーション情報を RUNTIME まで維持する
@Test // @Test アノテーションを利用する
@Tag("fast") // "fast" Tag を付ける
public @interface CustomAnnotationFastTest {
}
