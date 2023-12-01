package basics

fun main() {
    /**
     *       Type    ||    Size (bits)   ||   Min value   ||   Max value
     *       ----------------------------------------------------------------
     *       Byte    ||    8             ||   -128        ||   127
     *       Short   ||    16            ||   -32768      ||   32767
     *       Int     ||    32            ||   -2^31       ||   2^31 - 1
     *       Long    ||    64            ||   -2^63       ||   2^63 - 1
     *       ----------------------------------------------------------------
     *       Float   ||    32            ||   1.4E-45     ||   3.4028235E38
     *       Double  ||    64            ||   4.9E-324    ||   1.7976931348623157E308
     */

    val minByteValue = Byte.MIN_VALUE
    val maxByteValue = Byte.MAX_VALUE

    val minShortValue = Short.MIN_VALUE
    val maxShortValue = Short.MAX_VALUE

    val minIntValue = Int.MIN_VALUE
    val maxIntValue = Int.MAX_VALUE

    val minLongValue = Long.MIN_VALUE
    val maxLongValue = Long.MAX_VALUE

    val minFloatValue = Float.MIN_VALUE
    val maxFloatValue = Float.MAX_VALUE

    val minDoubleValue = Double.MIN_VALUE
    val maxDoubleValue = Double.MAX_VALUE

    println("minByteValue: $minByteValue     --  maxByteValue: $maxByteValue")
    println("minShortValue: $minShortValue    --   maxShortValue: $maxShortValue")
    println("minIntValue: $minIntValue   --   maxIntValue: $maxIntValue")
    println("minLongValue: $minLongValue    --   maxLongValue: $maxLongValue")
    println("minFloatValue: $minFloatValue   --   maxFloatValue: $maxFloatValue")
    println("minDoubleValue: $minDoubleValue   --    maxDoubleValue: $maxDoubleValue")

    //--------------------------------------------------------------------------------------------------------------

    val longNumber = 123456789L
    val floatNumber = 123.456F
    val doubleNumber = 3.14

    println("longNumber: $longNumber \nfloatNumber: $floatNumber  \ndoubleNumber: $doubleNumber")

}