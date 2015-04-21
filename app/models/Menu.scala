package models

import play.api.Play
import play.api.Play.current
import scala.xml.XML

case class MenuItem(name: String)

case class Menu(menuItems: Seq[MenuItem])

object Menu {
  def parseFrom(resource: String) = {
    val xml = XML.load(Play.classloader.getResource(resource))
    Menu((xml \ "menu_item").map { item =>
      MenuItem(item.text)
    })
  }
}
