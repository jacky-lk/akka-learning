package actor.remote.client;

import akka.actor.ActorSelection;
import akka.actor.ActorSystem;
import com.typesafe.config.ConfigFactory;

/**
 * @author 陆昆
 * @create 2019-06-10 08:58
 **/
public class AkkaClient {
    private static ActorSystem actorSystem;
    public static void main(String[] args) {
        actorSystem = ActorSystem.create("client", ConfigFactory.load("akka-client.conf"));
        ActorSelection heartBeat = actorSystem.actorSelection(AkkaUtil.getHeartbeatPath("30.5.124.243:2553"));
        heartBeat.tell("hello", null);
    }
}
