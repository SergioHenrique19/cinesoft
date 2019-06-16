package repository;

public class Constants {
    private static String resourcePath()
    {
        String resourcePath = null;
        String basePath = System.getProperty("user.dir");
        switch (System.getProperty("os.name")) {
            case "Windows 10":  resourcePath = basePath + "\\database.db";
                break;
            default:  resourcePath = basePath + "/database.db";
                break;
        }
        return resourcePath;
    }
    public static String url = "jdbc:sqlite:"+resourcePath();
}
