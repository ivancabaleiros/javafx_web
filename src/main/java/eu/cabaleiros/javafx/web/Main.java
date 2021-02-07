package eu.cabaleiros.javafx.web;

import eu.cabaleiros.javafx.web.modules.BorderStyle;
import eu.cabaleiros.javafx.web.modules.DefaultModuleBuilder;
import eu.cabaleiros.javafx.web.modules.WebModule;
import eu.cabaleiros.javafx.web.screen.ScreenBuilder;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.awt.*;
import java.net.URL;

/**
 * The type Main.
 * @author ivan.cabaleiros.eu
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane borderPane1 = new BorderPane();

        Scene scene = new Scene(borderPane1);

        primaryStage.setScene(scene);

        Dimension resolution = Toolkit.getDefaultToolkit().getScreenSize();
        double w = resolution.getWidth() * 0.7 + 20;
        double h = resolution.getHeight() * 0.7 + 20;


        ScreenBuilder pantallaBuilder = new ScreenBuilder();
        pantallaBuilder.h(h).w(w);

        DefaultModuleBuilder builderWeb = new DefaultModuleBuilder().conAlto(h * 0.5 - 10)
                .conAncho(w * 0.5 - 10)
                .conBorde(BorderStyle.SOLID, 1, "green");

        URL resource = this.getClass().getResource("file-example.html");
        WebModule a = new WebModule(builderWeb
                .withUrl("https://github.com/ivancabaleiros").X(0).Y(0));
        WebModule b = new WebModule(builderWeb
                .withUrl("http://ivan.cabaleiros.eu").X(w / 2 - 5).Y(0));
        WebModule c = new WebModule(builderWeb
                .withUrl("https://stackoverflow.com/").X(0).Y(h / 2 - 5));
        WebModule d = new WebModule(builderWeb
                .withUrl("file:" + resource.getPath()).X(w / 2 - 5).Y(h / 2 - 5));
        pantallaBuilder.addModule(a).addModule(b).addModule(c).addModule(d);

        borderPane1.getChildren().add(pantallaBuilder.build());


        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                Platform.exit();
                System.exit(0);
            }
        });

        primaryStage.setHeight(h + 22);
        primaryStage.setWidth(w);
        primaryStage.setTitle("eu.cabaleiros.javafx.example");
        primaryStage.show();
    }


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
