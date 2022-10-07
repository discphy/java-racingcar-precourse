package racingcar.service;

import racingcar.value.OutputMessage;

public class OutputService {

    public static void printMessage(OutputMessage outputMessage) {
        System.out.println(outputMessage.getContent());
    }

    public static void inputArgumentError(IllegalArgumentException e) {
        System.err.println(OutputMessage.INPUT_ERROR + e.getMessage());
    }
}
