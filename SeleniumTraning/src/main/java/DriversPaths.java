public enum DriversPaths {

    Chrome(".\\src\\main\\resources\\Drivers\\32bit\\chromedriver.exe"),
    FireFox32(".\\src\\main\\resources\\Drivers\\32bit\\geckodriver.exe"),
    FireFox64(".\\src\\main\\resources\\Drivers\\64bit\\geckodriver.exe"),
    IE32(".\\src\\main\\resources\\Drivers\\32bit\\IEDriverServer.exe"),
    IE64(".\\src\\main\\resources\\Drivers\\64bit\\IEDriverServer.exe"),
//    Edge(".\src\\main\\resources\\Drivers\\32bit\\chromedriver.exe"),
    HtmlUnit(".\\src\\main\\resources\\Drivers\\32bit\\chromedriver.exe");

    private final String path;

    DriversPaths(String path) {
        this.path = path;
    }

    public String getPath() {
        return this.path;
    }
}
