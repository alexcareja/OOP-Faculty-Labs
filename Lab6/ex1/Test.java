package ex1;

interface Engine {
    int getFuelCapacity();
}

/*class Car {
    class OttoEngine implements Engine {
        private int fuelCapacity;

        public OttoEngine(int fuelCapacity) {
            this.fuelCapacity = fuelCapacity;
        }

        public int getFuelCapacity() {
            return fuelCapacity;
        }
    }

    public OttoEngine getEngine() {
        OttoEngine engine = new OttoEngine(11);
        return engine;
    }
}*/

/*class Car {
    public static Engine getEngine(final int fuelCapacity2) {
        return new Engine () {
            private int fuelCapacity = fuelCapacity2;

            public int getFuelCapacity() {
                return fuelCapacity;
            }
        };
    }
}*/

/*class Car {
    static class OttoEngine implements Engine {
        private int fuelCapacity;

        public OttoEngine(int fuelCapacity) {
            this.fuelCapacity = fuelCapacity;
        }

        public int getFuelCapacity() {
            return fuelCapacity;
        }
    }

    public OttoEngine getEngine() {
        OttoEngine engine = new OttoEngine(11);
        return engine;
    }
}*/

class Car {
    public Engine getEngine() {
        class OttoEngine implements Engine {
            private int fuelCapacity = 11;

            public int getFuelCapacity() {
                return fuelCapacity;
            }
        }

        return new OttoEngine();
    }
}

public class Test {
    public static void main(String[] args) {
        Car car = new Car();

        //Car.OttoEngine firstEngine = car.getEngine();
        //Engine firstEngine = Car.getEngine(11);
        //Engine firstEngine = new Car.OttoEngine(11);
        Engine firstEngine = car.getEngine();

        //Car.OttoEngine secondEngine = car.new OttoEngine(10);
        //Engine secondEngine =  Car.getEngine(10);
        //Engine secondEngine = new Car.OttoEngine(10);
        Engine secondEngine = car.getEngine();


        System.out.println(firstEngine.getFuelCapacity());
        System.out.println(secondEngine.getFuelCapacity());
    }
}