package da.pinci.springbootscrap.scheduled

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

/**
 * https://spring.io/guides/gs/scheduling-tasks
 *
 * ```
 * curl 'http://localhost:8089/manage/scheduledtasks' -i -X GET
 * ```
 */
@Component
class DemoScheduledManager {
    @Scheduled(fixedRate = 10000)
    fun reportCurrentTimePer10Sec() {
        println("10Sec: The time is now ${System.currentTimeMillis()}")
    }

    @Scheduled(fixedRate = 20000)
    fun reportCurrentTimePer20Sec() {
        println("20Sec: The time is now ${System.currentTimeMillis()}")
    }

    @Scheduled(fixedRate = 40000)
    fun reportCurrentTimePer40Sec() {
        println("40Sec: The time is now ${System.currentTimeMillis()}")
        // Each task runs in a separate thread,
        // so even if an exception is thrown in one task,
        // it does not affect other tasks.
        throw RuntimeException()
    }
}
