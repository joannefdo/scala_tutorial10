object TemperatureConverter {
  def calculateAverage(temperatures: List[Double]): Double = {
    val fahrenheitTemperatures = temperatures.map(celsius => (celsius * 9/5) + 32)
    
    val totalFahrenheit = fahrenheitTemperatures.reduce((acc, temp) => acc + temp)
    val averageFahrenheit = totalFahrenheit / fahrenheitTemperatures.length
    
    averageFahrenheit
  }

  def main(args: Array[String]): Unit = {
    val inputTemperatures = List(0.0, 10.0, 20.0, 30.0)
    val averageFahrenheit = calculateAverage(inputTemperatures)
    
    println(s"Average Fahrenheit temperature: $averageFahrenheit")
  }
}
