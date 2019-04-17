package test;

class LifeInsurance extends Insurance {
    int risk = 10000;

    LifeInsurance(int cost) {
        this.cost = cost;
    }

    @Override
    int getType() {
        return 1;
    }
}
