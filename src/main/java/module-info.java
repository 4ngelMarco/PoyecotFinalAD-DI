module es.cheste.poyecotfinaladdi {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens es.cheste.poyecotfinaladdi to javafx.fxml;
    exports es.cheste.poyecotfinaladdi;
}