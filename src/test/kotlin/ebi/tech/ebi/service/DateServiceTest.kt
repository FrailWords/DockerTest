package ebi.tech.ebi.service

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.runners.MockitoJUnitRunner
import java.time.Clock
import java.time.Instant
import java.time.ZoneId
import java.util.*

@RunWith(MockitoJUnitRunner::class)
class DateServiceTest {

  @InjectMocks
  lateinit var dateService: DateService

  @Before
  fun setUp() {
    dateService.clock = Clock.fixed(Instant.ofEpochMilli(1506078543096), ZoneId.systemDefault())
  }

  @Test
  fun shouldReturnCurrentDateTimeInRequiredFormat() {
    val systemZoneId = TimeZone.getDefault().getDisplayName(false, TimeZone.SHORT)
    assertEquals("Fri Sep 22 16:39:03 $systemZoneId 2017", dateService.currentDateTime().date)
  }

}