package racingcar.value;

public enum OutputMessage {

    INPUT_CAR("경주할자동차이름을입력하세요.(이름은쉼표(,)기준으로구분)"),
    INPUT_TRACK("시도할회수는몇회인가요?"),
    INPUT_ERROR("[ERROR] : ");

    private final String content;

    OutputMessage(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
