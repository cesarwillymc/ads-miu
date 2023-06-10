public enum ActionsEnum {
    DISABLE_REDO,
    ENABLE_REDO,
    ENABLE_UNDO,
    DISABLE_UNDO,
    UPDATE_TEXT;

    ActionsEnum(){

    }
    private String value;

    ActionsEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
