package eu.cabaleiros.javafx.web.modules;

import javafx.scene.Node;
import javafx.scene.layout.BorderPane;


/**
 * The type Parent module.
 * @author ivan.cabaleiros.eu
 */
public abstract class ParentModule extends BorderPane implements Module {

    private String moduleId;
    private Node content;

    /**
     * Instantiates a new Parent module.
     *
     * @param builder the builder
     */
    public ParentModule(DefaultModuleBuilder builder) {
        this.content = builder.content;
        this.moduleId = builder.id;
        if (builder.border) {
            String cssStyleBorder = builder.getCssStyleBorder();
            if (cssStyleBorder != null) {
                this.setStyle(this.getStyle() + cssStyleBorder);
            } else {
            }
        }
        if (builder.background) {
            String cssStyleBackground = builder.getCssStyleBackground();
            if (cssStyleBackground != null) {
                this.setStyle(this.getStyle() + cssStyleBackground);
            } else {
            }
        }

        this.setLayoutX(builder.X);
        this.setLayoutY(builder.Y);

        if (builder.cssClass != null && !builder.cssClass.isEmpty()) {
            this.getStyleClass().add(builder.cssClass);
        }
        if (builder.stylesheet != null && !builder.stylesheet.isEmpty()) {
            this.getStylesheets().add(builder.stylesheet);
        }

        this.setPrefHeight(builder.h);
        this.setPrefWidth(builder.w);


        if (builder.content != null) {
            this.content = builder.content;
            this.setCenter(this.content);
        }
    }

    /**
     * Gets module id.
     *
     * @return the module id
     */
    public String getModuleId() {
        return moduleId;
    }

    /**
     * Sets module id.
     *
     * @param moduleId the module id
     */
    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * Gets content.
     *
     * @return the content
     */
    public Node getContent() {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(Node content) {
        this.content = content;
        this.setCenter(this.content);
    }

    public void setX(double x) {
        this.setLayoutX(x);
    }

    public void setY(double y) {
        this.setLayoutY(y);
    }

    /**
     * Gets x.
     *
     * @return the x
     */
    public double getX() {
        return this.getLayoutX();
    }

    /**
     * Gets y.
     *
     * @return the y
     */
    public double getY() {
        return this.getLayoutY();
    }
}
