package features;

import _models.Point;
import org.junit.Test;
import org.noear.snack.ONode;

/**
 * @author noear 2021/5/19 created
 */
public class ThrowableTest2 {
    String json = "{\"@type\":\"java.lang.IllegalArgumentException\",\"localizedMessage\":\"coin_type,amount,tran_num\",\"message\":\"coin_type,amount,tran_num\",\"stackTrace\":[{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.noear.srww.uapi.validation.ValidatorFailureHandlerSrwwImp\",\"fileName\":\"ValidatorFailureHandlerSrwwImp.java\",\"lineNumber\":51,\"methodName\":\"onFailure\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.noear.solon.extend.validation.ValidatorManager\",\"fileName\":\"ValidatorManager.java\",\"lineNumber\":200,\"methodName\":\"failureDo\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.noear.solon.extend.validation.ValidatorManager\",\"fileName\":\"ValidatorManager.java\",\"lineNumber\":186,\"methodName\":\"validateDo\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.noear.solon.extend.validation.ValidatorManager\",\"fileName\":\"ValidatorManager.java\",\"lineNumber\":160,\"methodName\":\"validate\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.noear.solon.extend.validation.ValidatorManager\",\"fileName\":\"ValidatorManager.java\",\"lineNumber\":146,\"methodName\":\"handle\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.noear.solon.extend.validation.ContextValidateInterceptor\",\"fileName\":\"ContextValidateInterceptor.java\",\"lineNumber\":16,\"methodName\":\"handle\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.noear.solon.core.handle.Action\",\"fileName\":\"Action.java\",\"lineNumber\":184,\"methodName\":\"lambda$invoke0$0\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.noear.solon.core.handle.Action\",\"fileName\":\"Action.java\",\"lineNumber\":239,\"methodName\":\"handleDo\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.noear.solon.core.handle.Action\",\"fileName\":\"Action.java\",\"lineNumber\":182,\"methodName\":\"invoke0\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.noear.solon.core.handle.Action\",\"fileName\":\"Action.java\",\"lineNumber\":161,\"methodName\":\"invoke\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.noear.solon.core.handle.Action\",\"fileName\":\"Action.java\",\"lineNumber\":140,\"methodName\":\"handle\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.noear.solon.core.route.RouterHandler\",\"fileName\":\"RouterHandler.java\",\"lineNumber\":68,\"methodName\":\"handleOne\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.noear.solon.core.route.RouterHandler\",\"fileName\":\"RouterHandler.java\",\"lineNumber\":42,\"methodName\":\"handle\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.noear.solon.SolonApp\",\"fileName\":\"SolonApp.java\",\"lineNumber\":501,\"methodName\":\"doFilter\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.noear.solon.core.handle.FilterChainNode\",\"fileName\":\"FilterChainNode.java\",\"lineNumber\":23,\"methodName\":\"doFilter\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.noear.solon.SolonApp\",\"fileName\":\"SolonApp.java\",\"lineNumber\":490,\"methodName\":\"doHandle\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.noear.solon.SolonApp\",\"fileName\":\"SolonApp.java\",\"lineNumber\":512,\"methodName\":\"tryHandle\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.noear.solon.extend.servlet.SolonServletHandler\",\"fileName\":\"SolonServletHandler.java\",\"lineNumber\":30,\"methodName\":\"service\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"javax.servlet.http.HttpServlet\",\"fileName\":\"HttpServlet.java\",\"lineNumber\":750,\"methodName\":\"service\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.eclipse.jetty.servlet.ServletHolder\",\"fileName\":\"ServletHolder.java\",\"lineNumber\":791,\"methodName\":\"handle\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.eclipse.jetty.servlet.ServletHandler\",\"fileName\":\"ServletHandler.java\",\"lineNumber\":550,\"methodName\":\"doHandle\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.eclipse.jetty.server.handler.ScopedHandler\",\"fileName\":\"ScopedHandler.java\",\"lineNumber\":233,\"methodName\":\"nextHandle\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.eclipse.jetty.server.session.SessionHandler\",\"fileName\":\"SessionHandler.java\",\"lineNumber\":1624,\"methodName\":\"doHandle\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.eclipse.jetty.server.handler.ScopedHandler\",\"fileName\":\"ScopedHandler.java\",\"lineNumber\":233,\"methodName\":\"nextHandle\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.eclipse.jetty.server.handler.ContextHandler\",\"fileName\":\"ContextHandler.java\",\"lineNumber\":1435,\"methodName\":\"doHandle\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.eclipse.jetty.server.handler.ScopedHandler\",\"fileName\":\"ScopedHandler.java\",\"lineNumber\":188,\"methodName\":\"nextScope\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.eclipse.jetty.servlet.ServletHandler\",\"fileName\":\"ServletHandler.java\",\"lineNumber\":501,\"methodName\":\"doScope\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.eclipse.jetty.server.session.SessionHandler\",\"fileName\":\"SessionHandler.java\",\"lineNumber\":1594,\"methodName\":\"doScope\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.eclipse.jetty.server.handler.ScopedHandler\",\"fileName\":\"ScopedHandler.java\",\"lineNumber\":186,\"methodName\":\"nextScope\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.eclipse.jetty.server.handler.ContextHandler\",\"fileName\":\"ContextHandler.java\",\"lineNumber\":1350,\"methodName\":\"doScope\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.eclipse.jetty.server.handler.ScopedHandler\",\"fileName\":\"ScopedHandler.java\",\"lineNumber\":141,\"methodName\":\"handle\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.eclipse.jetty.server.handler.HandlerWrapper\",\"fileName\":\"HandlerWrapper.java\",\"lineNumber\":127,\"methodName\":\"handle\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.eclipse.jetty.server.Server\",\"fileName\":\"Server.java\",\"lineNumber\":516,\"methodName\":\"handle\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.eclipse.jetty.server.HttpChannel\",\"fileName\":\"HttpChannel.java\",\"lineNumber\":388,\"methodName\":\"lambda$handle$1\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.eclipse.jetty.server.HttpChannel\",\"fileName\":\"HttpChannel.java\",\"lineNumber\":633,\"methodName\":\"dispatch\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.eclipse.jetty.server.HttpChannel\",\"fileName\":\"HttpChannel.java\",\"lineNumber\":380,\"methodName\":\"handle\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.eclipse.jetty.server.HttpConnection\",\"fileName\":\"HttpConnection.java\",\"lineNumber\":279,\"methodName\":\"onFillable\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.eclipse.jetty.io.AbstractConnection$ReadCallback\",\"fileName\":\"AbstractConnection.java\",\"lineNumber\":311,\"methodName\":\"succeeded\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.eclipse.jetty.io.FillInterest\",\"fileName\":\"FillInterest.java\",\"lineNumber\":105,\"methodName\":\"fillable\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.eclipse.jetty.io.ChannelEndPoint$1\",\"fileName\":\"ChannelEndPoint.java\",\"lineNumber\":104,\"methodName\":\"run\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.eclipse.jetty.util.thread.QueuedThreadPool\",\"fileName\":\"QueuedThreadPool.java\",\"lineNumber\":882,\"methodName\":\"runJob\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"classLoaderName\":\"app\",\"className\":\"org.eclipse.jetty.util.thread.QueuedThreadPool$Runner\",\"fileName\":\"QueuedThreadPool.java\",\"lineNumber\":1036,\"methodName\":\"run\",\"nativeMethod\":false},{\"@type\":\"java.lang.StackTraceElement\",\"className\":\"java.lang.Thread\",\"fileName\":\"Thread.java\",\"lineNumber\":832,\"methodName\":\"run\",\"moduleName\":\"java.base\",\"moduleVersion\":\"14.0.2\",\"nativeMethod\":false}]}";

    @Test
    public void test() {
        Object tmp = ONode.deserialize(json);

        assert tmp instanceof Throwable;

        ((Throwable) tmp).printStackTrace();

        System.out.println("---------------------------");

        String json2 = ONode.serialize(tmp);

        System.out.println(json2);


        tmp = ONode.deserialize(json2);

        assert tmp instanceof Throwable;

        ((Throwable) tmp).printStackTrace();


        System.out.println("---------------------------");


        json2 = ONode.serialize(tmp);

        System.out.println(json2);
    }

    @Test
    public void test1() {
        Object tmp = ONode.deserialize(json);

        assert tmp instanceof Throwable;

        ((Throwable) tmp).printStackTrace();
    }

    @Test
    public void test2() {
        Object tmp = ONode.deserialize(json, Point.class);

        assert tmp instanceof Throwable;

        ((Throwable) tmp).printStackTrace();
    }
}
