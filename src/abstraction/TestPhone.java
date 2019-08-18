package abstraction;

public class TestPhone
{
    public static void main(String[] args)
    {
        Phone iphoneX = new Iphone();
        iphoneX.shape();
        iphoneX.powerOn();
        iphoneX.speaker();
        iphoneX.powerOff();

        Iphone iphoneXS = new Iphone();
        iphoneXS.color();
        iphoneXS.powerOn();
        iphoneXS.powerOff();
        iphoneXS.speaker();

        SmartPhone i6 = new Iphone();
        i6.bluetooth();
        i6.display();
        i6.videoChat();

        Iphone i7 = new Iphone();
        i7.chargable();
        i7.powerOn();
        i7.powerOff();
    }
}
