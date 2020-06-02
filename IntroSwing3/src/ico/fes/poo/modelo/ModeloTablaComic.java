/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.modelo;

import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Diana Reynoso
 */
public class ModeloTablaComic implements TableModel{
    private ArrayList<Comic> data;

    public ModeloTablaComic() {
    }

    public ModeloTablaComic(ArrayList<Comic> data) {
        this.data = data;
    }
    
    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int i) {
        String columnName = "";
        switch (i) {
            case 0:
                columnName = "# de comic";
                break;
            case 1:
                columnName = "Edición";
                break;
            case 2:
                columnName = "Universo";
                break;
            case 3:
                columnName = "Editorial";
                break;
            case 4:
                columnName = "Personaje";
                break;
            case 5:
                columnName = "Título";
                break;
            case 6:
                columnName = "Precio $";
                break;
                
            default:
                columnName = "No disponible";
        }
        return columnName;
    }

    @Override
    public Class<?> getColumnClass(int i) {
        switch (i) {
            case 0:
                return Integer.class;
            case 1:
                return Integer.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
            case 6:
                return Float.class;
            default:
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return false;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Comic tmp = data.get(i);
        switch (i1) {
            case 0:
                return tmp.getNumeroComic();
            case 1:
                return tmp.getEdicion();  
            case 2:
                return tmp.getUniverso();
            case 3:
                return tmp.getEditorial();
            case 4:
                return tmp.getPersonaje();
            case 5:
                return tmp.getTitulo();
            case 6:
                return tmp.getPrecio();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object o, int i, int i1) {
        
    }

    @Override
    public void addTableModelListener(TableModelListener tl) {
        
    }

    @Override
    public void removeTableModelListener(TableModelListener tl) {
        
    }
    
    
}
