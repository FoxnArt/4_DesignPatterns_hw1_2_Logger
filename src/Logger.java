import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    protected int num = 1;
    private static Logger logger = null;
    private SimpleDateFormat formater = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    private Logger() {}

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }
    public void log(String msg) {
        System.out.println("[" + formater.format(new Date()) + " " + num++ + "] " + msg);
    }
}
