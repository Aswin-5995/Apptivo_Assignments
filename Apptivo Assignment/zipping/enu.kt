enum class DAYS{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
fun main(args:Array<String>)
{
    for(day in DAYS.values())
   {
        println("${day.ordinal} = ${day.name}")
    }
    println("${DAYS.valueOf("FRIDAY")}")
    
}