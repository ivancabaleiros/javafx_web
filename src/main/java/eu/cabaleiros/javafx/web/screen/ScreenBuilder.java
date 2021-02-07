package eu.cabaleiros.javafx.web.screen;

import eu.cabaleiros.javafx.web.modules.Module;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Screen builder.
 * @author ivan.cabaleiros.eu
 */
public class ScreenBuilder {
    /**
     * The H.
     */
    double h;
    /**
     * The W.
     */
    double w;
    /**
     * The Modules.
     */
    List<Module> modules;

    /**
     * Instantiates a new Screen builder.
     */
    public ScreenBuilder() {
        super();
        modules = new ArrayList<Module>();
    }

    /**
     * H screen builder.
     *
     * @param h the h
     * @return the screen builder
     */
    public ScreenBuilder h(double h) {
        this.h = h;
        return this;
    }

    /**
     * W screen builder.
     *
     * @param w the w
     * @return the screen builder
     */
    public ScreenBuilder w(double w) {
        this.w = w;
        return this;
    }

    /**
     * Add module screen builder.
     *
     * @param module the module
     * @return the screen builder
     */
    public ScreenBuilder addModule(Module module) {
        this.modules.add(module);
        return this;
    }


    /**
     * Build screen.
     *
     * @return the screen
     */
    public Screen build() {
        return new Screen(this);
    }
}
