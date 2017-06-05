
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches
{
    public static void main( String args[] ){

        // 按指定模式在字符串查找
        String line2 = "This order was placed for QT3000! OK?";
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";
        String pattern2 = "(.*)";
        String pattern3 = "(\\.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);
        Pattern r2 = Pattern.compile(pattern2);
        Pattern r3 = Pattern.compile(pattern3);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        Matcher m2 = r2.matcher(line);
        Matcher m3 = r3.matcher(line2);
        //if (m.find( )) {
        //  System.out.println("Found value: " + m.group(0) );
        //    System.out.println("Found value: " + m.group(1) );
        //    System.out.println("Found value: " + m.group(2) );
        //    System.out.println("Found value: " + m.group(3) );
        //} else {
        //    System.out.println("NO MATCH");
        //}
        //System.out.println(m2.equals(m3));
        System.out.println(m2.find());
        System.out.println(m2.group());
        System.out.println(m3.find());
        System.out.println(m3.group());


    }
}
