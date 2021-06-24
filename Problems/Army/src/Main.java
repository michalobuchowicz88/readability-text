class Army {

    public static void createArmy() {
        // Implement this method
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();

        Unit newUnit = new Unit("Kassie");
        Unit newUnit1 = new Unit("Kass");
        Unit newUnit2 = new Unit("Kas");
        Unit newUnit3 = new Unit("Ka");
        Unit newUnit4 = new Unit("K");

        Knight newKnight = new Knight("Kass");
        Knight newKnight1 = new Knight("Kas");
        Knight newKnight2 = new Knight("Ka");

        General general = new General("Ka");

        Doctor doctor = new Doctor("Kassi");

        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);



    }

}