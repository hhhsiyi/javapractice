package Java基础.day07.多态.实例usb;

public class Computer {
    public void powerOn()
    {
        System.out.println("开机");
    }
    public void powerOff()
    {
        System.out.println("关机");
    }
    public  void useDevice(Usb usb)
    {
        usb.open();

        if (usb instanceof Mouse) {
            Mouse m = (Mouse) usb;
            //((Mouse) u).click();
            m.click();
        }
        if (usb instanceof Keyboard) {
//            Keyboard k = (Keyboard) u;
//            k.tyep();
            ((Keyboard) usb).tyep();
        }
        usb.close();
    }

}
