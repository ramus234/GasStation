/**
 * The type Fuel pump.
 */
public class FuelPump {

    private static int fuelTank = 1000;
    private int fuelCounter = 0;

    /**
     * Gets fuel tank.
     *
     * @return the current ammount of fuel in the tank
     */
    public int getFuelTank() {
        return fuelTank;
    }

    /**
     * Gets fuel counter.
     *
     * @return the fuel counter
     */
    public int getFuelCounter() {
        return fuelCounter;
    }

    /**
     * Get turnover int.
     *
     * @param price the price per litre
     * @return price*fuelcounter
     */
    public int getTurnOver(int price){
        return price*fuelCounter;
    }

    /**
     * Adds gas to the fuelTank.
     *
     * @param gas the gas
     */
    public void addGas(int gas) {
        if (gas + fuelTank <= 1000) fuelTank += gas;
        else System.out.println("too much gas");
    }

    /**
     * Fills up the customers car with amount of gas
     *
     * @param gas the gas
     */
    public void fillUp(int gas) {
        if (fuelTank - gas >= 0) {
            fuelTank -= gas;
            fuelCounter += gas;
        } else System.out.println("not enough gas in the tank");
    }
}
