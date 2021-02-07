package eu.cabaleiros.javafx.web.modules;


import javafx.scene.Node;

/**
 * The type Default module builder.
 * @author ivan.cabaleiros.eu
 */
public class DefaultModuleBuilder implements ModuleBuilder {

    /**
     * The Background color.
     */
    public String backgroundColor;
    /**
     * The Border color.
     */
    public String borderColor;
    /**
     * The Border size.
     */
    public float borderSize;
    /**
     * The Border style.
     */
    public BorderStyle borderStyle;
    /**
     * The Border.
     */
    public boolean border;
    /**
     * The Background.
     */
    public boolean background;
    /**
     * The Stylesheet.
     */
    public String stylesheet;
    /**
     * The Css class.
     */
    public String cssClass;
    /**
     * The Web.
     */
    public boolean web;
    /**
     * The Url.
     */
    public String url;
    /**
     * The Content.
     */
    public Node content;
    /**
     * The Id.
     */
    public String id;
    /**
     * The H.
     */
    public double h;
    /**
     * The W.
     */
    public double w;

    /**
     * The X.
     */
    public double X;
    /**
     * The Y.
     */
    public double Y;

    /**
     * Instantiates a new Default module builder.
     */
    public DefaultModuleBuilder() {
        super();
    }

    /**
     * Con fondo default module builder.
     *
     * @param color the color
     * @return the default module builder
     */
    public DefaultModuleBuilder conFondo(String color) {
        this.background = true;
        this.backgroundColor = color;
        return this;
    }

    /**
     * Con borde default module builder.
     *
     * @param estilo the estilo
     * @param ancho  the ancho
     * @param color  the color
     * @return the default module builder
     */
    public DefaultModuleBuilder conBorde(BorderStyle estilo, float ancho, String color) {
        this.border = true;
        this.borderColor = color;
        this.borderStyle = estilo;
        this.borderSize = ancho;
        return this;
    }

    /**
     * Con hoja de estilos default module builder.
     *
     * @param path the path
     * @return the default module builder
     */
    public DefaultModuleBuilder conHojaDeEstilos(String path) {
        this.stylesheet = path;
        return this;
    }

    /**
     * Con clase css default module builder.
     *
     * @param claseCss the clase css
     * @return the default module builder
     */
    public DefaultModuleBuilder conClaseCss(String claseCss) {
        this.cssClass = claseCss;
        return this;
    }

    /**
     * Sin border default module builder.
     *
     * @return the default module builder
     */
    public DefaultModuleBuilder sinBorder() {
        this.border = false;
        return this;
    }


    /**
     * With url default module builder.
     *
     * @param url the url
     * @return the default module builder
     */
    public DefaultModuleBuilder withUrl(String url) {
        this.web = true;
        this.url = url;
        return this;
    }

    /**
     * Con contenido default module builder.
     *
     * @param contenido the contenido
     * @return the default module builder
     */
    public DefaultModuleBuilder conContenido(Node contenido) {
        this.content = contenido;
        return this;
    }

    /**
     * Con id default module builder.
     *
     * @param id the id
     * @return the default module builder
     */
    public DefaultModuleBuilder conId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Con alto default module builder.
     *
     * @param alto the alto
     * @return the default module builder
     */
    public DefaultModuleBuilder conAlto(double alto) {
        this.h = alto;
        return this;
    }

    /**
     * Con ancho default module builder.
     *
     * @param ancho the ancho
     * @return the default module builder
     */
    public DefaultModuleBuilder conAncho(double ancho) {
        this.w = ancho;
        return this;
    }

    /**
     * X default module builder.
     *
     * @param x the x
     * @return the default module builder
     */
    public DefaultModuleBuilder X(double x) {
        this.X = x;
        return this;
    }

    /**
     * Y default module builder.
     *
     * @param y the y
     * @return the default module builder
     */
    public DefaultModuleBuilder Y(double y) {
        this.Y = y;
        return this;
    }

    /**
     * Build module.
     *
     * @return the module
     */
    public Module build() {
        Module modulo = null;
        if (web) {
            modulo = new WebModule(this);
        }
        return modulo;
    }

    /**
     * Gets css style border.
     *
     * @return the css style border
     */
    public String getCssStyleBorder() {
        String estilo = null;
        if (border) {
            String cssBorderStyle = "-fx-border-style:"
                    + this.borderStyle.cssName + ";";
            String cssBorderColor = "-fx-border-color:" + this.borderColor + ";";
            String cssBorderWidth = "-fx-border-width:" + this.borderSize
                    + "px;";
            estilo = cssBorderStyle + cssBorderColor + cssBorderWidth;
        }
        return estilo;
    }

    /**
     * Gets css style background.
     *
     * @return the css style background
     */
    public String getCssStyleBackground() {
        String estilo = null;
        if (background) {
            String cssBackgroundStyle = "-fx-background-color:"
                    + this.backgroundColor + ";";
            estilo = cssBackgroundStyle;
        }
        return estilo;
    }



    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DefaultModuleBuilder{");
        sb.append("backgroundColor='").append(backgroundColor).append('\'');
        sb.append(", borderColor='").append(borderColor).append('\'');
        sb.append(", borderSize=").append(borderSize);
        sb.append(", borderStyle=").append(borderStyle);
        sb.append(", border=").append(border);
        sb.append(", background=").append(background);
        sb.append(", stylesheet='").append(stylesheet).append('\'');
        sb.append(", cssClass='").append(cssClass).append('\'');
        sb.append(", web=").append(web);
        sb.append(", url='").append(url).append('\'');
        sb.append(", content=").append(content);
        sb.append(", id='").append(id).append('\'');
        sb.append(", h=").append(h);
        sb.append(", w=").append(w);
        sb.append(", X=").append(X);
        sb.append(", Y=").append(Y);
        sb.append('}');
        return sb.toString();
    }
}
