package eu.cabaleiros.javafx.web.modules;

import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;


/**
 * The type Web module.
 * @author ivan.cabaleiros.eu
 */
public class WebModule extends ParentModule implements Module {
    private WebView view;
    private WebEngine engine;
    private String url;

    /**
     * Instantiates a new Web module.
     *
     * @param builder the builder
     */
    public WebModule(DefaultModuleBuilder builder) {
        super(builder);
        this.url = builder.url;
        view = new WebView();
        engine = view.getEngine();
        engine.load(this.url);
        view.setPrefSize(this.getPrefWidth(), this.getPrefHeight());
        this.setContent(view);
    }

    /**
     * Gets view.
     *
     * @return the view
     */
    public WebView getView() {
        return view;
    }

    /**
     * Sets view.
     *
     * @param view the view
     */
    public void setView(WebView view) {
        this.view = view;
    }

    /**
     * Gets engine.
     *
     * @return the engine
     */
    public WebEngine getEngine() {
        return engine;
    }

    /**
     * Sets engine.
     *
     * @param engine the engine
     */
    public void setEngine(WebEngine engine) {
        this.engine = engine;
    }

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     *
     * @param url the url
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
