class Simple {
        public static void main(String[] args) throws InterruptedException {
                Singleton o = Singleton.getInstance();
                System.out.println(o);
                System.out.println(o.hashCode());

                Thread.sleep(3000);

                Singleton p = Singleton.getInstance();
                System.out.println(p);
                System.out.println(p.hashCode());



        }
}
