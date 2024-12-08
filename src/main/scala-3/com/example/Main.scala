package com.example

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import spray.json._

case class Payload(firstPerson: String, secondPerson: String, thirdPerson: String, fourthPerson: String)

object PayloadJsonProtocol extends DefaultJsonProtocol {
  implicit val payloadFormat: RootJsonFormat[Payload] = jsonFormat4(Payload.apply)
}

object Main extends App {
  import PayloadJsonProtocol._

  val system = ActorSystem(Behaviors.receiveMessage[String] { message =>
    println(s"Received message: $message")
    Behaviors.same
  }, "TheEfficientSystem")

  val payload = Payload("John", "James", "Key", "Peele")
  val jsonPayload = payload.toJson.compactPrint

  system ! jsonPayload
}