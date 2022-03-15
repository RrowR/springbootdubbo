import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

/**
 * @Author: Rrow
 * @Date: 2022/3/10 5:07 下午
 */
public class TestReddit {

    String str = "11331a13123124111";

    @Test
    void Test01(){
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        System.out.println(pattern.matcher(str).matches());
    }

    @Test
    void Test02(){
        System.out.println("str.length() = " + str.length());
    }

    @Test
    void Test03(){
        String str = "dfasqeq";
        String substring = str.substring(2, 5);
        System.out.println(substring);
    }
}
