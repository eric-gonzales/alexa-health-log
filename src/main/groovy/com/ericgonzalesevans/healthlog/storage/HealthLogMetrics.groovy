package com.ericgonzalesevans.healthlog.storage

import com.amazon.speech.speechlet.Session

/**
 * Represents a metric set.
 */
final class HealthLogMetrics {
    private Session session
    private HealthLogMetricData metricData

    private HealthLogMetrics() { }

    static HealthLogMetrics newInstance(Session session, HealthLogMetricData metricData) {
        HealthLogMetrics metrics = new HealthLogMetrics()
        metrics.setSession(session)
        metrics.setMetricData(metricData)
        return metrics
    }

    def hasUsers() { }

    def hasUser(userName) { }

    def hasWeights() { }

    def hasHeights() { }

    def addUser(userName) { }

    def addWeightForUser(userName, weight) { }

    def addHeightForUser(userName, height) { }

    def getNumberOfUsers() { }

    def getWeightForUser(userName) { }

    def getHeightForUser(userName) { }

    def resetWeights() { }

    def resetHeights() { }
}