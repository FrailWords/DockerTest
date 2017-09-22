package ebi.tech.ebi.controller

import ebi.tech.ebi.dto.DateResponse
import ebi.tech.ebi.service.DateService
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.BDDMockito.given
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest(DateController::class)
@RunWith(SpringRunner::class)
class DateControllerTest {

  @MockBean
  lateinit var dateService: DateService

  @Autowired
  lateinit var mockMvc: MockMvc

  @Test
  fun shouldReturnCurrentDate() {
    given(dateService.currentDateTime()).willReturn(DateResponse("Fri Sep 22 11:09:03 GMT 2017"))

    mockMvc.perform(MockMvcRequestBuilders.get("/date"))
        .andExpect(status().isOk)
        .andExpect(content().string("{\"date\":\"Fri Sep 22 11:09:03 GMT 2017\"}"))
  }
}