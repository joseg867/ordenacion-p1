/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
 *
 * @author ArandiLopez
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
     *
     * @return
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     *
     * @param categoria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     *
     * @return
     */
    public String getTipoValor() {
        return tipoValor;
    }

    /**
     *
     * @param tipoValor
     */
    public void setTipoValor(String tipoValor) {
        this.tipoValor = tipoValor;
    }

    /**
     *
     * @return
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     *
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     *
     * @param milis
     * @param tipoTiempo
     * @param sortType
     */
    public void setData(double milis, String tipoTiempo, String sortType) {
        this.dataset.addValue(milis, tipoTiempo, sortType);
    }

    /**
     *
     * @return
     */
    public DefaultCategoryDataset getDataset() {
        return dataset;
    }
    

    /**
     *
     */
    public void drawGraphics() {
        JFreeChart chart = ChartFactory.createBarChart(getTitulo(), getCategoria(), getTipoValor(), getDataset(), PlotOrientation.VERTICAL, true, true, false);
        ChartFrame frame = new ChartFrame(getTitulo(), chart);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
    

    
}//fin de Graficador
