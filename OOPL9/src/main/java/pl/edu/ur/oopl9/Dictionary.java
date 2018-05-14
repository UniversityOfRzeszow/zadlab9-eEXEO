package pl.edu.ur.oopl9;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Dictionary
{

    public static void Dict()
    {
        Scanner imp = new Scanner(System.in);
        Map<String, String> dict = new HashMap<>();
        String temp = "";

        dict.put("tak", "yes");
        dict.put("nie", "no");
        dict.put("czesc", "hi");
        dict.put("mama", "mother");
        dict.put("tata", "father");
        dict.put("brat", "brother");
        dict.put("siostra", "sister");
        dict.put("dziecko", "child");
        dict.put("przyjaciel", "friend");
        dict.put("mieszkanie", "flat");
        dict.put("ptak", "bird");
        dict.put("pies", "dog");
        dict.put("kot", "cat");
        dict.put("chleb", "bread");
        dict.put("krzeslo", "chair");
        dict.put("swiatlo", "light");
        dict.put("twarz", "face");
        dict.put("recepta", "prescription");
        dict.put("lekarz", "doctor");
        dict.put("koniec", "end");


        do {
            System.out.println("Podaj słowo: ");
            temp = imp.nextLine();

            if (dict.containsKey(temp))
            {
                System.out.println("Angielski odpowiedik: " + dict.get(temp));
            }else
                {
                    if(temp.equalsIgnoreCase("koniec!"))
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("To słowo nie występuje w słowniku!");
                    }
                }

            System.out.println();
        } while(true);

    }

}
