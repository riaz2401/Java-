import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String strdate = formatter.format(date);
        System.out.println(strdate);

    }
}
