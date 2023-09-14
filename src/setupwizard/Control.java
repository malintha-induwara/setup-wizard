/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package setupwizard;

/**
 *
 * @author SYREX
 */
public class Control {
    
    private Screen01 s1;
    private Screen02 s2;
    private Screen03 s3;
    private Screen04 s4;

    public Control() {
        s1=new Screen01();
        s2=new Screen02();
        s3=new Screen03();
        s4=new Screen04();
    }
    
    public void setsControl(Control control){
        s1.setControl(control);
        s2.setControl(control);
        s3.setControl(control);
        s4.setControl(control);
    }

    public void setS1Visible(boolean type) {
        s1.setVisible(type);
    }

    public void setS2Visible(boolean type) {
        s2.setVisible(type);
    }

    public void setS3Visible(boolean type) {
        s3.setVisible(type);
    }
    
    public void setS4Visible(boolean type) {
        s4.setVisible(type);
    }
 
}
