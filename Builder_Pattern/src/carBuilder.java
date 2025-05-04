public class carBuilder {
    private String modelName = "Default Model";
    private String enginType = "Petrol";
    private String color = "White";
    private String transmission = "Manual";
    private Boolean sunroof = false;
    private Boolean infotainmentSystem = false;

    // For customization setter method

    public carBuilder setModelName(String modelName){
        this.modelName = modelName;
        return this;
    }

    public carBuilder setEnginType(String enginType){
        this.enginType = enginType;
        return this;
    }

    public carBuilder setColor(String color){
        this.color = color;
        return this;
    }

    public carBuilder setTransmission(String transmission){
        this.transmission = transmission;
        return this;
    }

    public carBuilder setSunroof(boolean sunroof){
        this.sunroof = sunroof;
        return this;
    }

    public carBuilder setInfotainmentSystem(boolean infotainmentSystem){
        this.infotainmentSystem = infotainmentSystem;
        return this;
    }

    public car build(){
        return new car(modelName,enginType,color,transmission,sunroof,infotainmentSystem);
    }
}
