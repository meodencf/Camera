
package camera;

import java.util.Scanner;

public class main {
    public static void main(String[] agrs){
        quanlyCamera2 ds =new quanlyCamera2();
        System.out.println("---chon loai Camera    ---");
        System.out.println("---nhap 1.CameraCompact---");
        System.out.println("---nhap 2.CameraDSLR   ---");
        System.out.println("---nhap 0.thoat        ---");
        Scanner sc = new Scanner(System.in);   
        int chon = sc.nextInt();
       
            switch(chon){
                   
                case 1:{ 
                    ds.nhapCameraCompact();
                    break;
                }
                case 2:{
                    ds.nhapCameraDSLR();
                    break;
                }
                case 3:{
                    ds.xuat();
                    break;
                }
                case 4:{
                    ds.TongDoanhThuTungLoai();
                    break;
                }
            }
    }   
}
