
package Entity;


public class PembeliEntity extends AbstractEntity {
    private String notelp;

    public PembeliEntity(String nama, String password,String alamat) {
        super(nama, password);
        this.notelp = notelp;
    }
    @Override
    public String getNama() {
        return nama;
    }
    public String getNotelp() {
        return notelp;
    }
    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }
}
