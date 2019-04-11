import java.util.Date;
import java.text.SimpleDateFormat;

public class Singleton {

        private static Singleton instance;
        private String name;

        private Singleton() {
                SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmss");
                this.name = "Singleton_" + fmt.format(new Date());
        }

        public static Singleton getInstance() {
                if (Singleton.instance == null) {
                        Singleton.instance = new Singleton();
                }
                return Singleton.instance;
                // return new Singleton();
        }

        public String toString() {
                return this.name;
        }
}
