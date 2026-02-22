package da.pinci.springbootscrap

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class SpringBootScrapApplication

fun main(args: Array<String>) {
    runApplication<SpringBootScrapApplication>(*args)
}
