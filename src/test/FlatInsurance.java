package test;

class FlatInsurance extends Insurance {
    int risk = 1000;

    FlatInsurance(int cost) {
        this.cost = cost;
    }

    @Override
    int getType() {
        return 3;
    }
}
