public enum  KierSwiata {

    NORTH("północ"),
    EAST("zachód"),
    WEST("wschód"),
    SOUTH("południe");

    private final String kierunek;

    KierSwiata(String kierunek) {
        this.kierunek = kierunek;
    }

    public String getKierunek() {
        return kierunek;
    }
}
