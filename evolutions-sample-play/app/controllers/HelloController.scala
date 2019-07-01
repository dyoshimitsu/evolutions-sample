package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}
import org.example.evolutions-sample.domain.Greeting

@Singleton
class HelloController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index() = Action { request: Request[AnyContent] =>
    val message = Greeting messageFor "evolutions-sample"
    Ok(message)
  }
}
