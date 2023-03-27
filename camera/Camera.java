
package camera;

public class Camera {
    private String Macamera,Tencamera;
    private double doanhthu,Soluong;

    public Camera(String Macamera, String Tencamera, double doanhthu, double Soluong) {
        this.Macamera = Macamera;
        this.Tencamera = Tencamera;
        this.doanhthu = doanhthu;
        this.Soluong = Soluong;
    }

    public String getMacamera() {
        return Macamera;
    }

    public String getTencamera() {
        return Tencamera;
    }

    public double getDoanhthu() {
        return doanhthu;
    }

    public double getSoluong() {
        return Soluong;
    }

    public void setMacamera(String Macamera) {
        this.Macamera = Macamera;
    }

    public void setTencamera(String Tencamera) {
        this.Tencamera = Tencamera;
    }

    public void setDoanhthu(double doanhthu) {
        this.doanhthu = doanhthu;
    }

    public void setSoluong(double Soluong) {
        this.Soluong = Soluong;
    }
    
    @Override
    public String toString(){
        return"Camera[Macamera:"+Macamera+",Tencamera:"+Tencamera+",Soluong:"+Soluong+"doanhthu:"+doanhthu +"]";
    }   
}
