package eu.cabaleiros.javafx.web.screen;

import java.util.ArrayList;
import java.util.List;

import eu.cabaleiros.javafx.web.modules.Module;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


/**
 * The type Screen.
 * @author ivan.cabaleiros.eu
 */
public class Screen extends Pane {
    /**
     * The Modules.
     */
    public List<Module> modules;

    /**
     * Instantiates a new Screen.
     *
     * @param builder the builder
     */
    public Screen(ScreenBuilder builder) {
        this.setHeight(builder.h);
        this.setWidth(builder.w);
        if (builder.modules != null && !builder.modules.isEmpty()) {
            this.modules = new ArrayList<Module>();
            this.modules.addAll(builder.modules);
            for (Module node : builder.modules) {
                this.getChildren().add((BorderPane) node);
            }
        }
    }
}
