package practice.makoto;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class SubstringStuff {

    public static void main(String[] args) {

        String string = "Hello (world)!";

        ArrayList<String> stringArrayList = new ArrayList<String>(Arrays.asList(StringUtils.substringsBetween(string, "(", ")")));

        // list:
        //  world

        for (int i = 0; i < stringArrayList.size(); i++) {

            string = string.replaceFirst(stringArrayList.get(i), stringArrayList.get(i).toUpperCase());

        }

        System.out.println(string);

    }

}
