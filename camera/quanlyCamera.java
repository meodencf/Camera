
package camera;

import static java.lang.Double.sum;
import java.util.ArrayList;
import java.util.Scanner;

public class quanlyCamera {
    ArrayList<Camera>listCamera;
    Scanner sc;
    Camera cx;
    int chon;
    public quanlyCamera(){
        super();
        listCamera =new ArrayList<Camera>();
        sc = new Scanner(System.in);        
    }
    
    public void nhap(int n){
        for(int i=0;i<n;i++){
            System.out.println("---chon loai Camera    ---");
            System.out.println("---nhap 1.CameraCompact---");
            System.out.println("---nhap 2.CameraDSLR   ---");
            System.out.println("---nhap 0.thoat        ---");
            chon= sc.nextInt();sc.nextLine();
       
            switch(chon){
                   
                case 1:{   
                    
                   String Macamera;
                   String Tencamera;
                   double doanhthu;
                   double Soluong;
                   float Dongia;           
                   String Hang;
                   
                    System.out.println("\nnhap ma camera : ");Macamera= sc.nextLine();
                    System.out.println("nhap ten camera : ");Tencamera=sc.nextLine();
                    System.out.println("nhap don gia : ");Dongia=sc.nextFloat();
                    System.out.println("nhap hang : ");Hang = sc.nextLine();sc.nextLine();
                    System.out.println("nhap doanh thu : ");doanhthu=sc.nextDouble();sc.nextLine();
                    System.out.println("nhap so luong : ");Soluong=sc.nextDouble();sc.nextLine();
                    cx = new CameraCompact(Macamera,Tencamera,doanhthu,Soluong,Hang,Dongia);
                    listCamera.add(cx);
                    System.out.println("ban da them camera");
                    
            }
            break;
            case 2: {
                
                   String Macamera;
                   String Tencamera;
                   double doanhthu;
                   double Soluong;
                   float Dongia;           
                   String Hang;
                   
                    System.out.println("\nnhap ma camera : ");Macamera= sc.nextLine();
                    System.out.println("nhap ten camera : ");Tencamera=sc.nextLine();
                    System.out.println("nhap don gia : ");Dongia=sc.nextFloat();
                    System.out.println("nhap hang san xuat : "); Hang=sc.nextLine();sc.nextLine();
                    System.out.println("nhap doanh thu : ");doanhthu=sc.nextDouble();sc.nextLine();
                    System.out.println("nhap so luong : ");Soluong=sc.nextDouble();sc.nextLine();
                    cx = new CameraDSLR(Macamera,Tencamera,doanhthu,Soluong,Hang,Dongia);
                    listCamera.add(cx);
                    System.out.println("ban da them camera"); 
            }
            break;
            default:
                System.exit(0);          
        }
    }
}
    public void xuat(){
        for(Camera cx :listCamera){
        System.out.println(cx.toString());
        }
    }
    public void TongDoanhThuTungLoai(){
        double DoanhthuCameracompact=0,DoanhthuCameraDSLR=0;
        for(Camera cx :listCamera){
            if(cx instanceof CameraCompact){
                DoanhthuCameracompact+=cx.getDoanhthu();
            }
            if(cx instanceof CameraDSLR){
                DoanhthuCameraDSLR+=cx.getDoanhthu();
            }    
        }
        System.out.println("doanh thu camera compact:"+DoanhthuCameracompact);
        System.out.println("doanh thu camera DSLR:"+DoanhthuCameraDSLR);
        System.out.println("tong doanh thu la :"+sum(DoanhthuCameracompact,DoanhthuCameraDSLR));
    }
}

