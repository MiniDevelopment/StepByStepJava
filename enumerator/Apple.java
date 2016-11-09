package enumerator;

enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland;

    private int price;

    Apple(int price) {
        this.price = price;
    }

    Apple() {
        this.price = -1;
    }

    int getPrice() {
        return this.price;
    }
}
