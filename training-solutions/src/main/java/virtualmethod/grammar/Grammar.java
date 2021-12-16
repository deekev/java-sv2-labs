package virtualmethod.grammar;

public class Grammar {

    public static void main(String[] args) {

        Verb verb1 = new PhrasalVerb("dob", "el");
        System.out.println(verb1.getWord());

        Verb verb2 = new PhrasalVerbWithSuffix("dob", "el", "nak");
        System.out.println(verb2.getWord());

        Preposition verb3 = new PhrasalVerb("dob", "el");
        System.out.println(verb3.getPreposition());
        System.out.println(verb3.getWholeWord());

        Preposition verb4 = new PhrasalVerbWithSuffix("dob", "el", "nak");
        System.out.println(verb4.getPreposition());
        System.out.println(verb4.getWholeWord());

        PhrasalVerb verb5 = new PhrasalVerb("dob", "el");
        System.out.println(verb5.getWord());
        System.out.println(verb5.getPreposition());
        System.out.println(verb5.getWholeWord());

        PhrasalVerb verb6 = new PhrasalVerbWithSuffix("dob", "el", "nak");
        System.out.println(verb6.getWord());
        System.out.println(verb6.getPreposition());
        System.out.println(verb6.getWholeWord());

        Suffix verb7 = new PhrasalVerbWithSuffix("dob", "el", "nak");
        System.out.println(verb7.getSuffix());

        PhrasalVerbWithSuffix verb8 = new PhrasalVerbWithSuffix("dob", "el", "nak");
        System.out.println(verb8.getWord());
        System.out.println(verb8.getPreposition());
        System.out.println(verb8.getSuffix());
        System.out.println(verb8.getWholeWord());
    }
}