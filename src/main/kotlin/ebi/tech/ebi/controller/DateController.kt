package ebi.tech.ebi.controller

import ebi.tech.ebi.dto.DateResponse
import ebi.tech.ebi.service.DateService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class DateController {

  @Autowired
  lateinit var dateService: DateService

  @GetMapping("/date")
  fun currentDateTime(): ResponseEntity<DateResponse> {
    return ResponseEntity.ok(dateService.currentDateTime())
  }

}