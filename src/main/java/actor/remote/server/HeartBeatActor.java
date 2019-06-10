package actor.remote.server;

import akka.actor.Props;
import akka.actor.UntypedActor;

/**
 * @author 陆昆
 * @create 2019-06-10 10:10
 **/
public class HeartBeatActor extends UntypedActor {

    public static Props props() {
        return Props.create(HeartBeatActor.class);
    }

    public void onReceive(Object o) throws Throwable {
        System.out.println("[HeartBeatActor]receive msg: " + o);
    }
}
