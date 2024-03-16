package features;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.ReadContext;
import net.minidev.json.JSONArray;
import org.junit.Test;
import org.noear.snack.ONode;

/**
 * @author noear 2023/11/3 created
 */
public class JsonPathTest5 {
    @Test
    public void test1() {
        String json = "[{\"id\":0,\"treePath\":\"1\",\"a\":[{\"id\":1,\"treePath\":\"123\",\"subItem\":[{\"id\":3,\"treePath\":\"123\"}]}],\"b\":\"a\"},{\"id\":2}]";

        ReadContext context = JsonPath.parse(json);

        JSONArray tmp = context.read("$..*");
        System.out.println(tmp.toJSONString());
        assert tmp.size() == 14;

        ONode tmp2 = ONode.load(json).select("$..*");
        System.out.println(tmp2);
        assert tmp2.isArray();
        assert tmp2.count() == 14;
    }

    @Test
    public void test2() {
        String json = "[{\"id\":0,\"treePath\":\"1\",\"a\":[{\"id\":1,\"treePath\":\"123\",\"subItem\":[{\"id\":3,\"treePath\":\"123\"}]}],\"b\":\"a\"},{\"id\":2}]";

        ReadContext context = JsonPath.parse(json);

        JSONArray tmp = context.read("$..*[?(@.treePath)]");
        System.out.println(tmp);
        assert tmp.size() == 5;

        ONode tmp2 = ONode.load(json).select("$..*[?(@.treePath)]");
        System.out.println(tmp2);
        assert tmp2.isArray();
        assert tmp2.count() == 5;
    }

    @Test
    public void test3() {
        String json = "[{\"id\":0,\"treePath\":\"1\",\"a\":[{\"id\":1,\"treePath\":\"123\",\"subItem\":[{\"id\":3,\"treePath\":\"123\"}]}],\"b\":\"a\"},{\"id\":2}]";

        ReadContext context = JsonPath.parse(json);

        JSONArray tmp = context.read("$..[?(@.treePath)]");
        System.out.println(tmp);
        assert tmp.size() == 3;

        ONode tmp2 = ONode.load(json).select("$..[?(@.treePath)]");
        System.out.println(tmp2);
        assert tmp2.count() == 3;
    }

    @Test
    public void test4(){
        String json = "{\"request1\":{\"result\":[{\"relTickers\":[{\"tickerId\":1},{\"tickerId\":1.1}],\"accountId\":400006},{\"relTickers\":[{\"tickerId\":2},{\"tickerId\":2.2}]},{\"relTickers\":[{\"tickerId\":3}]},{\"relTickers\":[{\"tickerId\":4}]},{\"relTickers\":[{\"tickerId\":5}]},{\"relTickers\":[{\"tickerId\":6}]}]}}\n";

        ONode tmp;

         tmp = ONode.load(json).select("request1.result.relTickers");
        System.out.println(tmp);

        tmp = ONode.load(json).select("request1.result[0].relTickers[0].tickerId");
        System.out.println(tmp);
    }
}
