package com.ericgonzalesevans.healthlog

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler

/**
 * Created by ericgonzales on 1/16/17.
 *
 * This class could be the handler for an AWS Lambda function powering an Alexa Skills Kit
 * experience. To do this, simply set the handler field in the AWS Lambda console to
 * "com.ericgonzalesevans.HealthLogSpeechletRequestStreamHandler" For this to work, you'll also need to build
 * this project using the {@code lambda-compile} Ant task and upload the resulting zip file to power
 * your function.
 */
class HealthLogSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {
    private static final Set<String> supportedApplicationIds

    static {
        /*
         * This Id can be found on https://developer.amazon.com/edw/home.html#/ "Edit" the relevant
         * Alexa Skill and put the relevant Application Ids in this Set.
         */
        supportedApplicationIds = new HashSet<String>()
        //todo: make this an env. var
        supportedApplicationIds.add("amzn1.ask.skill.[unique-id-here]")
    }

    HealthLogSpeechletRequestStreamHandler() {
        super(new HealthLogSpeechlet(), supportedApplicationIds)
    }
}
