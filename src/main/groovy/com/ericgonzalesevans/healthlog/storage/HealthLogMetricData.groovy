package com.ericgonzalesevans.healthlog.storage

/**
 * Contains user and measurement data to represent metric data.
 */
class HealthLogMetricData {
    private users
    private weights
    private heights

    //public no-arg constructor required for DynamoDBMapper marshalling
    HealthLogMetricData() { }

    /**
     * Creates a new instance of {@link HealthLogMetricData} with initialized but empty user and
     * measurement information.
     *
     * @return
     */
    static HealthLogMetricData newInstance() {
        HealthLogMetricData newInstance = new HealthLogMetricData()
        return newInstance
    }
}
