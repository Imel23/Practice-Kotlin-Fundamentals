fun main() {
    // Fill in the code.
    fun cToF(initialMeasurement:Double):Double{
        return 9.0*initialMeasurement/5.0 + 32
    }
    fun kToC(initialMeasurement:Double):Double{
        return initialMeasurement - 273.15
    }
    fun fToK(initialMeasurement:Double):Double{
        return 5.0*(initialMeasurement - 32.0)/9.0 + 273.15
    }
    printFinalTemperature(27.0,"Celsius","Fahrenheit", ::cToF)
    printFinalTemperature(350.0,"Kelvin","Celsius", ::kToC)
    printFinalTemperature(10.0,"Fahrenheit","Kelvin", ::fToK)
}



fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double)->Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}