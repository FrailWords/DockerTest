package ebi.tech.ebi.service

import ebi.tech.ebi.dto.DateResponse
import org.springframework.stereotype.Service
import java.time.Clock
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

@Service
class DateService {

  var clock : Clock = Clock.systemDefaultZone()

  companion object {
    val DATE_FORMAT : String = "EEE MMM dd HH:mm:ss z yyyy"
  }

  fun currentDateTime() : DateResponse {
    return DateResponse(DateTimeFormatter.ofPattern(DATE_FORMAT).format(ZonedDateTime.now(clock)))
  }

}