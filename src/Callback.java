interface Callback {

    void onStarted();

    void onStopped(String cause);

    void onFinished(int code);
}