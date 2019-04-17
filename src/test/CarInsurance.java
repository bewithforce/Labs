package test;

class CarInsurance extends Insurance {
    int risk = 100;

    CarInsurance(int cost) {
        this.cost = cost;
    }

    @Override
    int getType() {
        return 2;
    }
}
