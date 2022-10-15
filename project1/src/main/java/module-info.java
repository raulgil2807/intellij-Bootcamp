module com.company.project1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.company.project1 to javafx.fxml;
    exports com.company.project1;
}