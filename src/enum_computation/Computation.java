package enum_computation;

public enum Computation {

    MULTIPY{
        public double perform(double x, double y){
            return x*y;
        }
    },
    DIVIDE{
        public double perform(double x, double y){
            return x/y;
        }
    },
    ADD{
        public double perform(double x, double y){
            return x+y;
        }
    },
    SUBTRACT{
        public double perform(double x, double y){
            return x-y;
        }
    };

    public abstract double perform(double x, double y);


//    public double perform(double x, double y){
//        switch (Computation.this.name()) {
//            case "ADD":
//                return x*y;
//            case "MULTIPY":
//                return x*y;
//            case "DIVIDE":
//                return x*y;
//            case "SUBTRACT":
//                return x*y;
//        }
//        return  0;
//    }

}
