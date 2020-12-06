package devhiroba.junit5.domain;

public class ExceptionModel {

    public ExceptionModel() {
        throw new NullPointerException("assertThrows Test!!!");
    }
}
