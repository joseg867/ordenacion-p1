package vista;

import controller.InternalSortController;
import java.awt.Rectangle;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Clase encargada de graficar los tiempos de ejecucion de los metodos de ordenamiento
 * @author GustavoCanul, NoeCob, ArandiLopez
 */
public class Graficador {

    private DefaultCategoryDataset dataset;
    private String titulo, categoria, tipoValor;

    /**
     *
     * @param titulo
     * @param categoria
     * @param tipoValor
     */
    public Graficador(String titulo, String categoria, String tipoValor) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.tipoValor = tipoValor;
        dataset = new DefaultCategoryDataset();
    }

    /**
     * Metodo encargado de devolver categoria
     * @return Categoria 
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Metodo encargado de inicializar los valores de categoria
     * @param categoria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Metodo encargado de devolver el tipo de valor
     * @return tipoValor
     */
    public String getTipoValor() {
        return tipoValor;
    }

    /**
     * Metodo encargado de inicializar tipoValor
     * @param tipoValor
     */
    public void setTipoValor(String tipoValor) {
        this.tipoValor = tipoValor;
    }

    /**
     * Metodo encargado de devolver el titulo
     * @return Titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Metodo que iniciliza titulo
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Metodo que inicializa los valores de Data 
     * @param milis
     * @param tipoTiempo
     * @param sortType
     */
    public void setData(double milis, String tipoTiempo, String sortType) {
        this.dataset.addValue(milis, tipoTiempo, sortType);
    }

    /**
     * Metodo que devuelve los valores puestos en datastet
     * @return dataset
     */
    public DefaultCategoryDataset getDataset() {
        return dataset;
    }
    

    /*
     * Metodo encargado de dibujar la grafica
     */
    public void drawGraphics() {
        JFreeChart chart = ChartFactory.createBarChart(getTitulo(), getCategoria(), getTipoValor(), getDataset(), PlotOrientation.VERTICAL, true, true, false);
        ChartFrame frame = new ChartFrame(getTitulo(), chart);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
    

    
}//fin de Graficador
