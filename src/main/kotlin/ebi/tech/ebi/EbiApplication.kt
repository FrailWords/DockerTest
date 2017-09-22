package ebi.tech.ebi

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class EbiApplication

fun main(args: Array<String>) {
    SpringApplication.run(EbiApplication::class.java, *args)
}
