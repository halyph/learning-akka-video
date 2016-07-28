package org.elu.akka

import akka.actor.{Actor, Props}
import org.elu.akka.Worker.Work

/** Created by luhtonen on 12/04/16. */
class Worker extends Actor {

  override def preStart() = {
    println(s"Worker name is ${self}")
  }

  def receive = {
    case msg: Work =>
      println(s"I received Work Message and My ActorRef: ${self}")
  }
}

object Worker {
  case class Work()
}