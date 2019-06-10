package actor.basic;

import akka.actor.ActorRef;
import akka.actor.ActorSelection;
import akka.actor.ActorSystem;

/**
 * @author 陆昆
 * @create 2019-05-23 22:05
 **/
public class ActorMain {
    public static void main(String[] args) throws Exception{
        ActorSystem actorSystem = ActorSystem.create("ActorMain");
        ActorRef first =  actorSystem.actorOf(FirstActor.props(),"firstActor");
        // 通过路径获取对应actor，默认是创建在/usr下面
        ActorSelection actorSelection = actorSystem.actorSelection("/user/firstActor");
        actorSelection.tell("selection", first);
        // 另一种获取方式
        ActorRef send =  actorSystem.actorOf(SendActor.props(),"sendActor");
        // 通过tell方法向SendActor发送消息
        //send.tell("first send",  send);
    }
}
