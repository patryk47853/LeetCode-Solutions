class ParkingSystem {

    int small, medium, big;

    public ParkingSystem(int big, int medium, int small) {
        this.small = small;
        this.medium = medium;
        this.big = big;
    }

    public boolean addCar(int carType) {
        if(carType == 3 && small-- > 0) return true;
        if(carType == 2 && medium-- > 0) return true;
        if(carType == 1 && big-- > 0) return true;
        else return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */