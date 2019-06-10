package actor.basic;

import akka.actor.Props;
import akka.actor.UntypedActor;

/**
 * @author 陆昆
 * @create 2019-05-23 21:34
 **/
public class FirstActor extends UntypedActor {
    /**
     * 在UntypedActor类里面提供静态工厂方法,该方法帮助创建尽可能接近角色定义的合适Props类
     *
     * @return
     */
    public static Props props() {
        return Props.create(FirstActor.class);
    }

    @Override
    public void onReceive(Object message) throws Throwable {
        if (message instanceof String) {
            System.out.println((String)message);
            //getSender().tell("receive msg:"+message, getSelf());
        }
    }

    @Override
    public void preStart() throws Exception {
        System.out.println("preStart");
    }

    @Override
    public void postStop() throws Exception {
        System.out.println("postStop");
    }

}
