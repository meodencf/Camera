
package camera;


public class CameraDSLR extends Camera{
    private float Dongia;
    private String Hang;

    public CameraDSLR(String Macamera, String Tencamera, double doanhthu, double Soluong, String Hang, float Dongia) {
        super(Macamera, Tencamera, doanhthu, Soluong);
        this.Dongia = Dongia;
        this.Hang = Hang;
    }
    public void setDongia(float Dongia) {
        this.Dongia = Dongia;
    }

    public void setHang(String Hang) {
        this.Hang = Hang;
    }

    public float getDongia() {
        return Dongia;
    }

    public String getHang() {
        return Hang;
    }
    

     @Override
    public String toString(){
        return ""+super.toString()+"CameraCompact [dongia:"+Dongia+",hang:"+Hang+"]";
    }
}
