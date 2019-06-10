package actor.basic;

import akka.actor.Props;
import akka.actor.UntypedActor;

/**
 * @author 陆昆
 * @create 2019-05-23 22:22
 **/
public class SendActor extends UntypedActor {
    public static Props props() {
        return Props.create(FirstActor.class);
    }

    public void onReceive(Object message) throws Throwable {
        if (message instanceof String) {
            System.out.println((String)message);
            //getSender().tell("receive msg:"+message, getSelf());
        }
    }
}
