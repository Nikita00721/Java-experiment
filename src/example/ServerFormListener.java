package example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class ServerFormListener implements ActionListener {
    private ServerForm sf;
    public ServerFormListener(ServerForm sf){
        this.sf=sf;
        sf.getStartButton().addActionListener(this);
        sf.getStopButton().addActionListener(this);
        sf.getExitButton().addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        String host=sf.getHostTextField().getText();
        String port=sf.getPortTextField().getText();

        if(e.getSource()== sf.getStartButton()){
            System.out.println("Нажата кнопка <Старт>!");
            sf.getTextAreaLogs().append("\n Нажата кнопка <Старт>!");
            try{
                int port1 = Integer.parseInt(port);

                if((port1<=0) || (port1>65535))
                    throw new IllegalArgumentException("Ошибка. Порт неправильно задан");

                if (host==null)
                    throw new IllegalArgumentException("Ошибка. Хост неправильно задан");

                sf.startServer();
                System.out.println("Сервер запущен!");
                sf.getTextAreaLogs().append("\n Сервер запущен!");

            }
            catch(NumberFormatException exception){
                System.out.println("Порт должен быть целым числом!Сервер не запущен"+ exception.getMessage());
                sf.getTextAreaLogs().append("\n Порт или хост должен быть целым числом!Сервер не запущен");
                exception.printStackTrace();

            }
            catch(IllegalArgumentException ex){
                System.out.println("Порт должен быть в диапозоне от 0 до 655535"+ ex.getMessage());
                sf.getTextAreaLogs().append("\n Порт должен быть в диапозоне от 0 до 655535");
                ex.printStackTrace();

            }
        }
             else  {
                System.out.println("Сервер не был запущен. Проверьте правильность введенных данных!");
            sf.getTextAreaLogs().append("\n Сервер не был запущен. Проверьте правильность введенных данных!");
            }



        if(e.getSource()==sf.getStopButton()){
            sf.stopServer();
                System.out.println("Сервер был остановлен!");
                sf.getTextAreaLogs().append("\n Сервер был остановлен!");
        }

        if(e.getSource()==sf.getExitButton()){
            System.exit(0);
        }

    }



}



