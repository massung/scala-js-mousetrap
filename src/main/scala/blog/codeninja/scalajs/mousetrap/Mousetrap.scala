package blog.codeninja.scalajs.mousetrap

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

import org.scalajs.dom

@js.native
@JSGlobal
object Mousetrap extends js.Object {
  type Command = js.Function1[dom.Event, _]
  type StopCallback = js.Function3[dom.Event, dom.Element, String, Boolean]
  type KeyHandler = js.Function3[Char, js.Array[Modifier], dom.Event, _]
  
  // Bind a key or series of keys to a function.
  def bind(key: |[String, js.Array[String]], command: Command, eventType: EventType = null): Unit = js.native

  // Unbind a key or sequence of keys to a command.
  def unbind(key: |[String, js.Array[String]]): Unit = js.native

  // Trigger whatever command is bound to a key.
  def trigger(key: String): Unit = js.native

  // Remove all bound key commands.
  def reset(): Unit = js.native

  // Add a set of custom key codes to the internal map.
  def addKeycodes(codes: js.Object): Unit = js.native

  // Override to determine whether or not Mousetrap should prevent an event
  // from triggering a command.
  var stopCallback: StopCallback = js.native

  // Called every time a key is pressed. It is not a good idea to override
  // this unless you know what you are doing!
  var handleKey: KeyHandler = js.native
}

sealed abstract class EventType(val value: String) {
  override def toString: String = value
}

case object KeyPress extends EventType("keypress")
case object KeyDown extends EventType("keydown")
case object KeyUp extends EventType("keyup")

sealed abstract class Modifier(val value: String) {
  override def toString: String = value
}

case object ShiftMod extends Modifier("shift")
case object ControlMod extends Modifier("control")
case object AltMod extends Modifier("alt")
case object MetaMod extends Modifier("meta")
case object OptionMod extends Modifier("option")
case object CommandMod extends Modifier("command")
