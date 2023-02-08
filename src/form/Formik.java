package form;
import javax.swing.*;
import java.awt.*;

import animalworld.Herbivores;
import storage.Forest;
public class Formik extends Frame {
    //public static final Formik formik = new Formik();
    private Label choice1,choice2, feeding,creation,view,line1,line2,name,mass;
    private TextField TextField1,TextField2;
    private Button all, all_al_herb, all_al_pr,all_herb,all_pr,all_pl,all_alive,create,feed2,downloading;
    private JRadioButton herb,pr,cr_herb,cr_pr,cr_pl;
    private static Choice b1,b2,b3,b4;
    private Button exitButton;
    private TextArea textAreaLogs1,textAreaLogs2,textAreaLogs3;

    Frame w = new Frame("Приложение");

    public Formik(){
        setLayout(null);
        choice1 = new Label("Выбрать кого покормить");
        choice2 = new Label("Выбрать чем");
        feeding = new Label("Покормить:");
        creation = new Label("Создать:");
        view = new Label("Посмотреть:");
        feed2 = new Button("Покормить");
        name = new Label("Имя");
        mass = new Label("Масса");
        TextField1 = new TextField();
        TextField2 = new TextField();
        all = new Button("Показать всех");
        all_alive = new Button("Показать всех живых");
        all_al_herb = new Button("Показать живых травоядных");
        all_al_pr = new Button("Показать живых хищников");
        all_herb = new Button("Показать всех травоядных");
        all_pl = new Button("Показать всю траву");
        all_pr = new Button("Показать всех хищников");
        create = new Button("Создать");
        cr_herb = new JRadioButton("Создать травоядного");
        cr_pl = new JRadioButton("Создать траву");
        cr_pr = new JRadioButton("Создать хищника");
        herb = new JRadioButton("Травоядного");
        pr = new JRadioButton("Хищника");
        exitButton = new Button("Выход");
        //downloading = new Button("Загрузка по умолчанию");
        line1 = new Label("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        line2 = new Label("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        b1 = new Choice();b2 = new Choice();b3 = new Choice();b4 = new Choice();
        //b1.add("Волк");b2.add("Заяц");b3.add("Трава");b4.add("Заяц");
        textAreaLogs1 = new TextArea();textAreaLogs2 = new TextArea();textAreaLogs3 = new TextArea();

        all.setBounds(60,50,100,25);
        all_al_herb.setBounds(60,80,180,25);
        all_al_pr.setBounds(165,50,150,25);
        all_herb.setBounds(245,80,160,25);
        all_pl.setBounds(60,110,150,25);
        all_pr.setBounds(215,110,160,25);
        all_alive.setBounds(140,140,160,25);
        exitButton.setBounds(540,780,90,25);
        textAreaLogs1.setBounds(430, 40, 200, 225);
        textAreaLogs2.setBounds(430, 295, 200, 225);
        textAreaLogs3.setBounds(255,549,390,225);
        line1.setBounds(10,265,700,25);
        line2.setBounds(10,521,700,25);
        view.setBounds(60,25,100,25);
        feeding.setBounds(60,295,100,25);
        pr.setBounds(60,325,100,25);
        herb.setBounds(190,325,140,25);
        choice1.setBounds(130,350,150,25);
        choice2.setBounds(160,430,150,25);
        b1.setBounds(40,375,150,25);
        b2.setBounds(40,460,150,25);
        b3.setBounds(190,460,150,25);
        b4.setBounds(190,375,150,25);
        feed2.setBounds(140,490,80,30);
        creation.setBounds(60,540,80,25);
        cr_herb.setBounds(60,580,190,25);
        cr_pl.setBounds(60,605,150,25);
        cr_pr.setBounds(60,630,150,25);
        create.setBounds(140,740,80,30);
        name.setBounds(60,675,40,25);
        mass.setBounds(60,700,45,25);
        //downloading.setBounds(380,780,150,25);
        TextField1.setBounds(110,675,100,25);
        TextField2.setBounds(110,700,100,25);


        setLocationRelativeTo(null);
        setSize(660, 860);
        setTitle("Приложение");


        add(all);
        add(all_alive);
        add(all_al_herb);
        add(all_al_pr);
        add(all_herb);
        add(all_pl);
        add(all_pr);
        add(line1); add(line2);
        add(view);
        add(feeding);add(feed2);
        add(pr);
        add(herb);
        add(creation);add(create);
        add(cr_herb);add(cr_pl);add(cr_pr);
        add(choice1);
        add(choice2);
        add(TextField1);add(TextField2);
        add(textAreaLogs2);add(textAreaLogs1);add(textAreaLogs3);
        add(name);add(mass);
        add(exitButton);
        add(b1);add(b2);add(b3);add(b4);


        ButtonGroup b1= new ButtonGroup();
        b1.add(herb);
        b1.add(pr);
        ButtonGroup b2=new ButtonGroup();
        b2.add(cr_herb);
        b2.add(cr_pr);
        b2.add(cr_pl);




        setVisible(true);
    }


    void feedingMenuHerb(){
        herb.setSelected(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        pr.setSelected(false);
        b1.setEnabled(false);
        exitButton.setEnabled(true);
        b2.setEnabled(false);
    }
    void feedingMenuPr(){
        b3.setEnabled(false);
        b4.setEnabled(false);
        herb.setSelected(false);
        pr.setSelected(true);
        b1.setEnabled(true);
        exitButton.setEnabled(true);
        b2.setEnabled(true);
    }
    void creationMenuHerb(){
        cr_herb.setSelected(true);
        cr_pl.setSelected(false);
        cr_pr.setSelected(false);
        exitButton.setEnabled(true);
    }
    void creationMenuPr(){
        cr_herb.setSelected(false);
        cr_pl.setSelected(false);
        cr_pr.setSelected(true);
        exitButton.setEnabled(true);
    }
    void creationMenuPl(){
        cr_herb.setSelected(false);
        cr_pl.setSelected(true);
        cr_pr.setSelected(false);
        exitButton.setEnabled(true);
    }

    public Frame getW() {
        return w;
    }

    public void setW(Frame w) {
        this.w = w;
    }

    public Label getChoice1() {
        return choice1;
    }

    public void setChoice1(Label choice1) {
        this.choice1 = choice1;
    }

    public Label getChoice2() {
        return choice2;
    }

    public void setChoice2(Label choice2) {
        this.choice2 = choice2;
    }

    public Label getFeed() {
        return feeding;
    }

    public void setFeed(Label feed) {
        this.feeding = feed;
    }

    public Label getCreation() {
        return creation;
    }


    public void setDownloading(Button downloading) {
        this.downloading = downloading;
    }

    public void setCreation(Label creation) {
        this.creation = creation;
    }

    public Label getView() {
        return view;
    }

    public void setView(Label view) {
        this.view = view;
    }

    public Label getLine1() {
        return line1;
    }

    public void setLine1(Label line1) {
        this.line1 = line1;
    }

    public Label getLine2() {
        return line2;
    }

    public void setLine2(Label line2) {
        this.line2 = line2;
    }


    public static Choice getB1() {
        return b1;
    }

    public static void setB1(Choice b1) {
        Formik.b1 = b1;
    }

    public static Choice getB2() {
        return b2;
    }

    public static void setB2(Choice b2) {
        Formik.b2 = b2;
    }

    public static Choice getB3() {
        return b3;
    }

    public static void setB3(Choice b3) {
        Formik.b3 = b3;
    }

    public static Choice getB4() {
        return b4;
    }

    public static void setB4(Choice b4) {
        Formik.b4 = b4;
    }

    public void setName(Label name) {
        this.name = name;
    }

    public Label getMass() {
        return mass;
    }

    public void setMass(Label mass) {
        this.mass = mass;
    }

    public TextField getTextField1() {
        return TextField1;
    }

    public void setTextField1(TextField textField1) {
        TextField1 = textField1;
    }

    public TextField getTextField2() {
        return TextField2;
    }

    public void setTextField2(TextField textField2) {
        TextField2 = textField2;
    }

    public Button getAll() {
        return all;
    }

    public void setAll(Button all) {
        this.all = all;
    }

    public Button getAll_al_herb() {
        return all_al_herb;
    }

    public void setAll_al_herb(Button all_al_herb) {
        this.all_al_herb = all_al_herb;
    }

    public Button getAll_al_pr() {
        return all_al_pr;
    }

    public void setAll_al_pr(Button all_al_pr) {
        this.all_al_pr = all_al_pr;
    }

    public Button getAll_herb() {
        return all_herb;
    }

    public void setAll_herb(Button all_herb) {
        this.all_herb = all_herb;
    }

    public Button getAll_pr() {
        return all_pr;
    }

    public void setAll_pr(Button all_pr) {
        this.all_pr = all_pr;
    }

    public Button getAll_pl() {
        return all_pl;
    }

    public void setAll_pl(Button all_pl) {
        this.all_pl = all_pl;
    }

    public Button getAll_alive() {
        return all_alive;
    }

    public void setAll_alive(Button all_alive) {
        this.all_alive = all_alive;
    }

    public Button getCreate() {
        return create;
    }

    public void setCreate(Button create) {
        this.create = create;
    }

    public Button getFeed2() {
        return feed2;
    }

    public void setFeed2(Button feed2) {
        this.feed2 = feed2;
    }

    public JRadioButton getHerb() {
        return herb;
    }

    public void setHerb(JRadioButton herb) {
        this.herb = herb;
    }

    public JRadioButton getPr() {
        return pr;
    }

    public void setPr(JRadioButton pr) {
        this.pr = pr;
    }

    public JRadioButton getCr_herb() {
        return cr_herb;
    }

    public void setCr_herb(JRadioButton cr_herb) {
        this.cr_herb = cr_herb;
    }

    public JRadioButton getCr_pr() {
        return cr_pr;
    }

    public void setCr_pr(JRadioButton cr_pr) {
        this.cr_pr = cr_pr;
    }

    public JRadioButton getCr_pl() {
        return cr_pl;
    }

    public void setCr_pl(JRadioButton cr_pl) {
        this.cr_pl = cr_pl;
    }



    public Button getExitButton() {
        return exitButton;
    }

    public void setExitButton(Button exitButton) {
        this.exitButton = exitButton;
    }

    public TextArea getTextAreaLogs1() {
        return textAreaLogs1;
    }

    public void setTextAreaLogs1(TextArea textAreaLogs1) {
        this.textAreaLogs1 = textAreaLogs1;
    }

    public TextArea getTextAreaLogs2() {
        return textAreaLogs2;
    }

    public void setTextAreaLogs2(TextArea textAreaLogs2) {
        this.textAreaLogs2 = textAreaLogs2;
    }

    public TextArea getTextAreaLogs3() {
        return textAreaLogs3;
    }

    public void setTextAreaLogs3(TextArea textAreaLogs3) {
        this.textAreaLogs3 = textAreaLogs3;
    }
}

