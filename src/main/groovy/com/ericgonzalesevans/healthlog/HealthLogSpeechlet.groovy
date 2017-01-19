package com.ericgonzalesevans.healthlog

import com.amazon.speech.speechlet.IntentRequest
import com.amazon.speech.speechlet.LaunchRequest
import com.amazon.speech.speechlet.Session
import com.amazon.speech.speechlet.SessionEndedRequest
import com.amazon.speech.speechlet.SessionStartedRequest
import com.amazon.speech.speechlet.Speechlet
import com.amazon.speech.speechlet.SpeechletException
import com.amazon.speech.speechlet.SpeechletResponse

/**
 * Created by ericgonzales on 1/16/17.
 *
 * This simple sample has no external dependencies or session management, and shows the most basic
 * example of how to handle Alexa Skill requests.
 *
 */
class HealthLogSpeechlet implements Speechlet {
    void onSessionStarted(SessionStartedRequest request, Session session) throws SpeechletException {
        // any initialization logic goes here
    }

    SpeechletResponse onLaunch(LaunchRequest request, Session session) throws SpeechletException {
        return HealthLogManager.getLaunchIntent() //gives a new fact as soon as the app is launched
    }

    SpeechletResponse onIntent(IntentRequest request, Session session) throws SpeechletException {
        def intent = request.getIntent()
        def intentName = (intent != null) ? intent.getName() : null //todo: elvis compare here?

        switch (intentName) {
            case "AddUserIntent":
                return HealthLogManager.getAddUserResponse(intent, session)
                break
            case "AMAZON.HelpIntent":
                return HealthLogManager.getHelpResponse(intent, session)
                break
            case "AMAZON.CancelIntent":
            case "AMAZON.StopIntent":
                return HealthLogManager.getGoodbyeResponse(intent, session)
                break
            default:
                throw new SpeechletException("Invalid Intent")
                break
        }
    }

    void onSessionEnded(SessionEndedRequest request, Session session) throws SpeechletException {
        // any cleanup logic goes here
    }
}
