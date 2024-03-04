package org.example;
import jdepend.xmlui.JDepend;
import java.io.PrintWriter;
public class Main {
    public static void main(String[] args) throws Exception{
        JDepend depend =new JDepend(new PrintWriter("T:\\NguyenQuocTrung\\report.xml"));
        depend.addDirectory("T:\\NguyenQuocTrung\\Library-Assistant");
        depend.analyze();
        System.out.println("DONE");
    }
}