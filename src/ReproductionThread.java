public class ReproductionThread  implements Runnable{
    AnimalService service = new AnimalService();
    @Override
    public void run() {
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
