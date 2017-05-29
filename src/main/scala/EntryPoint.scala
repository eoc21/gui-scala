import interface.ECMainWindow

/**
  * Created by edwardcannon on 29/05/2017.
  */
object EntryPoint {

  def main(args: Array[String]): Unit ={
    val ui = new ECMainWindow
    ui.visible = true

  }
}
