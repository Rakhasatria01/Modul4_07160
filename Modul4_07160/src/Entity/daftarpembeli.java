
package Entity;

public class daftarpembeli {
    private PembeliEntity pembeli;
    private boolean isVerified;
    private int indexFilm;

    public daftarpembeli(PembeliEntity pembeli, boolean isVerified, int indexFilm) {
        this.pembeli = pembeli;
        this.isVerified = isVerified;
        this.indexFilm = indexFilm;
    }

    public PembeliEntity getPembeli() {
        return pembeli;
    }

    public void setPembeli(PembeliEntity pembeli) {
        this.pembeli = pembeli;
    }

    public boolean isIsVerified() {
        return isVerified;
    }

    public void setIsVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public int getIndexFilm() {
        return indexFilm;
    }

    public void setIndexBaju(int indexFilm) {
        this.indexFilm = indexFilm;
    }

}
