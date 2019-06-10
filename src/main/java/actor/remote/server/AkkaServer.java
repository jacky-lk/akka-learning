package actor.remote.server;

import akka.actor.ActorSystem;
import com.typesafe.config.ConfigFactory;

/**
 * @author 陆昆
 * @create 2019-06-10 08:48
 **/
public class AkkaServer {
    private static ActorSystem actorSystem;

    public static void main(String[] args) {
        actorSystem = ActorSystem.create("server", ConfigFactory.load("akka-server.conf"));
        actorSystem.actorOf(HeartBeatActor.props(), "heartbeat");
    }
}
