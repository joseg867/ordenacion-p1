/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import model.ExtensionFileFilter;

/**
 * Clase que controla el filtro del FileChooser.
 * @author Gustavo Canul, Arandi Lopez, Ruben Espiritu, Ricardo Zaldivar
 */
public class ControlFilter
{
    ExtensionFileFilter filter;
/**
 * Constructor que recibe la descripciòn y extensiòn y la manda al filtro.
 * @param description
 * @param extension
 */
    public ControlFilter(String description, String extension)
    {
        filter = new ExtensionFileFilter(description,extension);
    }
/**
 * retorna el filtro.
 * @return filter.
 */
    public ExtensionFileFilter getFilter()
    {
        return filter;
    }
}
