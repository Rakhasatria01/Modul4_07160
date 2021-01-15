
package Model;
import Entity.AdminEntity;
import java.util.ArrayList;

public class AdminModel implements ModelInterface{
    private ArrayList<AdminEntity> penjualEntityArrayList;
    
    public AdminModel() {
        penjualEntityArrayList = new ArrayList<AdminEntity>();
    }
    public void inserPenjual(AdminEntity penjual) {
        penjualEntityArrayList.add(penjual);
    }
     public void view() {
        for (AdminEntity penjualEntity : penjualEntityArrayList) {
            System.out.println(penjualEntity.getNama());
            System.out.println(penjualEntity.getPassword());
            System.out.println(penjualEntity.getBios());
        }
    }

    @Override
    public int cekData(String nama, String password) {
        int loop = 0;
       for (AdminEntity penjualEntity : penjualEntityArrayList) {
            if (penjualEntity.getNama().equals(nama) && penjualEntity.getPassword().equals(password)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }
    public AdminEntity showDataPenjual(int index) {
        return penjualEntityArrayList.get(index);
    }
     
}
