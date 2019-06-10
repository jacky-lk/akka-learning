package actor.remote.client;

/**
 * @author 陆昆
 * @create 2019-06-10 10:15
 **/
public class AkkaUtil {
    public static String getHeartbeatPath(String server) {
        return ClientConstants.SERVER_AKKA_PATH_PREFIX + server + ClientConstants.SERVER_AKKA_HEARBEAT_PATH;
    }
}
