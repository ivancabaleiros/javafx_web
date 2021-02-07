package eu.cabaleiros.javafx.web.modules;

/**
 * The enum Border style.
 * @author ivan.cabaleiros.eu
 */
public enum BorderStyle {
    /**
     * Solid border style.
     */
    SOLID("solid");
    /**
     * The Css name.
     */
    String cssName;

    private BorderStyle(String cssName) {
        this.cssName = cssName;
    }

    /**
     * Gets css name.
     *
     * @return the css name
     */
    public String getCssName() {
        return cssName;
    }

    /**
     * Sets css name.
     *
     * @param cssName the css name
     */
    public void setCssName(String cssName) {
        this.cssName = cssName;
    }

}
