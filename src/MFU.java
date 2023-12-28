public class MFU {public void print(int pageCount) {
    for (int i = 1; i <= pageCount; i++) {
        System.out.println("Отпечатано " + i + "стр");
        delay();
    }
}

    public void scan(int pageCount) {
        for (int i = 1; i <= pageCount; i++) {
            System.out.println("Отсканировано " + i + "стр");
            delay();
        }
    }

    private void delay() {
        try {
            Thread.sleep(1000); // Задержка в 1 секунду
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
