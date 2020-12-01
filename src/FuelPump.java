/**
 * The type Fuel pump.
 */
public class FuelPump {

    private static int fuelTank = 1000;
    private int fuelCounter = 0;

    /**
     * Gets fuel tank.
     *
     * @return int the current ammount of fuel in the tank
     */
    public int getFuelTank() {
        return fuelTank;
    }

    /**
     * Gets fuel counter.
     *
     * @return int the fuel counter
     */
    public int getFuelCounter() {
        return fuelCounter;
    }

    /**
     * Gets the turnover according to price.
     *
     * @param price the price per litre
     * @return int price*fuelcounter
     */
    public int getTurnOver(int price) {
        return price * fuelCounter;
    }

    /**
     * Adds gas to the fuelTank.
     *
     * @param gas the ammount of gas to fill in the fuelTank
     */
    public void addGas(int gas) {

        if (gas + fuelTank <= 1000) fuelTank += gas;
        else System.out.println("The fuel tank doesnt have space for that much!");
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
        } else System.out.println("Sorry, there's not enough gas in the fuel tank");
    }

}















