package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Derivative {

    public static void main(String[] args) {
        List<Insurance> derivative;
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("how many insurances are in derivative?");
        int n = scanner.nextInt();
        derivative = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            System.out.println("input type and cost of insurance");
            System.out.println("1 -- life insurance\n2 -- car insurance\n3 -- flat insurance");
            int type = scanner.nextInt();
            int cost = scanner.nextInt();
            Insurance insurance;
            switch (type) {
                case 1:
                    insurance = new LifeInsurance(cost);
                    break;
                case 2:
                    insurance = new CarInsurance(cost);
                    break;
                case 3:
                    insurance = new FlatInsurance(cost);
                    break;
                default:
                    return;
            }
            derivative.set(i, insurance);
            sum += cost;
        }

        System.out.println("input diapason of search and type of insurance");
        int searchCostMin = scanner.nextInt();
        int searchCostMax = scanner.nextInt();
        int type = scanner.nextInt();
        List<Insurance> insurances = new LinkedList<>();
        for(Insurance insurance : derivative){
            if(insurance.getType() == type
                    && insurance.cost > searchCostMin
                    && insurance.cost < searchCostMax){
                insurances.add(insurance);
            }
        }

        for(Insurance insurance : insurances){
            System.out.println("cost: " + insurance.cost);
        }
    }
}
