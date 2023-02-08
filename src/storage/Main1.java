package storage;

import example.ServerForm;
import example.ServerFormListener;
import form.Listener;

import java.io.IOException;

public class Main1 {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        ServerForm sf= new ServerForm();
        ServerFormListener sf1=new ServerFormListener(sf);
    }
}
