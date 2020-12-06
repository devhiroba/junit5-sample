package devhiroba.junit5.domain;

public class TimeoutModel {
    public TimeoutModel(Integer time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
