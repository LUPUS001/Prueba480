public class Main {
    public static void main(String[] args) {
        DiscoDuro discoDuro = new DiscoDuro("Disco Local (C:)", 1000, "Archivos del Sistema", "HDD", "Seagate", 7200);
        Cd cd = new Cd("Cd de música", 700, "Música Rock", "CD", "Sony", 200);

        System.out.println("Información sobre el Disco Duro");
        System.out.println(discoDuro.informacion());
        System.out.println("Comportamientos disco duro");
        discoDuro.girar();
        discoDuro.almacenar("Fotos prácticas 480");
        discoDuro.leerDato();

        System.out.println("\nInformación sobre el CD");
        System.out.println(cd.informacion());
        System.out.println("Comportamientos CD");
        cd.girar();
        cd.almacenar("Por la boca vive el pez");
        cd.leerDato();

    }
}
