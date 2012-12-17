package $package

import akka.actor.{Props, ActorSystem, ActorLogging, Actor}

object App {

  class Foo extends Actor with ActorLogging {
    protected def receive = {
      case foo:String => log.info(foo)
    }
  }

  def main(args: Array[String]) {
    val system = ActorSystem("mySystem")
    val foo = system.actorOf(Props[Foo])
    foo ! "yo!!"
    Thread.sleep(5000)
    system.shutdown()
  }
}