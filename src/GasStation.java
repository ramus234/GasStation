public class GasStation {

    public static void main(String[] args) {
        FuelPump fuelPump1 = new FuelPump();
        FuelPump fuelPump2 = new FuelPump();
        fuelPump1.fillUp(40);
        fuelPump1.addGas(30);
        fuelPump2.fillUp(970);

        System.out.println(fuelPump2.getFuelCounter());
        System.out.println(fuelPump2.getFuelTank());
        System.out.println(fuelPump1.getTurnOver(10));
    }
}
