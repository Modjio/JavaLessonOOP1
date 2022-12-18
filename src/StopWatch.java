class StopWatch {
    private long startTime, endTime;

    /**
     * Безаргументный конструктор, который инициализирует startTime с текущим временем
     */
    public long getStartTime() {
        start();
        return startTime;
    }

    /**
     * возвращаем время окончания
     */
    public long getEndTime() {
        stop();
        return endTime;
    }

    /**
     * Метод с именем start(), который сбрасывает startTime до текущего времени
     */
    private void start() {
        startTime = System.currentTimeMillis();
    }

    /**
     * Метод с именем stop(), который присваивает endTime текущее время
     */
    private void stop() {
        endTime = System.currentTimeMillis();
    }

    /**
     * Метод с именем getElapsedTime(), который возвращает прошедшее время на секундомере в миллисекундах.
     */
    public long getElapsedTime() {
        return endTime - startTime;
    }
}
