/*class TabelDataKontak*/
package database;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class DataTabel extends AbstractTableModel{
    private List<DataMahasiswa> list = new ArrayList<DataMahasiswa>();

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
        case 0 : return list.get(rowIndex).getNama();
        case 1 : return list.get(rowIndex).getAlamat();
        case 2 : return list.get(rowIndex).getprogramStudi();
        case 3 : return list.get(rowIndex).getEmail();
        case 4 : return list.get(rowIndex).getUsername();
        case 5 : return list.get(rowIndex).getPassword();
        default : return null;
    }
   }
    
    @Override
    public String getColumnName(int kolom){
        switch(kolom){
        case 0 : return "Nama";
        case 1 : return "Alamat";
        case 2 : return "Program Studi";
        case 3 : return "Email";
        case 4 : return "Username";
        case 5 : return "Password";
        default : return null;
        }
    }
    public void add(DataMahasiswa mahasiswa){
        list.add(mahasiswa);
        fireTableRowsInserted(getRowCount(), getColumnCount());
    }

    public void delete(int i, int baris){
        list.remove(i);
        fireTableRowsDeleted(i, baris);
    }

    public DataMahasiswa get(int baris){
        return (DataMahasiswa) list.get(baris);
    }
}
