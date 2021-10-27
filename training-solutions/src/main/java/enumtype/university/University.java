package enumtype.university;

public enum University {

    BME("Budapesti Müszaki és Gazdaságtudományi Egyetem"), ELTE("Eötvös Lóránd Tudományegyetem"),
    SZTE("Szegedi Tudományegyetem"), DE("Debreceni Egyetem"), PTE("Pécsi Tudományegyetem");

    private final String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}