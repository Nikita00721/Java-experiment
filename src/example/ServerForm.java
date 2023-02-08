package example;

import java.awt.*;

public class ServerForm extends Frame{
    private Label hostLabel;
    private Label portLabel;
    private TextField hostTextField;
    private TextField portTextField;
    private Button stopButton;
    private Button startButton;
    private Button exitButton;
    private TextArea textAreaLogs;
    Frame w = new Frame("Example");

    public ServerForm(){
        setLayout(null);
        hostLabel = new Label("Хост");
        hostLabel.setBounds(100,40,30,25);
        portLabel = new Label("Порт");
        portLabel.setBounds(100,100,30,25);
        hostTextField = new TextField();
        hostTextField.setBounds(140,45,100,25);
        portTextField = new TextField();
        portTextField.setBounds(140,100,100,25);
        startButton = new Button("Старт");
        startButton.setBounds(300,40,40,25);
        stopButton = new Button("Стоп");
        stopButton.setBounds(350,40,40,25);
        exitButton = new Button("Выход");
        exitButton.setBounds(550,40,90,25);
        textAreaLogs = new TextArea();
        textAreaLogs.setBounds(10, 160, 750, 225);

        setLocationRelativeTo(null);
        setSize(800, 500);
        setTitle("Пример");


        add(hostLabel);
        add(portLabel);
        add(hostTextField);
        add(portTextField);
        add(startButton);
        add(stopButton);
        add(exitButton);
        add(textAreaLogs);

        stopServer();

        setVisible(true);
    }

    void stopServer(){
        hostTextField.setEnabled(true);
        portTextField.setEnabled(true);
        startButton.setEnabled(true);
        exitButton.setEnabled(true);
        stopButton.setEnabled(false);
    }
    void startServer(){
        hostTextField.setEnabled(false);
        portTextField.setEnabled(false);
        startButton.setEnabled(false);
        exitButton.setEnabled(false);
        stopButton.setEnabled(true);
    }

    public Label getHostLabel() {
        return hostLabel;
    }

    public void setHostLabel(Label hostLabel) {
        this.hostLabel = hostLabel;
    }

    public Label getPortLabel() {
        return portLabel;
    }

    public void setPortLabel(Label portLabel) {
        this.portLabel = portLabel;
    }

    public TextField getHostTextField() {
        return hostTextField;
    }

    public void setHostTextField(TextField hostTextField) {
        this.hostTextField = hostTextField;
    }

    public TextField getPortTextField() {
        return portTextField;
    }

    public void setPortTextField(TextField portTextField) {
        this.portTextField = portTextField;
    }

    public Button getStopButton() {
        return stopButton;
    }

    public void setStopButton(Button stopButton) {
        this.stopButton = stopButton;
    }

    public Button getStartButton() {
        return startButton;
    }

    public void setStartButton(Button startButton) {
        this.startButton = startButton;
    }

    public Button getExitButton() {
        return exitButton;
    }

    public void setExitButton(Button exitButton) {
        this.exitButton = exitButton;
    }

    public TextArea getTextAreaLogs() {
        return textAreaLogs;
    }

    public void setTextAreaLogs(TextArea textAreaLogs) {
        this.textAreaLogs = textAreaLogs;
    }

    public Frame getW() {
        return w;
    }

    public void setW(Frame w) {
        this.w = w;
    }
}
