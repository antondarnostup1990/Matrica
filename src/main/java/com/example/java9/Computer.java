package com.example.java9;

public class Computer implements Cloneable {

    public String cpu;
    public Integer ram;
    public int hdd;
    public int usb;
    public int videocard;
    private int videocard10;

    public Computer(String cpu, Integer ram, int hdd, int usb, int videocard) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.usb = usb;
        this.videocard = videocard;
    }

    public Computer() {
    }

    @Override
    public String toString() {
        return "PC{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", usb=" + usb +
                ", videocard=" + videocard +
                '}';
    }
    public String toString(String cpu, Integer ram, int hdd, int usb, int videocard) {
        return "PC{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", usb=" + usb +
                ", videocard=" + videocard +
                '}';
    }

    public String toString(String cpu) {
        return "PC{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", usb=" + usb +
                ", videocard=" + videocard +
                '}';
    }
    void srtr() {
        System.out.println("the morning does not begin with coffee");
    }


}
