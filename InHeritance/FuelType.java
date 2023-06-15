class FuelType extends Vehicle{
    public String fuletype(String fuel){
        return fuel;
    }
        public static void main(String args[]){
            FuelType fueltype = new FuelType();
            fueltype.model("toyota");
            fueltype.year(2012);
            fueltype.fuletype("petrol");
            System.out.println("Model of car "+fueltype.model("toyota"));
            System.out.println("Year of car "+fueltype.year(2012));
            System.out.println("fueltype of car "+fueltype.fuletype("petrol"));
        }
    
}