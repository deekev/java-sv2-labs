package stringconcat.nameconcat;

public class Name {

    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;


    public Name(String familyName, String givenName, String middleName, Title title){
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public Name(String familyName, String givenName, String middleName) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
    }

    public String concatNameWesternStyle(){
        String nameWesternStyle;
        if(title != null){
            nameWesternStyle = title.getTitle().concat(" ").concat(givenName).concat(" ");
        } else {
            nameWesternStyle = givenName.concat(" ");
        }

        if (middleName != null || "".equals(middleName)) {
            nameWesternStyle = nameWesternStyle.concat(middleName).concat(" ");
        }

        nameWesternStyle = nameWesternStyle.concat(familyName);
        return nameWesternStyle;
    }
    public String concatNameHungarianStyle(){
        String nameHungarianStyle;
        if(title != null){
            nameHungarianStyle = title.getTitle();
            nameHungarianStyle += " ";
            nameHungarianStyle += familyName;
            nameHungarianStyle += " ";
        } else {
            nameHungarianStyle = familyName;
            nameHungarianStyle += " ";
        }

        nameHungarianStyle += givenName;
        nameHungarianStyle += " ";

        if (middleName != null || "".equals(middleName)) {
            nameHungarianStyle += middleName;
            nameHungarianStyle += " ";
        }

        return nameHungarianStyle;
    }
}