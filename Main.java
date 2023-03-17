public class Main {
    public static void main(String[] args) {
        Peternakan bebek = new Peternakan("Bebek", 25, "Telur", "Butir", 2);
        bebek.setVaksin(2.5);

        Peternakan unta = new Peternakan();
        unta.setBinatang("Unta");
        unta.setJumlah(7);
        unta.setHasil("Susu", "liter", 5);
        unta.setVaksin(2);

        Peternakan domba = new Peternakan("Domba", 10 , "Bulu", "kg", 4);
        domba.setVaksin(1.5);

        Peternakan.display();
    }
}
