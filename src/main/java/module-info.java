module com.example.learn.dockerjenkinsintegration {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.learn.dockerjenkinsintegration to javafx.fxml;
    exports com.example.learn.dockerjenkinsintegration;
}