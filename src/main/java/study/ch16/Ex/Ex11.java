package study.ch16.Ex;

class Appconfig {
    private static Appconfig instance;
    private String appName;
    private String version;

    private Appconfig () {}

    public static Appconfig getInstance() {
        if (instance == null) instance = new Appconfig();
        return instance;
    }

    public void setAppName(String name) {this.appName = name;}
    public String getAppName() {return appName;}
    public void setVersion(String v) {this.version = v;}

    public void printConfig() {
        System.out.println(appName + "v" + version);
    }
}

public class Ex11 {
}
