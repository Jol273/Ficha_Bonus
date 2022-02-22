package pt.ulusofona.cm.kotlin.challenge

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class DataCalendario(dataNoCalendario: String) {

    val date = LocalDate.parse(dataNoCalendario)
    val formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy")
    val dataPadrao = date.format(formatoData)

    override fun toString(): String {
        return dataPadrao.toString()
    }


}