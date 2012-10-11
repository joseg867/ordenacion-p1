package model;
import java.io.*;
import javax.swing.filechooser.FileFilter;

/**
 * Clase que establece el filtro para la busqueda de tipo de archivos a leer
 * @author GustavoCanul, NoeCob,  ArandiLopez
 */
public class ExtensionFileFilter extends FileFilter implements Serializable
{
    String description;
    String extension;
/**
 * Constructor donde decibe la descripciòn y extension y las asigana a atributos locales
 * @param description
 * @param extension
 */
    public ExtensionFileFilter(String description, String extension)
    {
        this.description = description;
        this.extension = extension.toLowerCase();
    }
 /**
  * retorna la descripciòn.
  * @return descripciòn
  */
    @Override
    public String getDescription()
    {
        return description;
    }
/**
 * Mètodo que recive el archivo, checa el nombre y extrae el tipo de archivo.
 * @param file
 * @return
 */
    public String getExtension(File file)
    {
	if(file != null)
        {
	    String filename = file.getName();
	    int i = filename.lastIndexOf('.');
	    if(i > 0 && i < filename.length()-1)
            {
		return filename.substring(i+1).toLowerCase();
	    }
	}
	return null;
    }
/**
 * Mètodo recibe un archivo y checa si es valido el archivo con la extension determinada.
 * @param file
 * @return
 */
    @Override
    public boolean accept(File file)
    {
        if(file != null)
        {
	    if(file.isDirectory())
            {
		return true;
	    }
	    String ext = getExtension(file);
	    if(ext != null && ext.toLowerCase().equals(extension)) 
            {
		return true;
	    }
	}
	return false;
    }
     
}
