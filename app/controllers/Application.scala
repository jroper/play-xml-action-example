package controllers

import models.Menu
import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    val menu = Menu.parseFrom("menu.xml")
    Ok(views.html.index(menu))
  }
}
