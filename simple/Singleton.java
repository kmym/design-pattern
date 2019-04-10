class MultiThread {
        public static void main(String[] args) throws InterruptedException {
                SubThread sub1 = new SubThread();
                sub1.start();

                SubThread sub2 = new SubThread();
                sub2.start();
        }
}

class SubThread extends Thread {
        public void run() {
                try {
                        Singleton o = Singleton.getInstance();
                        System.out.println(o);
                        System.out.println(o.hashCode());
                } catch(InterruptedException e) {
                        throw new RuntimeException(e);
                }
        }
}
