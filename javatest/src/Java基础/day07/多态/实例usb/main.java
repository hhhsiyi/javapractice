package Java基础.day07.多态.实例usb;

public class main {
    public static void main(String[] args) {
        Computer com = new Computer();

        com.powerOn();
        Mouse m = new Mouse();
        Usb usb = new Mouse();//向上转型
        com.useDevice(usb);
        Keyboard usb1 = new Keyboard();
        // com.useDevice(new Keyboard());
        com.useDevice(usb1);

        //要求是usb，结果给了keyboard，他就会自动转型成usb然后使用

        com.powerOff();
    }

    public static void action(Usb u) {
        if (u instanceof Mouse) {
            Mouse m = (Mouse) u;
            //((Mouse) u).click();
            m.click();
        }
        if (u instanceof Keyboard) {
//            Keyboard k = (Keyboard) u;
//            k.tyep();
            ((Keyboard) u).tyep();
        }

    }
}
