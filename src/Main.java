/*

-записать
--выбрать цель
----задача-подзадача?
-----как делить?
------можно условие добавить? - сначала; иначе дальше
----показать систему
-----если изменилось - сначала; иначе дальше
----повторять, пока не
---завершилась?
--разделить
--повторить
-проверить



цель, вопрос, проверка



принт - цель?
принт - подцель?
принт - чтодальше?



цель - с помощью чего выполнять?
вопрос - влияет ли это на что-то ещё?

цель - проверка
вопрос - вперед?

цель - инструмент
вопрос - можно создать?




добавить действие?

класс - действие
поле - номер, название, длительность
метод - добавить


класс - инструмент
поле - номер, название, действие
метод - действие, инструмент?

класс навык


класс - календарь
поле - шкала
метод - отображение (принт)_


цель
-достигнута - сохранить и сначала
-не достигнута - удалить и сначала

 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {



    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));

        new Calend();

/*
        Hierarchy h = new Hierarchy();

        for (int i = 0; i < 10; i++) {
        if (Hierarchy.hierarchy != null) System.out.println("Текущая иерархия " + Hierarchy.hierarchy + "\n Новая цель?");
        else System.out.println("Новая цель?");

        String target = rdr.readLine();
            if (!(target.equals(" "))) {
                System.out.println();
            System.out.println("Цель " + target + " выполнена?");
            String t = rdr.readLine();
            if (!(t.equals(" ")) ) h.addHierarchy(target);
        }   else break;
        }
*/

//        double s = Math.random()*100;
//
//            if (s > 50) s -= (s / 10);
//            else s += s / 10;
//
//            System.out.println("i = " + s);
//        }
    }


}


class Hierarchy {
    public static String hierarchy;
    static String Action;


    public void addHierarchy(String target) {

        hierarchy += " -> " + target;
    }

    public void getHierarchy() {

       System.out.println("Система: \n" + hierarchy);
    }

}

class Action {
      static int id;
      String name;
      Gadget method;                                //связанный инструмент
      int time;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    Gadget getMethod() {
        return method;
    }

    void setMethod(Gadget method) {
        this.method = method;
    }

    void getAction () {
        System.out.println(name + " by> " + method + " for " + time + " calendar scales");
    }
    Action() {
      id++;
      this.setName("Action #" + id);
      this.setMethod(new Gadget());
      this.time = (int)Math.round(Math.random()*2+1);
     // this.getAction();
      Calend.alltime += this.time;
    }

}

class Gadget {
    static int id;
    String name;
    Action action;                             //связанные действия

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    Gadget() {
        id++;
        this.setName("Gadget_" + id);
    }
}

class Calend {
    String scale;
    static int number;
    static int alltime;

    Calend(){
        number++;
        int h = 0;   //часы
        int d = 0;

        for (int i = 1; i < 31; i++) {

            System.out.print(i + " >");

            for (int j = 0; j < 24; j++) {
                System.out.print(" " + j + " |");
            }
            System.out.println();

        }



      /*
        System.out.println("Calend1:");
        for (int i = 0; i < 2; i++) {
            Action a = new Action();

            for (int j = 0; j < a.time; j++) {

                System.out.print("[" + h++ + "|--->");
            }
            //System.out.println();
            //a.getAction();

            //System.out.println("---");
        }      */
    }

    void setScale(String scale) {
        this.scale = scale;
    }

    String getScale() {
        return scale;
    }
}