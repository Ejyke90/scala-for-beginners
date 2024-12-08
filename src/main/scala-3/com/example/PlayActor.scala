package com.example

import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.Behaviors

object PlayActor {
  def apply(): Behavior[String] = Behaviors.receiveMessage { message =>
    println(s"Received message: $message")
    Behaviors.same
  }
}
