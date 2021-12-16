package polymorphism.architect;

public class PermitPlan extends SketchPlan implements Header {

    protected String nameOfClient;
    protected String addressOfBuilding;

    public PermitPlan(int pagesOfDocumentation, String title, String nameOfClient, String addressOfBuilding) {
        super(pagesOfDocumentation, title);
        this.nameOfClient = nameOfClient;
        this.addressOfBuilding = addressOfBuilding;
    }

    @Override
    public String getNameOfClient() {
        return nameOfClient;
    }

    @Override
    public String getAddressOfBuilding() {
        return addressOfBuilding;
    }

    public String getHeader() {
        StringBuilder sb = new StringBuilder("Projekt: ").append(title)
                .append("\nÜgyfél: ").append(nameOfClient)
                .append("\nCím: ").append(addressOfBuilding);
        return sb.toString();
    }

}
