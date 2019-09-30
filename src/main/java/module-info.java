module afterburner.fx {
    requires javafx.base;
    requires javafx.fxml;
    requires javafx.graphics;

    requires javax.inject;
    requires java.annotation;

    exports com.airhacks.afterburner.configuration;
    exports com.airhacks.afterburner.injection;
    exports com.airhacks.afterburner.views;
}