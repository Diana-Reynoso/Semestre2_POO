/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Diana Reynoso
 */
public class ModeloTablaReloj extends AbstractTableModel{
    private ArrayList<Reloj> data;

    public ModeloTablaReloj() {
    }

    public ModeloTablaReloj(ArrayList<Reloj> data) {
        this.data = data;
    }
    
    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columnName="";
        switch (columnIndex) {
            case 0:
                    columnName = "Marca";
                break;
            case 1:
                    columnName = "Color";
                break;
            case 2:
                    columnName = "Material";
                break;
            case 3:
                    columnName = "Extensible";
                break;
            case 4:
                    columnName = "Tipo";
                break;
            case 5:
                    columnName = "Analógico/digital";
                break;
            default:
                columnName="No disponible";
        }
        return columnName;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
            default:
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true ;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Reloj tmp = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tmp.getMarca();
            case 1:
                return tmp.getColor();
            case 2:
                return tmp.getMaterial();
            case 3:
                return tmp.getExtensible();
            case 4:
                return tmp.getTipo();
            case 5:
                return tmp.getAnaDig();
                    
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
         Reloj tmp = data.get(rowIndex);
         switch (columnIndex) {
            case 0:
                tmp.setMarca((String)aValue );
                break;
            case 1:
                tmp.setColor((String)aValue );
                break;
            case 2:
                tmp.setMaterial((String)aValue );
                break;
            case 3:
                tmp.setExtensible((String)aValue );
                break;
            case 4:
                tmp.setTipo((String)aValue );
                break;
            case 5:
                tmp.setAnaDig((String)aValue );
                break;
            default:
                throw new AssertionError();
        }
         data.set(rowIndex, tmp);
         this.fireTableCellUpdated(rowIndex, columnIndex);
    }    
    
    public void agregarReloj(Reloj r){
        data.add(r);
        this.fireTableDataChanged();
    }
}
