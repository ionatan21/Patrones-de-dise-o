/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author barri
 */
public class iteratormethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<RecordPerson> person = new ArrayList<>();
        person.add(new RecordPerson("dilan", "palacios", "zamora ", "kilometro 1"));
        person.add(new RecordPerson("lucas ", "pala", "zamo ", "metro 1"));
        System.out.println(personselect(person));

    }

    private static String personselect(ArrayList<RecordPerson> person) {
        String list = "";
        Iterator<RecordPerson> inte = person.iterator();
        while (inte.hasNext()) {
            list += inte.next().toString();
        }
        return list;
    }
}
