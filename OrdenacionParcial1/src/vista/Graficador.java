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
import org.jfree.chart.ChartPanel;
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

    public Graficador(String titulo, String categoria, String tipoValor) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.tipoValor = tipoValor;
        dataset = new DefaultCategoryDataset();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipoValor() {
        return tipoValor;
    }

    public void setTipoValor(String tipoValor) {
        this.tipoValor = tipoValor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setData(double milis, String tipoTiempo, String sortType) {
        this.dataset.addValue(milis, tipoTiempo, sortType);
    }

    public DefaultCategoryDataset getDataset() {
        return dataset;
    }
    

    public void drawGraphics() {
        JFreeChart chart = ChartFactory.createBarChart(getTitulo(), getCategoria(), getTipoValor(), getDataset(), PlotOrientation.VERTICAL, true, true, false);
        ChartFrame frame = new ChartFrame(getTitulo(), chart);
        frame.pack();
        frame.setVisible(true);
    }
    

    
}//fin de Graficador
