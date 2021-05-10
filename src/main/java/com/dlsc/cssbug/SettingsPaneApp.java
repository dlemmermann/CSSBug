package com.dlsc.cssbug;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class SettingsPaneApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        SettingsPane settingsPane = new SettingsPane();
        settingsPane.setOnClose(() -> primaryStage.close());

        AnchorPane anchorPane = new AnchorPane(settingsPane);
        anchorPane.getStyleClass().add("editor");
        AnchorPane.setTopAnchor(settingsPane, 0d);
        AnchorPane.setBottomAnchor(settingsPane, 0d);
        AnchorPane.setLeftAnchor(settingsPane, 0d);
        AnchorPane.setRightAnchor(settingsPane, 0d);

        Scene scene = new Scene(anchorPane);
        scene.getStylesheets().add(SettingsPaneApp.class.getResource("styles.css").toExternalForm());

        primaryStage.setTitle("SettingsPane");
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.centerOnScreen();
        primaryStage.show();

        Alert alert = new Alert(Alert.AlertType.WARNING, "The checkboxes look fine so far, but now we hide the stage and show it again, with the same UI / same UI instance.", ButtonType.NEXT);
        alert.showAndWait();

        primaryStage.hide();
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
