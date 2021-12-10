package rabbitRace;

public class Main {
    public static void main(String[] args) {

        for(int i=0;i<=9;i++) {
            if(i%2==0) {
                (new RabbitThread(i)).start();
            }else{
                new Thread(new RabbitRunnable(i)).start();

            }
        }
        Main challenge = new Main();
        challenge.race();
    }

    public Thread createThreadRabbit(int i) {
        return new RabbitThread(i);
    }

    public Thread createRunnableRabbit(int i) {
        RabbitRunnable runnable = new RabbitRunnable(i);
        return new Thread(runnable);
    }

    public Thread getCorrespondingRabbitImplementation(int startPosition) {
        return (startPosition % 2 == 0) ?
                createThreadRabbit(startPosition) :
                createRunnableRabbit(startPosition);
    }

    public void makeTheRabbitRun(Thread rabbit) {
        rabbit.start();
    }

    public void race() {
        for (int i = 0; i < 10; i++) {
            Thread rabbit = getCorrespondingRabbitImplementation(i);
            makeTheRabbitRun(rabbit);
        }
    }
}
