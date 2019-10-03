package control_structure.match_expression

object matchDemo extends App{
  var day = "Monday"
  day.toLowerCase match {
    case "monday" => println("T.T")
    case "tuesday" => println(":'(")
    case "wednesday"=> println(":(")
    case "thursday"=> println(":|")
    case "friday"=> println(":)")
    case "saturday"=> println(":D")
    case "sunday"=>println("XD")
    case _=> println("invalid day") //default statement
  }
}
