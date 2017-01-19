package com.ericgonzalesevans.healthlog

import com.amazon.speech.speechlet.SpeechletResponse
import com.amazon.speech.ui.PlainTextOutputSpeech
import com.amazon.speech.ui.Reprompt
import com.ericgonzalesevans.healthlog.util.HealthLogTextUtil

/**
 * Controls the flow of the application
 * Handles intents
 */
class HealthLogManager {
    //Greets the user
    static getLaunchIntent(intent, session) {
        PlainTextOutputSpeech speech = new PlainTextOutputSpeech()
        speech.setText(HealthLogTextUtil.GREETING_TEXT)

        /**// Create the Simple card content.
        def card = new SimpleCard()
        card.setTitle("GroovyFacts")
        card.setContent(groovyFact)**/

        return SpeechletResponse.newTellResponse(speech)
    }

    //Help the user
    static getHelpResponse(intent, session) {
        PlainTextOutputSpeech speech = new PlainTextOutputSpeech()
        speech.setText(HealthLogTextUtil.HELP_TEXT)

        //Create reprompt
        Reprompt reprompt = new Reprompt()
        reprompt.setOutputSpeech(speech)

        return SpeechletResponse.newAskResponse(speech, reprompt)
    }

    //Say goodbye to user
    static getGoodbyeResponse(intent, session) {
        PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech()
        outputSpeech.setText(HealthLogTextUtil.GOODBYE_TEXT)
        return SpeechletResponse.newTellResponse(outputSpeech)
    }

    //Add new user
    static getAddUserResponse(intent, session) {

    }
}
