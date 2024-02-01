package ie.atu.productv4;

public class Software extends Product {

    private String song;

    public Software() {
        super();
        song = "";
        count++;
    }


    public void setVersion(String version) {
        this.song = version;
    }

    public String getVersion() {
        return song;
    }

    @Override
    public String toString() {
        return super.toString() + " " + song;
    }
}