
package camera;

import static java.lang.Double.sum;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



public class quanlyCamera2 {
    private ArrayList<Camera>listCamera;
    Scanner sc;
    Camera cx;
    private Object Conllections;
    public quanlyCamera2(){
        super();
        listCamera =new ArrayList<Camera>();
        sc = new Scanner(System.in);        
    }
    public void nhapCameraCompact(){
        String Macamera;
        String Tencamera;
        double doanhthu;
        double Soluong;
        float Dongia;
        String Hang;
        int yes=1;
            do{
                System.out.printf("nhap san pham thu %d:",yes);
                System.out.println("nhap ma camera : ");Macamera= sc.nextLine();sc.nextLine();
                System.out.println("nhap ten camera : ");Tencamera=sc.nextLine();
                System.out.println("nhap don gia : ");Dongia=sc.nextFloat();
                System.out.println("nhap hang : ");Hang = sc.nextLine();sc.nextLine();
                System.out.println("nhap doanh thu : ");doanhthu=sc.nextDouble();sc.nextLine();
                System.out.println("nhap so luong : ");Soluong=sc.nextDouble();sc.nextLine();
                cx = new CameraCompact(Macamera,Tencamera,doanhthu,Soluong,Hang,Dongia);
                
                listCamera.add(cx);
                
                System.out.println("ban da them than cong san phan"); 
                
                System.out.println("Ban muon them san pham (1.tiep;0.thoat)");
                yes = sc.nextInt();
                sc.nextLine();      
                if(Macamera==null || Macamera.equals("")){
                break;
                }
                yes++;
            }while(true);
                    
    }
    public void nhapCameraDSLR(){
        String Macamera;
        String Tencamera;
        double doanhthu;
        double Soluong;
        float Dongia;
        String Hang;
        int yes=2;
            do{
                
                System.out.println("nhap ma camera : ");Macamera= sc.nextLine();sc.nextLine();
                System.out.println("nhap ten camera : ");Tencamera=sc.nextLine();
                System.out.println("nhap don gia : ");Dongia=sc.nextFloat();
                System.out.println("nhap hang : ");Hang = sc.nextLine();sc.nextLine();
                System.out.println("nhap doanh thu : ");doanhthu=sc.nextDouble();sc.nextLine();
                System.out.println("nhap so luong : ");Soluong=sc.nextDouble();sc.nextLine();
                cx = new CameraDSLR(Macamera,Tencamera,doanhthu,Soluong,Hang,Dongia);
                
                listCamera.add(cx);
                
                System.out.println("ban da them than cong san phan"); 
                
                System.out.println("Ban muon them san pham (1.tiep;0.thoat)");
                yes = sc.nextInt();
                
            }while(yes == 2);
                    
    }
    
    public void xuat(){
        System.out.println("---------------------");
        for(Camera cx :listCamera){
        System.out.println(cx.toString());    
        }
        System.out.println("----------------------");
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
    /*public void XapxepSoluong(){
        Collections.sort(listCamera, ( a,b)->{ a.compareTo(b);});
        xuat();
    } 
    */
}

