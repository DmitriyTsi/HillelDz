package Hillel_Dmitriy_Tsyhanok_DZ_1_1;

public class Human {

String phamily;
String name;
String lastName;

String FullName;
String ShortName;


    String Human(String phamily2, String name2, String lastName2) {
        phamily = phamily2;
        name = name2;
        lastName = lastName2;


        if(phamily != null && name2 != null && lastName2 != null) {
            FullName = phamily + " " + name2.substring(0,1) + "." + lastName2.substring(0,1)+ ". ";
        }
            return FullName;
    }


    String Human (String phamily1, String name1) {
        Human (phamily1, name1, null);

        if(lastName == null) {
        ShortName = phamily1 + " " + name1.substring(0,1) + ". ";
        }
            return ShortName;
    }


}