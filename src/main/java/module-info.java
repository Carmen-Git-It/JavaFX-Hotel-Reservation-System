module com.carmengitit.hotelreservation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.carmengitit.hotelreservation to javafx.fxml;
    exports com.carmengitit.hotelreservation;
    exports com.carmengitit.hotelreservation.controller;
    opens com.carmengitit.hotelreservation.controller to javafx.fxml;
}