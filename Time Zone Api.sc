
val url = "http://api.timezonedb.com/v2/get-time-zone?key=D4WN386QN67A&format=json&by=zone&zone=Asia/Karachi"
 val result = scala.io.Source.fromURL(url).mkString
println(result)