package Notes;

public class ComputerJava implements Electronic {
    private String name;
    private boolean isPowerOn;
    private boolean isBroken;

    public ComputerJava(String name, boolean isPowerOn, boolean isBroken) {
        this.name = name;
        this.isPowerOn = isPowerOn;
        this.isBroken = isBroken;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public boolean isBroken() {
        return isBroken;
    }

    @Override
    public void turnOff() {
        this.isPowerOn = false;
    }

    @Override
    public void turnOn() {
        if (this.isBroken && !this.isPowerOn) {
            this.isPowerOn = true;
            int chanceToFix = (int)Math.floor(Math.random() * 5);
            if(chanceToFix == 2){
                this.isBroken = false;
            }
        } else {
            this.isPowerOn = false;
        }
    }
}
