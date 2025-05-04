public class car {
    private String modelName;
    private String enginType;
    private String color;
    private String transmission;
    private Boolean sunroof;
    private Boolean infotainmentSystem;

    // Constructor
    public car(String modelName, String enginType, String color, String transmission, Boolean sunroof, Boolean infotainmentSystem){
        this.modelName = modelName;
        this.enginType = enginType;
        this.color = color;
        this.transmission = transmission;
        this.sunroof = sunroof;
        this.infotainmentSystem = infotainmentSystem;
    }

    // To display car details
    public String toString(){
        return " Model Name: " + modelName +
                "\n Engin Type: " + enginType +
                "\n Color: " + color +
                "\n Transmission: " + transmission +
                "\n Sunroof: " + (sunroof ? "Yes" : "No") +
                "\n Infotainment System: " + (infotainmentSystem ? "Yes" : "No");
    }
}
