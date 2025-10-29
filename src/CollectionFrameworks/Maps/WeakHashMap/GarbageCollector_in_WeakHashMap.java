package CollectionFrameworks.Maps.WeakHashMap;

import java.lang.ref.WeakReference;

public class GarbageCollector_in_WeakHashMap {
        public static void main(String[] args) {
            WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("Apple", "16 pro max"));
            System.out.println(phoneWeakReference.get());
            System.gc();
            try {
                Thread.sleep(1000);
            } catch (Exception ignored) {
            }
            System.out.println(phoneWeakReference.get());

        }
    }

    class Phone {
        String brand;
        String model;

        public Phone(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        @Override
        public String toString() {
            return "Phone{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    '}';
        }
    }