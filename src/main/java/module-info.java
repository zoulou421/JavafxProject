module com.formationkilo.javafxproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.graphics;
    requires javafx.base;


   /** requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;*/


   // requires eu.hansolo.toolboxfx;

    opens com.formationkilo.javafxproject to javafx.fxml;
    exports com.formationkilo.javafxproject;
}