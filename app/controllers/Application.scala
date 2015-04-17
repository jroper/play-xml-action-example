package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    val items = Seq("item 1", "item 2", "item 3")
    Ok(
      <html>
        <head>
          <title>XML example</title>
        </head>
        <body>
          <h1>XML example</h1>
          <p>Here are some items:</p>
          <ul> {
            items.map { item =>
              <li>{item}</li>
            }
          } </ul>
        </body>
      </html>
    ).as("text/html")
  }

}
