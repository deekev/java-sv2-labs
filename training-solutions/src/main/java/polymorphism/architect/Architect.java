package polymorphism.architect;

public class Architect {

    public static void main(String[] args) {

        Plan plan1 = new SketchPlan(254, "irodaház");
        System.out.println(plan1.getPagesOfDocumentation());

        Plan plan2 = new PermitPlan(254, "irodaház", "Nagy Iván",
                "3300 Eger, Rákóczi út 54.");
        System.out.println(plan2.getPagesOfDocumentation());

        Plan plan3 = new ConstructionPlan(254, "irodaház", "Nagy Iván",
                "3300 Eger, Rákóczi út 54.", 5);
        System.out.println(plan3.getPagesOfDocumentation());

        SketchPlan plan4 = new SketchPlan(254, "irodaház");
        System.out.println(plan4.getPagesOfDocumentation());
        System.out.println(plan4.getTitle());

        SketchPlan plan5 = new PermitPlan(254, "irodaház", "Nagy Iván",
                "3300 Eger, Rákóczi út 54.");
        System.out.println(plan5.getPagesOfDocumentation());
        System.out.println(plan5.getTitle());

        SketchPlan plan6 = new ConstructionPlan(254, "irodaház", "Nagy Iván",
                "3300 Eger, Rákóczi út 54.", 5);
        System.out.println(plan6.getPagesOfDocumentation());
        System.out.println(plan6.getTitle());

        Header plan7 = new PermitPlan(254, "irodaház", "Nagy Iván",
                "3300 Eger, Rákóczi út 54.");
        System.out.println(plan7.getNameOfClient());
        System.out.println(plan7.getAddressOfBuilding());

        Header plan8 = new ConstructionPlan(254, "irodaház", "Nagy Iván",
                "3300 Eger, Rákóczi út 54.", 5);
        System.out.println(plan8.getNameOfClient());
        System.out.println(plan8.getAddressOfBuilding());

        PermitPlan plan9 = new PermitPlan(254, "irodaház", "Nagy Iván",
                "3300 Eger, Rákóczi út 54.");
        System.out.println(plan9.getPagesOfDocumentation());
        System.out.println(plan9.getTitle());
        System.out.println(plan9.getNameOfClient());
        System.out.println(plan9.getAddressOfBuilding());
        System.out.println(plan9.getHeader());

        PermitPlan plan10 = new ConstructionPlan(254, "irodaház", "Nagy Iván",
                "3300 Eger, Rákóczi út 54.", 5);
        System.out.println(plan10.getPagesOfDocumentation());
        System.out.println(plan10.getTitle());
        System.out.println(plan10.getNameOfClient());
        System.out.println(plan10.getAddressOfBuilding());
        System.out.println(plan10.getHeader());

        ConstructionPlan plan11 = new ConstructionPlan(254, "irodaház", "Nagy Iván",
                "3300 Eger, Rákóczi út 54.", 5);
        System.out.println(plan11.getPagesOfDocumentation());
        System.out.println(plan11.getTitle());
        System.out.println(plan11.getNameOfClient());
        System.out.println(plan11.getAddressOfBuilding());
        System.out.println(plan11.getHeader());
        System.out.println(plan11.getSheetsOfConstructionDrawings());
    }
}