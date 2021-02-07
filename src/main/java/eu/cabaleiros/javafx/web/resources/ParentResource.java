package eu.cabaleiros.javafx.web.resources;


/**
 * The type Parent resource.
 * @author ivan.cabaleiros.eu
 */
public abstract class ParentResource implements Resource {
    private String path;

    /**
     * Instantiates a new Parent resource.
     *
     * @param path the path
     */
    public ParentResource(String path) {
        this.path = path;
    }

    /**
     * Gets path.
     *
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets path.
     *
     * @param path the path
     */
    public void setPath(String path) {
        this.path = path;
    }

}
