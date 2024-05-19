module com.formationkilo.javafxproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires  transitive javafx.graphics;
    requires transitive javafx.base;
    requires javafx.graphicsEmpty;
    //requires eu.hansolo.fx.countries;

    //requires  eu.hansolo.fx.countries;


    /** requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;*/


    opens com.formationkilo.javafxproject to javafx.fxml;
    exports com.formationkilo.javafxproject;
    //exports com.formationkilo.javafxproject to javafx.graphics;

}