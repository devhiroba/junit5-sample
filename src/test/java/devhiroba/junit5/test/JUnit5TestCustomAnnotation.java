package devhiroba.junit5.test;

public class JUnit5TestCustomAnnotation {
    /**
     * "@Test" と "@Tag("fast")" を付けたのと同じ効果
     */
    @CustomAnnotationFastTest
    void test1() {
        System.out.println("JUnit5TestCustomAnnotation test1");
    }

    @CustomAnnotationFastTest
    void test2() {
        System.out.println("JUnit5TestCustomAnnotation test2");
    }

    @CustomAnnotationFastTest
    void test3() {
        System.out.println("JUnit5TestCustomAnnotation test3");
    }

    /**
     * "@Test" と "@Tag("slow")" を付けたのと同じ効果
     */
    @CustomAnnotationSlowTest
    void test4() {
        System.out.println("JUnit5TestCustomAnnotation test4");
    }
}
