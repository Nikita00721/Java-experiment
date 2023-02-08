package form;
import storage.Controller;
import storage.Forest;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Listener implements ActionListener {
    private Formik sf;
    public Listener(Formik sf){
        this.sf=sf;
        //sf.getDownloading();
        sf.getExitButton().addActionListener(this);
        sf.getAll().addActionListener(this);
        sf.getAll_al_herb().addActionListener(this);
        sf.getAll_alive().addActionListener(this);
        sf.getAll_herb().addActionListener(this);
        sf.getAll_al_pr().addActionListener(this);
        sf.getAll_pl().addActionListener(this);
        sf.getAll_pr().addActionListener(this);
        sf.getCr_herb().addActionListener(this);
        sf.getCr_pl().addActionListener(this);
        sf.getCr_pr().addActionListener(this);
        sf.getHerb().addActionListener(this);
        sf.getPr().addActionListener(this);
        sf.getFeed2().addActionListener(this);
        sf.getCreate().addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){

        String name = sf.getTextField1().getText();
        String m = sf.getTextField2().getText();
        if (sf.getHerb().isSelected()){
            sf.feedingMenuHerb();
        }
        if (sf.getPr().isSelected()){
            sf.feedingMenuPr();

        }

            if (e.getSource() == sf.getAll()) {
                sf.getTextAreaLogs1().setText(Forest.getInstance().showAll());
            }
            if (e.getSource() == sf.getAll_alive()) {
                sf.getTextAreaLogs1().setText(Forest.getInstance().showAlive());
            }
            if (e.getSource() == sf.getAll_al_pr()) {
                sf.getTextAreaLogs1().setText(Forest.getInstance().showAlivePredator());
            }
            if (e.getSource() == sf.getAll_al_herb()) {
                sf.getTextAreaLogs1().setText(Forest.getInstance().showAliveHerbivore());
            }
            if (e.getSource() == sf.getAll_herb()) {
                sf.getTextAreaLogs1().setText(Forest.getInstance().showHerbivore());
            }
            if (e.getSource() == sf.getAll_pl()) {
                sf.getTextAreaLogs1().setText(Forest.getInstance().showPlants());
            }
            if (e.getSource() == sf.getAll_pr()) {
                sf.getTextAreaLogs1().setText(Forest.getInstance().showPredator());
            }

            if (sf.getCr_pr().isSelected()){
                sf.creationMenuPr();
            }
        if (sf.getCr_pl().isSelected()){
            sf.creationMenuPl();
        }
        if (sf.getCr_herb().isSelected()){
            sf.creationMenuHerb();
        }



        if (sf.getCr_herb().isSelected() && e.getSource() == sf.getCreate()) {
            sf.creationMenuHerb();
            if (name.equals("") ) {
                throw new IllegalArgumentException("Введите корректные данные");}
                    try {
                        int m1 = Integer.parseInt(m);
                        if (m1 <= 0) {
                            throw new IllegalArgumentException("Введите корректные данные");
                        }
                        sf.getTextAreaLogs3().append("Травоядное животное появилось на свет: \n" + name + " с массой:" + m1 + "\n");
                        sf.getB2().add(name);
                        sf.getB4().add(name);
                        Forest.getInstance().createHerbivores(name, m1);
                    } catch (NumberFormatException exception) {
                        exception.getMessage();
                        sf.getTextAreaLogs3().append("\n Проверьте правильность введенных данных!\n");
                        exception.printStackTrace();

                    } catch (IllegalArgumentException ex) {
                        ex.getMessage();
                        ex.printStackTrace();
                        sf.getTextAreaLogs3().append("\n Проверьте правильность введенных данных!\n");

                    }
        }
                    if (sf.getCr_pr().isSelected() && e.getSource() == sf.getCreate()) {
                        if (name.equals("") ) {
                            throw new IllegalArgumentException("Введите корректные данные");}
                        try {
                            int m1 = Integer.parseInt(m);
                            if (m1 <= 0) {
                                throw new IllegalArgumentException("Введите корректные данные");
                            }
                            sf.getTextAreaLogs3().append("Хищное животное появилось на свет: \n" + name + " с массой:" + m1 + "\n");
                            sf.getB1().add(name);
                            Forest.getInstance().createPredator(name, m1);
                        } catch (NumberFormatException exception) {
                            exception.getMessage();
                            sf.getTextAreaLogs3().append("\n Проверьте правильность введенных данных!\n");
                            exception.printStackTrace();

                        } catch (IllegalArgumentException ex) {
                            ex.getMessage();
                            ex.printStackTrace();
                            sf.getTextAreaLogs3().append("\n Проверьте правильность введенных данных!\n");

                        }
                    }
                        if (sf.getCr_pl().isSelected() && e.getSource() == sf.getCreate()) {
                            if (name.equals("") ) {
                                throw new IllegalArgumentException("Введите корректные данные");
                            }
                            try {
                                int m1 = Integer.parseInt(m);
                                if (m1 <= 0) {
                                    throw new IllegalArgumentException("Введите корректные данные");
                                }
                                sf.getTextAreaLogs3().append("Растение каким-то образом возникло: \n" + name + " с массой:" + m1 + "\n");
                                sf.getB3().add(name);
                                Forest.getInstance().createPlants(name, m1);

                            } catch (NumberFormatException exception) {
                                exception.getMessage();
                                sf.getTextAreaLogs3().append("\n Проверьте правильность введенных данных!\n");
                                exception.printStackTrace();

                            } catch (IllegalArgumentException ex) {
                                ex.getMessage();
                                ex.printStackTrace();
                                sf.getTextAreaLogs3().append("\n Проверьте правильность введенных данных!\n");

                            }

                        }



                        if(e.getSource()==sf.getFeed2() && sf.getHerb().isSelected()){
                            if(Formik.getB3().getSelectedIndex()<0 || Formik.getB4().getSelectedIndex()<0)
                                sf.getTextAreaLogs2().append("\n Выберете поле, пожалуйста \n");
                            else
                            {
                                sf.getTextAreaLogs2().setText(Controller.feeding2(Formik.getB4().getSelectedItem(),Formik.getB3().getSelectedItem()));
                            sf.getB3().remove(Formik.getB3().getSelectedItem());

                        }
                        }
                         if(e.getSource()==sf.getFeed2() && sf.getPr().isSelected()) {
                             if (Formik.getB1().getSelectedIndex() < 0 || Formik.getB2().getSelectedIndex() < 0)
                                 sf.getTextAreaLogs2().append("\n Выберете поле, пожалуйста \n");
                             else {

                                 sf.getTextAreaLogs2().append(Controller.feeding1(Formik.getB1().getSelectedItem(),Formik.getB2().getSelectedItem()));
                                 sf.getB2().remove(Formik.getB2().getSelectedItem());
                                 sf.getB4().remove(Formik.getB4().getSelectedItem());
                             }
                         }

        if (e.getSource() == sf.getExitButton()) {
            try{
           Controller.exitBut();
            } catch (IOException e1){
                e1.getMessage();
                e1.printStackTrace();
            }


        }

                        }



                    }

